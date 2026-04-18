package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class clericot extends JFrame {

    private Color colorActual = Color.BLACK;
    private int grosor = 5;
    private String herramienta = "PINCEL";

    private Lienzo lienzo;

    public clericot() {
        setTitle("Mini Paint - Clericot");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        lienzo = new Lienzo();

        JPanel panelHerramientas = new JPanel();
        panelHerramientas.setLayout(new GridLayout(10, 1, 5, 5));

        JButton btnPincel = new JButton("Pincel");
        JButton btnBorrador = new JButton("Borrador");
        JButton btnRect = new JButton("Rectángulo");
        JButton btnCirculo = new JButton("Círculo");
        JButton btnTriangulo = new JButton("Triángulo");
        JButton btnLinea = new JButton("Línea");
        JButton btnLimpiar = new JButton("Limpiar");

        JSlider sliderGrosor = new JSlider(1, 20, 5);
        sliderGrosor.setBorder(BorderFactory.createTitledBorder("Grosor"));

        btnPincel.addActionListener(e -> herramienta = "PINCEL");
        btnBorrador.addActionListener(e -> herramienta = "BORRADOR");
        btnRect.addActionListener(e -> herramienta = "RECT");
        btnCirculo.addActionListener(e -> herramienta = "CIRCULO");
        btnTriangulo.addActionListener(e -> herramienta = "TRIANGULO");
        btnLinea.addActionListener(e -> herramienta = "LINEA");

        btnLimpiar.addActionListener(e -> lienzo.limpiar());

        sliderGrosor.addChangeListener(e -> grosor = sliderGrosor.getValue());

        panelHerramientas.add(btnPincel);
        panelHerramientas.add(btnBorrador);
        panelHerramientas.add(btnRect);
        panelHerramientas.add(btnCirculo);
        panelHerramientas.add(btnTriangulo);
        panelHerramientas.add(btnLinea);
        panelHerramientas.add(sliderGrosor);
        panelHerramientas.add(btnLimpiar);

        JPanel panelColores = new JPanel();
        panelColores.setLayout(new FlowLayout());

        panelColores.add(crearBotonColor(Color.WHITE));
        panelColores.add(crearBotonColor(Color.BLACK));
        panelColores.add(crearBotonColor(Color.GRAY));
        panelColores.add(crearBotonColor(Color.BLUE));
        panelColores.add(crearBotonColor(Color.RED));
        panelColores.add(crearBotonColor(Color.GREEN));

        add(panelHerramientas, BorderLayout.WEST);
        add(panelColores, BorderLayout.SOUTH);
        add(lienzo, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton crearBotonColor(Color color) {
        JButton btn = new JButton();
        btn.setBackground(color);
        btn.setPreferredSize(new Dimension(40, 40));

        btn.addActionListener(e -> colorActual = color);

        return btn;
    }

    class Lienzo extends JPanel {

        private ArrayList<Figura> figuras = new ArrayList<>();

        private int xInicio, yInicio, xFin, yFin;

        public Lienzo() {
            setBackground(Color.WHITE);

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    xInicio = e.getX();
                    yInicio = e.getY();

                    if (herramienta.equals("PINCEL") || herramienta.equals("BORRADOR")) {
                        figuras.add(new Linea(xInicio, yInicio, xInicio, yInicio,
                                herramienta.equals("BORRADOR") ? Color.WHITE : colorActual, grosor));
                    }
                }

                public void mouseReleased(MouseEvent e) {
                    xFin = e.getX();
                    yFin = e.getY();

                    switch (herramienta) {
                        case "RECT":
                            figuras.add(new Rectangulo(xInicio, yInicio, xFin, yFin, colorActual, grosor));
                            break;
                        case "CIRCULO":
                            figuras.add(new Circulo(xInicio, yInicio, xFin, yFin, colorActual, grosor));
                            break;
                        case "TRIANGULO":
                            figuras.add(new Triangulo(xInicio, yInicio, xFin, yFin, colorActual, grosor));
                            break;
                        case "LINEA":
                            figuras.add(new Linea(xInicio, yInicio, xFin, yFin, colorActual, grosor));
                            break;
                    }

                    repaint();
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    if (herramienta.equals("PINCEL") || herramienta.equals("BORRADOR")) {
                        int x = e.getX();
                        int y = e.getY();

                        figuras.add(new Linea(xInicio, yInicio, x, y,
                                herramienta.equals("BORRADOR") ? Color.WHITE : colorActual, grosor));

                        xInicio = x;
                        yInicio = y;

                        repaint();
                    }
                }
            });
        }

        public void limpiar() {
            figuras.clear();
            repaint();
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Figura f : figuras) {
                f.dibujar(g);
            }
        }
    }

    abstract class Figura {
        int x1, y1, x2, y2;
        Color color;
        int grosor;

        public Figura(int x1, int y1, int x2, int y2, Color color, int grosor) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.color = color;
            this.grosor = grosor;
        }

        abstract void dibujar(Graphics g);
    }

    class Linea extends Figura {
        public Linea(int x1, int y1, int x2, int y2, Color color, int grosor) {
            super(x1, y1, x2, y2, color, grosor);
        }

        void dibujar(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(color);
            g2.setStroke(new BasicStroke(grosor));
            g2.drawLine(x1, y1, x2, y2);
        }
    }

    class Rectangulo extends Figura {
        public Rectangulo(int x1, int y1, int x2, int y2, Color color, int grosor) {
            super(x1, y1, x2, y2, color, grosor);
        }

        void dibujar(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(color);
            g2.setStroke(new BasicStroke(grosor));
            g2.drawRect(Math.min(x1, x2), Math.min(y1, y2),
                    Math.abs(x2 - x1), Math.abs(y2 - y1));
        }
    }

    class Circulo extends Figura {
        public Circulo(int x1, int y1, int x2, int y2, Color color, int grosor) {
            super(x1, y1, x2, y2, color, grosor);
        }

        void dibujar(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(color);
            g2.setStroke(new BasicStroke(grosor));
            g2.drawOval(Math.min(x1, x2), Math.min(y1, y2),
                    Math.abs(x2 - x1), Math.abs(y2 - y1));
        }
    }

    class Triangulo extends Figura {
        public Triangulo(int x1, int y1, int x2, int y2, Color color, int grosor) {
            super(x1, y1, x2, y2, color, grosor);
        }

        void dibujar(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(color);
            g2.setStroke(new BasicStroke(grosor));

            int[] xPoints = {x1, x2, (x1 + x2) / 2};
            int[] yPoints = {y2, y2, y1};

            g2.drawPolygon(xPoints, yPoints, 3);
        }
    }

    public static void main(String[] args) {
        new clericot();
    }
}