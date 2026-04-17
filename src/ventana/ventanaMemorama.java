package unidad3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ventanaMemorama extends JFrame {

    JButton[] botones = new JButton[12];

    JButton primeraCarta = null;
    JButton segundaCarta = null;

    String valorPrimera = "";
    String valorSegunda = "";

    int paresEncontrados = 0;
    boolean bloqueado = false;

    int movimientos = 0;
    JLabel lblMovimientos;

    ImageIcon reverso;

    public ventanaMemorama() {

        setTitle("Memorama");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel();
        lblMovimientos = new JLabel("Movimientos: 0");
        lblMovimientos.setFont(new Font("Arial", Font.BOLD, 18));
        panelSuperior.add(lblMovimientos);
        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new GridLayout(3, 4, 10, 10));
        panelCentro.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        reverso = new ImageIcon(getClass().getResource("/images/SINimagen.png"));

        ActionListener evento = e -> {
            if (bloqueado) return;

            JButton boton = (JButton) e.getSource();

            if (boton == primeraCarta) return;

            String valor = (String) boton.getClientProperty("valor");
            setImagen(boton, "/images/" + valor + ".png");

            if (primeraCarta == null) {
                primeraCarta = boton;
                valorPrimera = valor;
            } else {
                segundaCarta = boton;
                valorSegunda = valor;

                movimientos++;
                lblMovimientos.setText("Movimientos: " + movimientos);

                compararCartas();
            }
        };

        for (int i = 0; i < 12; i++) {
            botones[i] = new JButton();
            botones[i].addActionListener(evento);
            botones[i].setFocusPainted(false);
            botones[i].setBorder(BorderFactory.createLineBorder(Color.GRAY));
            panelCentro.add(botones[i]);
        }

        add(panelCentro, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        JButton btnReiniciar = new JButton("Reiniciar");

        btnReiniciar.addActionListener(e -> {
            paresEncontrados = 0;
            primeraCarta = null;
            segundaCarta = null;
            bloqueado = false;
            movimientos = 0;
            lblMovimientos.setText("Movimientos: 0");
            inicializarCartas();
        });

        panelInferior.add(btnReiniciar);
        add(panelInferior, BorderLayout.SOUTH);

        inicializarCartas();

        setVisible(true);
    }

    public void inicializarCartas() {
        ArrayList<String> valores = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            valores.add("JAIBA" + i);
            valores.add("JAIBA" + i);
        }

        Collections.shuffle(valores);

        for (int i = 0; i < botones.length; i++) {
            botones[i].putClientProperty("valor", valores.get(i));
            setImagen(botones[i], "/images/SINimagen.png");
        }
    }

    public void compararCartas() {
        if (valorPrimera.equals(valorSegunda)) {

            paresEncontrados++;

            primeraCarta = null;
            segundaCarta = null;

            if (paresEncontrados == 6) {
                JOptionPane.showMessageDialog(this, "¡Ganaste en " + movimientos + " movimientos!");
            }

        } else {

            bloqueado = true;

            Timer timer = new Timer(800, e -> {
                setImagen(primeraCarta, "/images/SINimagen.png");
                setImagen(segundaCarta, "/images/SINimagen.png");

                primeraCarta = null;
                segundaCarta = null;

                bloqueado = false;
            });

            timer.setRepeats(false);
            timer.start();
        }
    }

    public void setImagen(JButton boton, String ruta) {
        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        Image img = icon.getImage().getScaledInstance(
                boton.getWidth(),
                boton.getHeight(),
                Image.SCALE_SMOOTH
        );
        boton.setIcon(new ImageIcon(img));
    }
}