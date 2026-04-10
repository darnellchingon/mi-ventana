package unidad3;

import javax.swing.*;
import java.awt.*;

public class ventanaMemorama extends JFrame {

    JButton b1 = new JButton("?");
    JButton b2 = new JButton("?");
    JButton b3 = new JButton("?");
    JButton b4 = new JButton("?");
    JButton b5 = new JButton("?");
    JButton b6 = new JButton("?");
    JButton b7 = new JButton("?");
    JButton b8 = new JButton("?");

    public ventanaMemorama() {

        setTitle("Memorama");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(100, 200, 210));

        JLabel lblContador = new JLabel("0");
        lblContador.setFont(new Font("Arial", Font.BOLD, 20));

        panelSuperior.add(lblContador);
        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new GridLayout(2, 4, 10, 10));
        panelCentro.setBackground(new Color(150, 150, 255));
        panelCentro.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelCentro.add(b1);
        panelCentro.add(b2);
        panelCentro.add(b3);
        panelCentro.add(b4);
        panelCentro.add(b5);
        panelCentro.add(b6);
        panelCentro.add(b7);
        panelCentro.add(b8);

        add(panelCentro, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(new Color(220, 220, 150));

        JButton btnReiniciar = new JButton("Reiniciar");
        panelInferior.add(btnReiniciar);
        
        JButton btnpausa = new JButton("pausa");
        panelInferior.add(btnReiniciar);
        
        

        add(panelInferior, BorderLayout.SOUTH);

        setVisible(true);
    }
}