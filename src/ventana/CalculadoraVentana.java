package ventana;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculadoraVentana extends JFrame {

    public CalculadoraVentana() {
        this.setTitle("Calculadora");
        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);

        JPanel panelCalc = new JPanel();
        panelCalc.setBounds(0, 0, 500, 500);
        panelCalc.setBackground(Color.decode("#DDEEA6"));
        panelCalc.setLayout(null);
        this.add(panelCalc);

        
        JLabel field = new JLabel("180.00");
        field.setBounds(10, 10, 430, 40);
        field.setOpaque(true);
        field.setBackground(Color.white);
        field.setFont(new Font("Arial", Font.BOLD, 22));
        field.setHorizontalAlignment(JLabel.RIGHT);
        field.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panelCalc.add(field);

        int cor_x = 30, cor_y = 60;
        String[] botones = {"CE","","","","7","8","9","/",
                            "4","5","6","*","1","2","3","-",
                            "0",".","=","+"};

        for(int i = 0; i < botones.length; i++) {
            JButton b = new JButton(botones[i]);
            b.setSize(80,50);
            b.setLocation(cor_x, cor_y);
            panelCalc.add(b);

            cor_x += 90;
            if(cor_x >= 420) {
                cor_x = 30;
                cor_y += 60;
            }
        }

        this.setVisible(true);
    }
}