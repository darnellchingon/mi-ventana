import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Ventana extends JFrame {

	public Ventana () {

		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.setMinimumSize(new Dimension(950,220));
		this.setMaximumSize(new Dimension(800,800));
		this.setLocationRelativeTo(null);
		this.setTitle("ola bro");
		this.setLayout(null);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		//this.login();
		//this.signUp();
		
		this.users();
		this.repaint();

	}

		

		public void login() {

		

		

		JPanel loginContainer = new JPanel();
			loginContainer.setSize(400,400);
			loginContainer.setLocation(50,50);
			loginContainer.setBackground(Color.pink);
			loginContainer.setOpaque(true);
			loginContainer.setLayout(null);
		this.add(loginContainer);

		



		JLabel tagtittle = new JLabel();
			tagtittle.setText("welcome ");
			tagtittle.setSize(100,30);
			tagtittle.setLocation(145,10);
			tagtittle.setOpaque(true);
			tagtittle.setVerticalAlignment(JLabel.CENTER);
			tagtittle.setHorizontalAlignment(JLabel.CENTER);
			tagtittle.setFont(new Font("Arial",Font.PLAIN,22));
		loginContainer.add((tagtittle));



		JLabel texto = new JLabel();
			texto.setText("password");
			texto.setSize(100,30);
			texto.setLocation(60,160);
			texto.setOpaque(false);
			texto.setVerticalAlignment(JLabel.CENTER);
			texto.setHorizontalAlignment(JLabel.CENTER);
			texto.setFont(new Font("Arial",Font.PLAIN,22));
			loginContainer.add((texto));



		



		JLabel qwerty = new JLabel();
			qwerty.setText("User");
			qwerty.setSize(100,30);
			qwerty.setLocation(40,60);
			qwerty.setOpaque(false);
			qwerty.setVerticalAlignment(JLabel.CENTER);
			qwerty.setHorizontalAlignment(JLabel.CENTER);
			 qwerty.setFont(new Font("Arial",Font.PLAIN,22));
			loginContainer.add((qwerty));



		JLabel gank = new JLabel();
			gank.setText("i have forgot my password");
			gank.setSize(300,30);
			gank.setLocation(140,304);
			gank.setOpaque(false);
			gank.setVerticalAlignment(JLabel.CENTER);
			gank.setHorizontalAlignment(JLabel.CENTER);
			gank.setFont(new Font("Arial",Font.PLAIN,12));
			loginContainer.add((gank));



		JTextField emailImput = new JTextField();
			emailImput.setSize(280,40);
			emailImput.setLocation(60,100);
			loginContainer.add(emailImput);

		
		JPasswordField contra = new JPasswordField();
			contra.setSize(280,40);
			contra.setLocation(60,200);
			loginContainer.add(contra);


		JCheckBox rememberme = new JCheckBox("hello world");
			rememberme.setSize(140,40);
			rememberme.setLocation(60,300);
			rememberme.setOpaque(false);
			rememberme.setBorder(null);
			loginContainer.add(rememberme);


		JButton accesBtn = new JButton();
			accesBtn.setText("log in");
			accesBtn.setFont(new Font("Arial",Font.ITALIC,18));
			accesBtn.setBounds(120,350,200,40);
			loginContainer.add(accesBtn);

		}

		

	public void signUp () {

		JPanel rgsContainer = new JPanel();
			rgsContainer.setBounds(500,50,400,400);
			rgsContainer.setBackground(Color.pink);
			rgsContainer.setOpaque(true);
			rgsContainer.setLayout(null);
			this.add(rgsContainer);


		JLabel register = new JLabel();
			register.setText("Sign up ");
			register.setSize(100,30);
			register.setLocation(145,10);
			register.setOpaque(true);
			register.setVerticalAlignment(JLabel.CENTER);
			register.setHorizontalAlignment(JLabel.CENTER);
			register.setFont(new Font("Arial",Font.PLAIN,22));
			rgsContainer.add((register));

		

		JTextField name = new JTextField();
			name.setBounds(50,70,300,40);
			name.setSize(300,30);
			rgsContainer.add(name);

		

		JLabel bioTag = new JLabel("BIO");
			bioTag.setBounds(150,105,100,40);
			bioTag.setHorizontalAlignment(JLabel.CENTER);
			bioTag.setOpaque(true);
			bioTag.setBackground(Color.BLACK); 
			bioTag.setForeground(Color.WHITE);
			rgsContainer.add(bioTag);



		JLabel username = new JLabel("Username");
			username.setBounds(50,30,300,40);
			username.setHorizontalAlignment(JLabel.CENTER);
			username.setOpaque(false);
			rgsContainer.add(username);



		JTextArea bioText = new JTextArea();
			bioText.setLocation(50,150);
			bioText.setSize(300,80);
			rgsContainer.add(bioText);



		



		JCheckBox healthy = new JCheckBox("healthy");
			healthy.setBounds(50,245,100,30);
			healthy.setOpaque(true);
			rgsContainer.add(healthy);


		JCheckBox salty = new JCheckBox("salty");
			salty.setBounds(150,245,100,30);
			salty.setOpaque(true);
			rgsContainer.add(salty);



		



		JCheckBox sweet = new JCheckBox("sweet");
			sweet.setBounds(250,245,100,30);
			sweet.setOpaque(true);
			rgsContainer.add(sweet);


		JRadioButton acceptTerms = new JRadioButton("Terms accepted");
			acceptTerms.setBounds(50,280,180,30);
			acceptTerms.setOpaque(false);
			rgsContainer.add(acceptTerms);


		JRadioButton rejectTerms = new JRadioButton("Terms rejected");
			rejectTerms.setBounds(220,280,190,30);
			rejectTerms.setOpaque(false);
			rgsContainer.add(rejectTerms);



		ButtonGroup terms = new ButtonGroup();
			terms.add(acceptTerms);
			terms.add(rejectTerms);

		//combo

		String[] colonias = {
			    "Agua Escondida",
			    "Altavela",
			    "Ampliacion Navarro Rubio",
			    "Arcoiris",
			    "Bella Vista",
			    "Benito Juarez",
			    "Calafia",
			    "Camino Real",
			    "Campestre",
			    "Centro",
			    "Colina del Sol",
			    "Diana Laura",
			    "El Conchalito",
			    "El Esterito",
			    "El Manglito",
			    "Emiliano Zapata",
			    "Fidepaz",
			    "Flores Magon",
			    "Francisco Villa",
			    "Guadalupe Victoria",
			    "Indeco",
			    "La Fuente",
			    "La Pasión",
			    "Las Americas",
			    "Las Garzas",
			    "Las Palmas",
			    "Loma Obrera",
			    "Lomas Altas",
			    "Lomas de Palmira",
			    "Los Olivos",
			    "Magisterial",
			    "Mezquitito",
			    "Miramar",
			    "Navarro Rubio",
			    "Olas Altas",
			    "Palmira",
			    "Pueblo Nuevo",
			    "Puesta del Sol",
			    "Roma",
			    "Santa Fe",
			    "Solidaridad",
			    "Tabachines",
			    "Valle del Mezquite",
			    "Vista Hermosa"
				};



		JComboBox coloniasCombo = new JComboBox (colonias);
			coloniasCombo.setBounds(105,320,300,50);
			coloniasCombo.setSize(200,25);
			rgsContainer.add(coloniasCombo);


		JButton regButton = new JButton("register");
			regButton.setFont(new Font("Arial",Font.ITALIC,18));
			regButton.setBounds(105,350,200,40);
			rgsContainer.add(regButton);

		

	}

	public void users() {
		
		JPanel panelUsers = new JPanel();
			panelUsers.setLayout(null);
			panelUsers.setBounds(0,0,950,600);
			panelUsers.setBackground(Color.pink);
		
		String[] info = {
			    "No. Control",
			    "Nombre",
			    "Apellidos",
			    "Correo",
			    "Semestre",
			    "Carrera",
			    "Acciones"
			};

		Object[][] datos = {
			    {"001","Juan","Perez","juan@mail.com","3","Sistemas","Acciones"},
			    {"002","Ana","Lopez","ana@mail.com","2","TI","Acciones"},
			    {"003","Luis","Garcia","luis@mail.com","5","Software","Acciones"},
			    {"004","Carlos","Ramirez","carlos@mail.com","1","Sistemas","Acciones"},
			    {"005","Maria","Hernandez","maria@mail.com","4","TI","Acciones"},
			    {"006","Pedro","Sanchez","pedro@mail.com","6","Software","Acciones"},
			    {"007","Laura","Torres","laura@mail.com","3","Sistemas","Acciones"},
			    {"008","Diego","Flores","diego@mail.com","2","TI","Acciones"},
			    {"009","Sofia","Vargas","sofia@mail.com","5","Software","Acciones"},
			    {"010","Miguel","Castro","miguel@mail.com","1","Sistemas","Acciones"},
			    {"011","Daniela","Rojas","daniela@mail.com","4","TI","Acciones"},
			    {"012","Jorge","Mendoza","jorge@mail.com","6","Software","Acciones"},
			    {"013","Fernanda","Ortega","fernanda@mail.com","3","Sistemas","Acciones"},
			    {"014","Ricardo","Navarro","ricardo@mail.com","2","TI","Acciones"},
			    {"015","Valeria","Campos","valeria@mail.com","5","Software","Acciones"},
			    {"016","Eduardo","Silva","eduardo@mail.com","1","Sistemas","Acciones"},
			    {"017","Paola","Reyes","paola@mail.com","4","TI","Acciones"},
			    {"018","Andres","Morales","andres@mail.com","6","Software","Acciones"},
			    {"019","Kevin","Delgado","kevin@mail.com","2","Sistemas","Acciones"},
			    {"020","Lucia","Pineda","lucia@mail.com","3","TI","Acciones"},
			    {"021","Oscar","Cruz","oscar@mail.com","5","Software","Acciones"},
			    {"022","Natalia","Ibarra","natalia@mail.com","1","Sistemas","Acciones"},
			    {"023","Hector","Salazar","hector@mail.com","4","TI","Acciones"},
			    {"024","Camila","Nunez","camila@mail.com","6","Software","Acciones"},
			    {"025","Ivan","Bravo","ivan@mail.com","2","Sistemas","Acciones"},
			    {"026","Alejandra","Soto","alejandra@mail.com","3","TI","Acciones"},
			    {"027","Roberto","Acosta","roberto@mail.com","5","Software","Acciones"},
			    {"028","Mariana","Velazquez","mariana@mail.com","1","Sistemas","Acciones"}
			};
		
		
		//Profe, esta parte de aqui no le entendi, pero me daba error si intentaba otra cosa, pero la IA me ayudo,
		//quisiera ver esto en clase con usted
		// para aclarar dudas
			JTable tabla = new JTable(datos, info) {
			    public boolean isCellEditable(int r, int c) {
			        return false;
			    }
			};
			
			
			 JLabel userTittle = new JLabel("Users");
			 	userTittle.setOpaque(false);
			 	userTittle.setBounds(410, 10, 900, 50);
			 	userTittle.setFont(new Font("Segoe UI", Font.ITALIC, 52));
			 	panelUsers.add(userTittle);
			    	
			 
			 JButton downloadBtn = new JButton("Download");
			 	downloadBtn.setBounds(540, 90, 100, 30);
			 	panelUsers.add(downloadBtn);
			 

			 JLabel lblUsers = new JLabel("Users:");
			 	lblUsers.setBounds(50, 50, 80, 30); 
			 	lblUsers.setFont(new Font("Segoe UI", Font.ITALIC, 26));
			 	lblUsers.setOpaque(true);
			 	panelUsers.add(lblUsers);
			 
			 JLabel number = new JLabel("       28");
			 	number.setOpaque(true);
			 	number.setBounds(50, 80, 80, 30); 
			 	number.setFont(new Font("Arial", Font.BOLD, 16));
			 	panelUsers.add(number);
			 

			 JButton btnAdd = new JButton("Add");
			 	btnAdd.setBounds(660, 90, 100, 30);
			 	panelUsers.add(btnAdd);
			 
			
			JScrollPane scroll = new JScrollPane(tabla);
			scroll.setBounds(120,150,700,300);
			panelUsers.add(scroll);
				this.add(panelUsers);
				this.revalidate();
				this.repaint();
		    
	}

}

