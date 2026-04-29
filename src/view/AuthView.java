package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class AuthView extends JFrame implements ActionListener {

	public JMenuItem itemLogin, itemRegistrar;
	public JTextField txtCorreo;
	public JPasswordField txtPassword;
	public JPasswordField txtConfirmPassword; 
	public JButton btnAcceder, btnCrear;
	public JButton btnRegistrar; 
	public JButton btnVolverLogin; 

	public AuthView() {
		dasclogin();
	}
			
	public void dasclogin (){
			
			this.setTitle("Login - UABCS");
	        this.setSize(850, 550);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	        this.setLayout(null);
	        this.getContentPane().setBackground(Color.WHITE);
	        
	        JMenuBar mb = new JMenuBar();
	        
	        JMenu mCuenta = new JMenu("Cuenta");
	        itemLogin = new JMenuItem("Login");
	        itemRegistrar = new JMenuItem("Registro");
	        JMenuItem itemRecuperar = new JMenuItem("Recuperación de cuenta");
	        
	        itemLogin.addActionListener(this);
	        itemRegistrar.addActionListener(this);
	        
	        mCuenta.add(itemLogin); 
	        mCuenta.add(itemRegistrar); 
	        mCuenta.add(itemRecuperar);

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
	        
	        this.setVisible(true);
	}

	public void dascregistro() {
		// Limpiar la ventana
		this.getContentPane().removeAll();
		this.setTitle("Registro - UABCS");
		this.setSize(850, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.WHITE);

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

		JLabel lblRegistro = new JLabel("Regístrate en el panel administrador");
		lblRegistro.setFont(new Font("Arial", Font.PLAIN, 18));
		lblRegistro.setBounds(50, 110, 350, 30);
		add(lblRegistro);

		JLabel l1 = new JLabel("Correo electrónico");
		l1.setBounds(50, 160, 150, 20);
		add(l1);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(50, 185, 350, 45);
		txtCorreo.setBackground(new Color(225, 236, 233));
		add(txtCorreo);

		JLabel l2 = new JLabel("Contraseña");
		l2.setBounds(50, 240, 150, 20);
		add(l2);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(50, 265, 350, 45);
		txtPassword.setBackground(new Color(225, 236, 233));
		add(txtPassword);

		JLabel l3 = new JLabel("Confirmar contraseña");
		l3.setBounds(50, 320, 150, 20);
		add(l3);

		txtConfirmPassword = new JPasswordField();
		txtConfirmPassword.setBounds(50, 345, 350, 45);
		txtConfirmPassword.setBackground(new Color(225, 236, 233));
		add(txtConfirmPassword);

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(50, 410, 350, 40);
		btnRegistrar.setBackground(Color.WHITE);
		btnRegistrar.setBorder(new LineBorder(Color.BLACK, 3));
		btnRegistrar.setFont(new Font("Arial", Font.BOLD, 14));
		btnRegistrar.addActionListener(this);
		add(btnRegistrar);

		btnVolverLogin = new JButton("Volver al login");
		btnVolverLogin.setBounds(125, 465, 200, 30);
		btnVolverLogin.addActionListener(this);
		add(btnVolverLogin);

		try {
			ImageIcon imagen = new ImageIcon("src/images/perdedor1.jpg");
			Image imgEscalada = imagen.getImage().getScaledInstance(380, 450, Image.SCALE_SMOOTH);
			JLabel etiquetaImagen = new JLabel(new ImageIcon(imgEscalada));
			etiquetaImagen.setBounds(430, 30, 380, 450);
			add(etiquetaImagen);
		} catch (Exception e) {
			System.out.println("No se encontró perdedor1.jpg en src/images/");
		}

		this.revalidate();
		this.repaint();
		this.setVisible(true);
	}

	public void addLoginListener(ActionListener listener) {
		btnAcceder.addActionListener(listener);
	}

	public void addRegisterListener(ActionListener listener) {
		if (btnRegistrar != null) {
			btnRegistrar.addActionListener(listener);
		}
	}

	public String getUsername() {
		return txtCorreo != null ? txtCorreo.getText() : "";
	}

	public String getPassword() {
		return txtPassword != null ? new String(txtPassword.getPassword()) : "";
	}

	public String getConfirmPassword() {
		return txtConfirmPassword != null ? new String(txtConfirmPassword.getPassword()) : "";
	}

	public void showMessage(String message, boolean success) {
		javax.swing.JOptionPane.showMessageDialog(this, message,
			success ? "Éxito" : "Error",
			success ? javax.swing.JOptionPane.INFORMATION_MESSAGE : javax.swing.JOptionPane.ERROR_MESSAGE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrear || e.getSource() == itemRegistrar) {
			dascregistro();
		} else if (e.getSource() == btnVolverLogin || e.getSource() == itemLogin) {
			dasclogin();
		}
	}
}