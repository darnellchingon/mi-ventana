package ventana;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;



public class Interes extends JFrame {
	
	public Interes() {
		this.setSize(400,300);
		this.setTitle("Calculando el interes");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		JLabel titulo = new JLabel("interés", JLabel.CENTER);
		titulo.setFont(new Font("Arial", Font.BOLD, 18));
		this.add(titulo, BorderLayout.NORTH);
		titulo.setOpaque(false);
		// PANEL ENTRADA 
		JPanel panelEntrada = new JPanel(new GridLayout(3,2,10,10));
		panelEntrada.setBorder(BorderFactory.createTitledBorder("Datos de Entrada"));
		panelEntrada.setBackground(Color.gray);

		panelEntrada.add(new JLabel("capital"));
		panelEntrada.add(new JTextField());

		panelEntrada.add(new JLabel("tiempo"));
		panelEntrada.add(new JTextField());

		panelEntrada.add(new JLabel("tasa interes"));
		panelEntrada.add(new JTextField());

		this.add(panelEntrada, BorderLayout.CENTER);
		
		
		// BOTONES
		
		JPanel botones = new JPanel(new FlowLayout());

		JButton calcular = new JButton("calcular");
		JButton cancelar = new JButton("cancelar");

		botones.add(calcular);
		botones.add(cancelar);

		this.add(botones, BorderLayout.EAST);

		JPanel resultados = new JPanel(new GridLayout(2,2,10,10));
		resultados.setBorder(BorderFactory.createTitledBorder("resultados"));
		resultados.setBackground(Color.PINK);

		resultados.add(new JLabel("interés"));
		resultados.add(new JTextField());

		resultados.add(new JLabel("monto"));
		resultados.add(new JTextField());

		this.add(resultados, BorderLayout.SOUTH);

		this.setVisible(true);
		
		
	}		
}