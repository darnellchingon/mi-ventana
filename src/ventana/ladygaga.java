package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ladygaga extends JFrame {

    private JTextField txtUsuario;
    private JTextField txtCorreo;
    private JTextArea txtDescripcion;

    public ladygaga() {

        setTitle("Sistema");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu menuInicio = new JMenu("Inicio");
        JMenu menuEstudiantes = new JMenu("Estudiantes");

        JMenu menuProfesores = new JMenu("Profesores");
        JMenuItem nuevoRegistro = new JMenuItem("Nuevo registro");
        JMenuItem consulta = new JMenuItem("Consulta");
        menuProfesores.add(nuevoRegistro);
        menuProfesores.add(consulta);

        JMenu menuCarga = new JMenu("Carga");

        JMenu menuAyuda = new JMenu("Ayuda");

        menuBar.add(menuInicio);
        menuBar.add(menuEstudiantes);
        menuBar.add(menuProfesores);
        menuBar.add(menuCarga);
        menuBar.add(menuAyuda);

        setJMenuBar(menuBar);

        getContentPane().setBackground(new Color(0, 190, 190));

        JLabel titulo = new JLabel("Registro nuevo usuario");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(Color.BLACK);
        titulo.setBounds(180, 30, 350, 40);
        add(titulo);

        JLabel lblUsuario = new JLabel("Ingrese el nombre de usuario:");
        lblUsuario.setOpaque(true);
        lblUsuario.setBackground(Color.BLACK);
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setBounds(180, 90, 260, 25);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(180, 120, 260, 30);
        add(txtUsuario);

        JLabel lblCorreo = new JLabel("Ingrese el correo electrónico:");
        lblCorreo.setOpaque(true);
        lblCorreo.setBackground(Color.BLACK);
        lblCorreo.setForeground(Color.WHITE);
        lblCorreo.setBounds(180, 160, 260, 25);
        add(lblCorreo);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(180, 190, 260, 30);
        add(txtCorreo);

        JLabel lblDescripcion = new JLabel("Escriba una descripción:");
        lblDescripcion.setOpaque(true);
        lblDescripcion.setBackground(Color.BLACK);
        lblDescripcion.setForeground(Color.WHITE);
        lblDescripcion.setBounds(180, 230, 260, 25);
        add(lblDescripcion);

        txtDescripcion = new JTextArea();
        txtDescripcion.setBounds(180, 260, 260, 80);
        add(txtDescripcion);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(300, 370, 120, 30);
        add(btnVolver);

        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });

        setVisible(true);
    }

    private void limpiarCampos() {
        txtUsuario.setText("");
        txtCorreo.setText("");
        txtDescripcion.setText("");
    }
}