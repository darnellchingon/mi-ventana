package unidad3;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class dasclogin extends JFrame implements ActionListener {

    private JTextField txtCorreo;
    private JPasswordField txtPassword;
    private JButton btnAcceder, btnCrear;
    private JMenuItem itemAcceder, itemRegistrar;

    public dasclogin() {
        setTitle("Login - UABCS");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        //MENu
        JMenuBar mb = new JMenuBar();
        JMenu mCuenta = new JMenu("Cuenta");
        itemAcceder = new JMenuItem("Acceder");
        itemRegistrar = new JMenuItem("Registrar");
        itemAcceder.addActionListener(this);
        itemRegistrar.addActionListener(this);
        mCuenta.add(itemAcceder); mCuenta.add(itemRegistrar);
        mb.add(new JMenu("Archivo")); mb.add(new JMenu("Ayuda")); mb.add(mCuenta);
        setJMenuBar(mb);

        // TEXTO
        JLabel lblUabcs = new JLabel("UABCS - DASC");
        lblUabcs.setFont(new Font("Arial", Font.BOLD, 28));
        lblUabcs.setBounds(50, 30, 300, 40);
        add(lblUabcs);

        JLabel lblLema = new JLabel("Sabiduría como meta, patria como destino");
        lblLema.setFont(new Font("Arial", Font.ITALIC, 13));
        lblLema.setBounds(50, 65, 350, 20);
        add(lblLema);

        JLabel lblAdmin = new JLabel("Ingresa al panel administrador");
        lblAdmin.setFont(new Font("Arial", Font.PLAIN, 18));
        lblAdmin.setBounds(50, 110, 300, 30);
        add(lblAdmin);

        // --- CAMPOS ---
        JLabel l1 = new JLabel("Correo electrónico");
        l1.setBounds(50, 160, 150, 20);
        add(l1);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(50, 185, 350, 40);
        txtCorreo.setBackground(new Color(230, 240, 240)); 
        add(txtCorreo);

        JLabel l2 = new JLabel("Contraseña");
        l2.setBounds(50, 240, 150, 20);
        add(l2);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(50, 265, 350, 40);
        txtPassword.setBackground(new Color(230, 240, 240));
        add(txtPassword);

        // BOTONES
        btnAcceder = new JButton("ACCEDER");
        btnAcceder.setBounds(50, 340, 350, 45);
        btnAcceder.setBackground(Color.WHITE);
        btnAcceder.setBorder(new LineBorder(Color.BLACK, 3));
        btnAcceder.setFont(new Font("Arial", Font.BOLD, 14));
        btnAcceder.addActionListener(this);
        add(btnAcceder);

        btnCrear = new JButton("Crea una aquí");
        btnCrear.setBounds(125, 420, 200, 30);
        btnCrear.addActionListener(this);
        add(btnCrear);

     
        try {
            ImageIcon imagen = new ImageIcon("src/images/perdedor1.jpg");
            Image imgEscalada = imagen.getImage().getScaledInstance(380, 450, Image.SCALE_SMOOTH);
            JLabel etiquetaImagen = new JLabel(new ImageIcon(imgEscalada));
            etiquetaImagen.setBounds(430, 30, 380, 450);
            add(etiquetaImagen);
        } catch (Exception e) {
            System.out.println("Error al cargar imagen: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCrear || e.getSource() == itemRegistrar) {
            new Registro().setVisible(true);
            this.dispose();
        }
    }
}