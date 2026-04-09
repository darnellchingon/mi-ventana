package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Gui frame = new Gui();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Gui() {

        setTitle("Registro de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 500);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout());

        setContentPane(contentPane);

        //TITULO 
        JLabel titulo = new JLabel("REGISTRO DE USUARIO", JLabel.CENTER);
        contentPane.add(titulo, BorderLayout.NORTH);

        //  PANEL CENTRAL 
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(2,2,10,10));
        contentPane.add(panelCentral, BorderLayout.CENTER);

        // DATOS GENERALES
        JPanel datosGenerales = new JPanel(new GridLayout(6,2,5,5));
        datosGenerales.setBorder(BorderFactory.createTitledBorder("Datos Generales"));

        datosGenerales.add(new JLabel("Nombres:"));
        datosGenerales.add(new JTextField());

        datosGenerales.add(new JLabel("Apellido Paterno:"));
        datosGenerales.add(new JTextField());

        datosGenerales.add(new JLabel("Apellido Materno:"));
        datosGenerales.add(new JTextField());

        datosGenerales.add(new JLabel("Fecha Nacimiento:"));
        datosGenerales.add(new JTextField());

        datosGenerales.add(new JLabel("Sexo:"));
        JPanel sexoPanel = new JPanel(new FlowLayout());
        javax.swing.JRadioButton masculino = new javax.swing.JRadioButton("Masculino");
        javax.swing.JRadioButton femenino = new javax.swing.JRadioButton("Femenino");

        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(masculino);
        grupoSexo.add(femenino);

        sexoPanel.add(masculino);
        sexoPanel.add(femenino);
        datosGenerales.add(sexoPanel);

        datosGenerales.add(new JLabel("Nacionalidad:"));
        JComboBox<String> pais = new JComboBox<>(new String[]{"México","USA","España","Otro"});
        datosGenerales.add(pais);

        panelCentral.add(datosGenerales);

        //PERFIL USUARIO
        JPanel perfil = new JPanel(new FlowLayout());
        perfil.setBorder(BorderFactory.createTitledBorder("Perfil del usuario"));

        JLabel foto = new JLabel();
        ImageIcon imagen = new ImageIcon("src/images/imresizer-duke5.png");
        foto.setIcon(imagen);

        perfil.add(foto);

        panelCentral.add(perfil);

        // DATOS OPCIONALES 
        JPanel opcionales = new JPanel(new GridLayout(1,2));
        opcionales.setBorder(BorderFactory.createTitledBorder("Datos opcionales"));

        JTextArea descripcion = new JTextArea();
        JScrollPane scrollTexto = new JScrollPane(descripcion);

        String[] hobbies = {"Cantar","Escuchar música","Leer","Deportes","Otros"};
        JList<String> lista = new JList<>(hobbies);
        JScrollPane scrollLista = new JScrollPane(lista);

        opcionales.add(scrollTexto);
        opcionales.add(scrollLista);

        panelCentral.add(opcionales);

        //  PANEL VACIO 
        JPanel extra = new JPanel();
        panelCentral.add(extra);
        
                JCheckBox mostrarFoto = new JCheckBox("Mostrar foto de perfil");
                extra.add(mostrarFoto);
        JCheckBox mostrarFecha = new JCheckBox("Mostrar fecha nacimiento");
        extra.add(mostrarFecha);

        //BOTONES 
        JPanel botones = new JPanel(new FlowLayout());

        contentPane.add(botones, BorderLayout.SOUTH);
        JButton salir = new JButton("Salir");
        botones.add(salir);
        JButton guardar = new JButton("Guardar");
        botones.add(guardar);
        
                JButton nuevo = new JButton("Nuevo");
                botones.add(nuevo);
    }
}