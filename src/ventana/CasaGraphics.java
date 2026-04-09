package ventana;
import javax.swing.*;
import java.awt.*;

public class CasaGraphics extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Cielo
        g.setColor(new Color(180, 220, 220));
        g.fillRect(0, 0, 800, 400);
        
        // Suelo
        g.setColor(new Color(180, 130, 60));
        g.fillRect(0, 400, 800, 200);
        
        
        
        
        // Suelo
        g.setColor(new Color(80, 130, 60));
        g.fillRect(        0, 400, 800, 100
);

      
        
        
        // Casa 
        g.setColor(Color.YELLOW);
        g.fillRect(250, 200, 300, 200);

        // Techo 
        int[] x = {230, 400, 600};
        int[] y = {200, 80, 200};
        g.setColor(Color.RED);
        g.fillPolygon(x, y, 3);

        // Puerta
        g.setColor(new Color(100, 60, 0));
        g.fillRect(300, 250, 80, 150);

        // Perilla
        g.setColor(Color.BLACK);
        g.fillOval(360, 320, 10, 10);

        // Ventana
        g.setColor(Color.CYAN);
        g.fillRect(420, 250, 80, 80);

        // Division ventana
        g.setColor(Color.BLACK);
        g.drawLine(460, 250, 460, 330);
        g.drawLine(420, 290, 500, 290);

        // Chimenea
        g.setColor(Color.GRAY);
        g.fillRect(500, 100, 40, 100);

        // tablas 
        g.setColor(new Color(200, 170, 100));
        for (int i = 0; i < 800; i += 40) {
            g.fillRect(i, 350, 20, 100);
        
            
        
            
            
        }
    }
}
