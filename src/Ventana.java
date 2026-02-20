

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
		
		//añadiendo elementos
		//añadir un jlabel 
		JLabel tagtittle = new JLabel();
		tagtittle.setText("bienvenido");
		tagtittle.setSize(100,40);
		tagtittle.setLocation(175,20);
		tagtittle.setOpaque(true);
		tagtittle.setVerticalAlignment(JLabel.CENTER);
		tagtittle.setHorizontalAlignment(JLabel.CENTER);
		tagtittle.setFont(new Font("Arial",Font.PLAIN,22));
		this.add(tagtittle);
	}
}
