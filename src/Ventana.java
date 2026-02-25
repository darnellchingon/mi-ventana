

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public Ventana () {
		
		this.setVisible(true);
		this.setSize(500, 500);
		//this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		//this.setBounds(200,200,500,500);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setLocationRelativeTo(null);
		this.setTitle("ola bro");
		this.setLayout(null);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		//this.setOpacity(1);
		
		JPanel loginContainer = new JPanel();
		loginContainer.setSize(400,400);
		loginContainer.setLocation(50,50);
		loginContainer.setBackground(Color.pink);
		loginContainer.setOpaque(true);
		loginContainer.setLayout(null);
		this.add(loginContainer);
		
		
		
		//añadiendo elementos probando committsqsdfqwdqwdqwdqw
		//añadir un jlabel 
		
		JLabel tagtittle = new JLabel();
		tagtittle.setText("welcome ");
		tagtittle.setSize(100,30);
		tagtittle.setLocation(145,10);
		tagtittle.setOpaque(true);
		tagtittle.setVerticalAlignment(JLabel.CENTER);
		tagtittle.setHorizontalAlignment(JLabel.CENTER);
		tagtittle.setFont(new Font("Arial",Font.PLAIN,22));
		//this.add(tagtittle);
		loginContainer.add((tagtittle));
		
		JLabel texto = new JLabel();
		texto.setText("password");
		texto.setSize(100,30);
		texto.setLocation(60,160);
		texto.setOpaque(false);
		texto.setVerticalAlignment(JLabel.CENTER);
		texto.setHorizontalAlignment(JLabel.CENTER);
		texto.setFont(new Font("Arial",Font.PLAIN,22));
		//this.add(tagtittle);
		loginContainer.add((texto));
		
		JLabel qwerty = new JLabel();
		qwerty.setText("User");
		qwerty.setSize(100,30);
		qwerty.setLocation(40,60);
		qwerty.setOpaque(false);
		qwerty.setVerticalAlignment(JLabel.CENTER);
		qwerty.setHorizontalAlignment(JLabel.CENTER);
		qwerty.setFont(new Font("Arial",Font.PLAIN,22));
		//this.add(tagtittle);
		loginContainer.add((qwerty));
		
		
		
		//this.add(tagtittle);fascvbav dvw	D
		JTextField emailImput = new JTextField();
		emailImput.setSize(280,40);
		emailImput.setLocation(60,100);
		loginContainer.add(emailImput);
		
		JPasswordField contra = new JPasswordField();
		contra.setSize(280,40);
		contra.setLocation(60,200);
		loginContainer.add(contra);
		
		
		JCheckBox rememberme = new JCheckBox("hello world");
		
		rememberme.setSize(140,40);
		rememberme.setLocation(60,300);
		rememberme.setOpaque(false);
		rememberme.setBorder(null);
		
		loginContainer.add(rememberme);
		
		JButton accesBtn = new JButton();
		accesBtn.setText("log in");
		accesBtn.setFont(new Font("Arial",Font.ITALIC,18));
		accesBtn.setBounds(120,350,200,40);
		loginContainer.add(accesBtn);
		
		
		
		this.repaint();
		
		
	}
}
