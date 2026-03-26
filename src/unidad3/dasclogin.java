package unidad3;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class dasclogin extends JFrame implements ActionListener {

    private JTextField txtCorreo;
    private JPasswordField txtPassword;
    private JButton btnAcceder, btnCrear;
    private JMenuItem itemLogin, itemRegistrar;

    public dasclogin() {
        setTitle("Login - UABCS");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

       
        JMenuBar mb = new JMenuBar();

        
        JMenu mCuenta = new JMenu("Cuenta");
        itemLogin = new JMenuItem("Login");
        itemRegistrar = new JMenuItem("Registro");
        JMenuItem itemRecuperar = new JMenuItem("Recuperación de cuenta");
        itemLogin.addActionListener(this);
        itemRegistrar.addActionListener(this);
        mCuenta.add(itemLogin); mCuenta.add(itemRegistrar); mCuenta.add(itemRecuperar);

     
        JMenu mUsuarios = new JMenu("Usuarios");
        mUsuarios.add(new JMenuItem("Alta"));
        mUsuarios.add(new JMenuItem("Baja"));
        mUsuarios.add(new JMenuItem("Consultar"));

        
        JMenu mAyuda = new JMenu("Ayuda");
        mAyuda.add(new JMenuItem("¿Cómo crear un usuario?"));
        mAyuda.add(new JMenuItem("¿Cómo acceder al sistema?"));
        mAyuda.add(new JMenuItem("¿Qué pasa si olvidé mi contraseña?"));

        mb.add(mCuenta); mb.add(mUsuarios); mb.add(mAyuda);
        setJMenuBar(mb);

        
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

      
        JLabel l1 = new JLabel("Correo electrónico");
        l1.setBounds(50, 160, 150, 20);
        add(l1);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(50, 185, 350, 45);
        txtCorreo.setBackground(new Color(225, 236, 233)); 
        add(txtCorreo);

        JLabel l2 = new JLabel("Contraseña");
        l2.setBounds(50, 250, 150, 20);
        add(l2);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(50, 275, 350, 45);
        txtPassword.setBackground(new Color(225, 236, 233));
        add(txtPassword);

        
        btnAcceder = new JButton("ACCEDER");
        btnAcceder.setBounds(50, 360, 350, 40);
        btnAcceder.setBackground(Color.WHITE);
        btnAcceder.setBorder(new LineBorder(Color.BLACK, 3));
        btnAcceder.setFont(new Font("Arial", Font.BOLD, 14));
        btnAcceder.addActionListener(this);
        add(btnAcceder);

        JLabel lblPregunta = new JLabel("¿Aún no tienes cuenta?");
        lblPregunta.setBounds(150, 410, 200, 20);
        add(lblPregunta);

        btnCrear = new JButton("Crea una aquí");
        btnCrear.setBounds(125, 435, 200, 30);
        btnCrear.addActionListener(this);
        add(btnCrear);

    
        try {
            ImageIcon imagen = new ImageIcon("src/images/perdedor1.jpg");
            Image imgEscalada = imagen.getImage().getScaledInstance(380, 450, Image.SCALE_SMOOTH);
            JLabel etiquetaImagen = new JLabel(new ImageIcon(imgEscalada));
            etiquetaImagen.setBounds(430, 30, 380, 450);
            add(etiquetaImagen);
        } catch (Exception e) {
            System.out.println("No se encontró perdedor1.jpg en src/images/");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCrear || e.getSource() == itemRegistrar) {
            new Registro().setVisible(true);
            this.dispose();
        }
        if (e.getSource() == btnAcceder) {
            JOptionPane.showMessageDialog(this, "Iniciando sesión...");
        }
    }
}