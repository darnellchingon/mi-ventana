package factura;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Window extends JFrame {

    public Window() {
        setTitle("Factura en Java - NetBeans - ArrayList y POO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 700);
        setLocationRelativeTo(null);
        
       
        getContentPane().setLayout(null);

        // NCABEZADO 
        JPanel pnlNivel0_Titulo = new JPanel();
        pnlNivel0_Titulo.setBackground(Color.BLACK);
        pnlNivel0_Titulo.setLayout(null);
        pnlNivel0_Titulo.setBounds(0, 0, 750, 40); 
        getContentPane().add(pnlNivel0_Titulo);
        
        
        JLabel lblTitulo = new JLabel("Factura en Java");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo. setFont(new Font("Arial", Font.BOLD, 14));
        lblTitulo.setBounds(300,10,400, 20);
        pnlNivel0_Titulo.add(lblTitulo);
        
        
        // DATOS DEL CLIENTE
        JPanel pnlNivel1_Cliente = new JPanel();
        pnlNivel1_Cliente.setLayout(null); 
        pnlNivel1_Cliente.setBorder(new TitledBorder("Datos del cliente"));
        pnlNivel1_Cliente.setBounds(10, 50, 715, 100);
        getContentPane().add(pnlNivel1_Cliente);
        
        
        
        JLabel d1 = new JLabel("Documento:"); 
        d1.setForeground(Color.BLACK);
        d1.setFont(new Font("Arial", Font.BOLD, 14));
        d1.setBounds(15, 25, 100, 20); 
        pnlNivel1_Cliente.add(d1);
        
        JLabel d2 = new JLabel("Direccion:"); 
        d2.setForeground(Color.BLACK);
        d2.setFont(new Font("Arial", Font.BOLD, 14));
        d2.setBounds(15, 25, 100, 100); 
        pnlNivel1_Cliente.add(d2);
        
        
        JLabel d3 = new JLabel("Nombres:"); 
        d3.setForeground(Color.BLACK);
        d3.setFont(new Font("Arial", Font.BOLD, 14));
        d3.setBounds(250, 25, 100, 20); 
        pnlNivel1_Cliente.add(d3);
        
        JLabel d4 = new JLabel("Telefono:"); 
        d4.setForeground(Color.BLACK);
        d4.setFont(new Font("Arial", Font.BOLD, 14));
        d4.setBounds(250, 25, 100, 100); 
        pnlNivel1_Cliente.add(d4);
        
        
        JTextField c1 = new JTextField();
        c1.setBounds(110, 25, 120, 20); 
        pnlNivel1_Cliente.add(c1);

        JTextField c2 = new JTextField();
        c2.setBounds(330, 25, 200, 20);
        pnlNivel1_Cliente.add(c2);

        JTextField c3 = new JTextField();
        c3.setBounds(110, 60, 120, 20);
        pnlNivel1_Cliente.add(c3);

        JTextField c4 = new JTextField();
        c4.setBounds(330, 60, 150, 20);
        pnlNivel1_Cliente.add(c4);
        
        
        	

        // NIVEL 2: DATOS DE FACTURA
        JPanel pnlNivel2_Factura = new JPanel();
        pnlNivel2_Factura.setLayout(null);
        pnlNivel2_Factura.setBorder(new TitledBorder("Datos de factura"));
        pnlNivel2_Factura.setBounds(10, 160, 715, 70);
        getContentPane().add(pnlNivel2_Factura);

        JLabel lblNumTexto = new JLabel("N° Factura:");
        lblNumTexto.setFont(new Font("Arial", Font.BOLD, 14));
        lblNumTexto.setBounds(15, 25, 90, 20); 
        pnlNivel2_Factura.add(lblNumTexto);

        JLabel lblNumValor = new JLabel("1");
        lblNumValor.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNumValor.setBounds(110, 25, 50, 20); 
        pnlNivel2_Factura.add(lblNumValor);

        JLabel lblFechaTexto = new JLabel("Fecha:");
        lblFechaTexto.setFont(new Font("Arial", Font.BOLD, 14));
        lblFechaTexto.setBounds(250, 25, 60, 20); 
        pnlNivel2_Factura.add(lblFechaTexto);

        JLabel lblFechaValor = new JLabel("2021/10/21");
        lblFechaValor.setFont(new Font("Arial", Font.PLAIN, 14));
        lblFechaValor.setBounds(310, 25, 120, 20); 
        pnlNivel2_Factura.add(lblFechaValor);
        
        
     //crear el panel 
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(10, 240, 715, 180); 
        getContentPane().add(p3);

        
        String[] col = {"Producto", "Cantidad", "Valor", "Sub Total"};
        Object[][] dat = {
            {"Agua", "2", "500", "1000.0"},
            {"Cereal", "5", "1000", "5000.0"},
            {"Leche", "2", "300", "600.0"}
        };

        JTable t1 = new JTable(dat, col) {
            public boolean isCellEditable(int r, int c) { return false; }
        };

        JScrollPane s1 = new JScrollPane(t1);
        s1.setBounds(0, 0, 715, 180); 
        p3.add(s1);
        
        
        
     // TOTALES Y ACCIONES
        JPanel pnlNivel4_Totales = new JPanel();
        pnlNivel4_Totales.setLayout(null);
        pnlNivel4_Totales.setBounds(10, 430, 715, 200);
        getContentPane().add(pnlNivel4_Totales);

        JButton b1 = new JButton("Ver lista");
        b1.setBounds(20, 20, 100, 30);
        pnlNivel4_Totales.add(b1);

        JButton b2 = new JButton("Añadir");
        b2.setBounds(130, 20, 100, 30);
        pnlNivel4_Totales.add(b2);

        JButton b3 = new JButton("Eliminar");
        b3.setBounds(240, 20, 100, 30);
        pnlNivel4_Totales.add(b3);

        JButton b4 = new JButton("limpiar");
        b4.setBounds(500, 130, 80, 20);
        pnlNivel4_Totales.add(b4);
        

        JButton b5 = new JButton("finalizar factura");
        b5.setBounds(500, 170, 170, 20);
        pnlNivel4_Totales.add(b5);
        
        
        JCheckBox x1 = new JCheckBox("Descuento");
        x1.setBounds(20, 70, 100, 20);
        x1.setOpaque(false);
        pnlNivel4_Totales.add(x1);

        JTextField c5 = new JTextField("0");
        c5.setBounds(130, 70, 40, 20);
        pnlNivel4_Totales.add(c5);

        JLabel p1 = new JLabel("%");
        p1.setBounds(175, 70, 20, 20);
        pnlNivel4_Totales.add(p1);

        JLabel k1 = new JLabel("Subtotal:");
        k1.setBounds(500, 20, 80, 20);
        pnlNivel4_Totales.add(k1);

        JLabel v1 = new JLabel("6600.0");
        v1.setBounds(600, 20, 80, 20);
        pnlNivel4_Totales.add(v1);

        JLabel k2 = new JLabel("IVA 19%:");
        k2.setBounds(500, 50, 80, 20);
        pnlNivel4_Totales.add(k2);

        JLabel v2 = new JLabel("1254.0");
        v2.setBounds(600, 50, 80, 20);
        pnlNivel4_Totales.add(v2);

        JLabel k3 = new JLabel("TOTAL:");
        k3.setFont(new Font("Arial", Font.BOLD, 15));
        k3.setBounds(500, 90, 80, 20);
        pnlNivel4_Totales.add(k3);

        JLabel v3 = new JLabel("7854.0");
        v3.setFont(new Font("Arial", Font.BOLD, 15));
        v3.setBounds(600, 90, 80, 20);
        pnlNivel4_Totales.add(v3);

        System.out.println("hola se creo la ventana");

        pnlNivel4_Totales.repaint();
        
        System.out.println("hola se creo la ventana");
        
        
        setVisible(true);
    }
}	