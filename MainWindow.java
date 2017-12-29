import java.awt.Event;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTable;

public class MainWindow {
	 // Database credentials
    static final String driver = "com.mysql.jdbc.Driver";
    static final String protocol = "jdbc:mysql://localhost:3307/ben_s?useSSL=true";
    static final String user = "root";
    static final String password = "Abc12345";
    public static Connection connection;// = null;
    static Statement statement = null;
	private JFrame frame;
	private JTextField E_id;
	private JTextField E_fn;
	private JTextField E_ln;
	private JTextField E_age;
	private JTextField E_dob;
	private JTextField E_adress;
	private JTextField S_di;
	private JTextField S_dn;
	private JTextField S_e;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try { 
					System.out.println("Run Mode");
					 Class.forName("com.mysql.jdbc.Driver");
                     // Open connection with the correct information
                     connection = DriverManager.getConnection(protocol, user, password);
                     //making a statement for testing our system 
                     statement = connection.createStatement();
					 
                     MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 	

	/**
	 * Create the application.
	 */
	
	public MainWindow() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 987, 678);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setSelectedIndex(-1);
		tabbedPane.setBounds(26, 30, 914, 532);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Home", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Engineer", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblEngineerId = new JLabel("Engineer Id:");
		lblEngineerId.setBounds(12, 56, 105, 16);
		panel_1.add(lblEngineerId);
		
		JLabel lblEngineerName = new JLabel("First Name:");
		lblEngineerName.setBounds(12, 98, 105, 16);
		panel_1.add(lblEngineerName);
		
		JLabel lblAgeAndDate = new JLabel("Age and date:");
		lblAgeAndDate.setBounds(12, 156, 105, 16);
		panel_1.add(lblAgeAndDate);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(12, 127, 105, 16);
		panel_1.add(lblLastName);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth:");
		lblDateOfBirth.setBounds(12, 185, 105, 16);
		panel_1.add(lblDateOfBirth);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(12, 217, 105, 16);
		panel_1.add(lblAdress);
		
		JLabel lblDomainId = new JLabel("Domain Id:");
		lblDomainId.setBounds(12, 246, 105, 16);
		panel_1.add(lblDomainId);
		
		JLabel lblDomainName = new JLabel("Domain Name:");
		lblDomainName.setBounds(12, 275, 105, 16);
		panel_1.add(lblDomainName);
		
		JLabel lblExpertise = new JLabel("Expertise:");
		lblExpertise.setBounds(12, 304, 105, 16);
		panel_1.add(lblExpertise);
		
		E_id = new JTextField();
		E_id.setBounds(109, 53, 116, 22);
		panel_1.add(E_id);
		E_id.setColumns(10);
		
		E_fn = new JTextField();
		E_fn.setColumns(10);
		E_fn.setBounds(109, 95, 116, 22);
		panel_1.add(E_fn);
		
		E_ln = new JTextField();
		E_ln.setColumns(10);
		E_ln.setBounds(109, 121, 116, 22);
		panel_1.add(E_ln);
		
		E_age = new JTextField();
		E_age.setColumns(10);
		E_age.setBounds(109, 149, 116, 22);
		panel_1.add(E_age);
		
		E_dob = new JTextField();
		E_dob.setColumns(10);
		E_dob.setBounds(109, 182, 116, 22);
		panel_1.add(E_dob);
		
		E_adress = new JTextField();
		E_adress.setColumns(10);
		E_adress.setBounds(109, 214, 116, 22);
		panel_1.add(E_adress);
		
		S_di = new JTextField();
		S_di.setColumns(10);
		S_di.setBounds(109, 243, 116, 22);
		panel_1.add(S_di);
		
		S_dn = new JTextField();
		S_dn.setColumns(10);
		S_dn.setBounds(109, 272, 116, 22);
		panel_1.add(S_dn);
		
		S_e = new JTextField();
		S_e.setColumns(10);
		S_e.setBounds(109, 301, 116, 22);
		panel_1.add(S_e);
		
		table = new JTable();
		table.setBounds(247, 71, 650, 249);
		panel_1.add(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addEngineerFunction();
			}

			private void addEngineerFunction() {
					Engineer en = new Engineer();
					en.setId(E_id.getText());
					en.setFirst_name(E_fn.getText());
					en.setLast_name(E_ln.getText());
					en.setAge(E_age.getText());
					en.setDate_of_Birth(E_dob.getText());
					en.setAdress(E_adress.getText());
					en.setDomain_Number(S_di.getText());
					en.setDomain_Name(S_dn.getText());
					en.setExpertise(S_e.getText());
					System.out.println(en.Inerst().toString());
					try {
						statement.executeQuery(en.Inerst()); 	
					} catch (Exception e) {
					}
					
				}				
			}
		);
		btnAdd.setBounds(247, 33, 97, 25);
		panel_1.add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemove.setBounds(362, 33, 97, 25);
		panel_1.add(btnRemove);
		
		JButton btnReffrsh = new JButton("Reffrsh");
		btnReffrsh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnReffrsh.setBounds(474, 33, 97, 25);
		panel_1.add(btnReffrsh);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Project", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Development Enviroment", null, panel_3, null);
		}
}
