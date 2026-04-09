package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class Draw extends JPanel {

    BufferedImage img;

    public Draw(){

        JFrame ventana = new JFrame("Dibujo tipo Mario");

        ventana.add(this);
        ventana.setSize(900,700);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        try{
            img = ImageIO.read(new File("src/images/imresizer-duke5.png"));	
        }catch(Exception e){
            System.out.println("No se pudo cargar la imagen");
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g.setColor(new Color(150, 200, 215)); // cielo
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(new Color(220, 170, 150));
        g.fillRect(0, 550, 900, 150);

        g.setColor(Color.BLACK);
        g.drawLine(0, 550, 900, 550);

        g.setColor(new Color(240, 140, 90));
        g.fillRect(150, 50, 60, 60);
        g.fillRect(220, 50, 60, 60);
        g.fillRect(800, 120, 60, 60);
        g.fillRect(50, 250, 60, 60);

        g.setColor(Color.BLACK);
        g.drawRect(150, 50, 60, 60);
        g.drawRect(220, 50, 60, 60);
        g.drawRect(800, 120, 60, 60);
        g.drawRect(50, 250, 60, 60);

        g.setColor(new Color(220, 170, 160));
        g.fillRoundRect(200, 420, 200, 130, 20, 20);

        g.setColor(Color.BLACK);
        g.drawRoundRect(200, 420, 200, 130, 20, 20);

        g.fillOval(210, 430, 20, 20);
        g.fillOval(360, 430, 20, 20);
        g.fillOval(210, 520, 20, 20);
        g.fillOval(360, 520, 20, 20);

        g.setColor(new Color(120, 170, 220));
        g.fillRoundRect(350, 350, 120, 200, 20, 20);

        g.setColor(Color.BLACK);
        g.drawRoundRect(350, 350, 120, 200, 20, 20);

        g.fillOval(360, 360, 20, 20);
        g.fillOval(440, 360, 20, 20);

        g.setColor(Color.BLACK);
        g.fillRect(470, 360, 40, 200);
        g.fillRect(400, 420, 40, 130);

        g.setColor(new Color(0, 150, 0));
        g.fillRect(600, 400, 80, 150);

        g.setColor(new Color(0, 180, 0));
        g.fillRect(590, 380, 100, 40);

        g.setColor(Color.BLACK);
        g.drawRect(600, 400, 80, 150);
        g.drawRect(590, 380, 100, 40);

        g.setColor(new Color(80, 200, 100));
        g.fillRoundRect(750, 400, 150, 150, 20, 20);

        g.setColor(Color.BLACK);
        g.drawRoundRect(750, 400, 150, 150, 20, 20);

        g.fillOval(760, 410, 20, 20);
        g.fillOval(760, 520, 20, 20);

        if(img != null){
            g.drawImage(img,600,200,120,120,this);
        }
    }

    public static void main(String[] args) {
        new Draw();
    }
}