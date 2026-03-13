package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class Draw extends JPanel {

    BufferedImage img;

    public Draw(){

        JFrame ventana = new JFrame("API Graphics");

        ventana.add(this);
        ventana.setSize(900,700);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        try{
            img = ImageIO.read(new File("src/images/imresizer-duke5.png")); // cambia por tu imagen
        }catch(Exception e){
            System.out.println("No se pudo cargar la imagen");
        }

    }
    
//ni idea de que hice profe la vdd, no fui el dia uqe dejo esto, pero no queira tener esa act sin entregar
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // LINEA
        g.setColor(Color.GREEN);
        g.drawLine(0,0,800,600);

        // RECTANGULO
        g.setColor(Color.YELLOW);
        g.fillRect(150,120,120,120);

        g.setColor(Color.BLACK);
        g.drawRect(140,110,120,120);

        // OVALO
        g.setColor(Color.ORANGE);
        g.fillOval(250,450,300,150);

        // medio circulo
        g.setColor(Color.YELLOW);
        g.fillArc(450,120,150,150,0,180);

        g.setColor(Color.GREEN);
        g.drawArc(450,120,150,150,180,180);

        //  triangulo
        int x[] = {380,450,520};
        int y[] = {300,230,300};

        g.setColor(Color.ORANGE);
        g.fillPolygon(x,y,3);

        // RECTANGULO REDONDEADO
        g.setColor(Color.ORANGE);
        g.drawRoundRect(650,400,150,150,40,40);

        g.setColor(Color.BLACK);
        g.fillRoundRect(700,450,150,150,40,40);

        // TEXTO
        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial", Font.BOLD,40));
        g.drawString("Hola",180,200);

        g.setFont(new Font("Serif", Font.ITALIC,30));
        g.drawString("Graphics API",450,80);

        // IMAGEN
        if(img != null){
            g.drawImage(img,600,200,120,120,this);
        }

        // TRANSFORMACION (ROTACION)
        g2.rotate(Math.toRadians(25), 200, 350);
        g2.setColor(Color.BLUE);
        g2.fillRect(170,320,100,60);

    }

}