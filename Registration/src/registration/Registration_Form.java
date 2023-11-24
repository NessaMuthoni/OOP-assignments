package registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Registration_Form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Name;
	private JTextField username;
	private JTextField email;
	private JTextField phone;
	private JPasswordField password;
	private JPasswordField confirm_password;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_Form frame = new Registration_Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbName = new JLabel("Name:");
		lbName.setBounds(66, 52, 68, 25);
		contentPane.add(lbName);
		
		JLabel lbUsername = new JLabel("Username:");
		lbUsername.setBounds(66, 81, 68, 25);
		contentPane.add(lbUsername);
		
		JLabel lb_password = new JLabel("Password:");
		lb_password.setBounds(66, 107, 68, 25);
		contentPane.add(lb_password);
		
		JLabel lb_email = new JLabel("Email:");
		lb_email.setBounds(88, 155, 46, 25);
		contentPane.add(lb_email);
		
		JLabel lb_Address = new JLabel("Adress:");
		lb_Address.setBounds(87, 212, 56, 25);
		contentPane.add(lb_Address);
		
		JLabel lb_phone = new JLabel("Phone:");
		lb_phone.setBounds(88, 179, 43, 25);
		contentPane.add(lb_phone);
		
		JLabel lb_confirm = new JLabel("Confirm Password:\r\n");
		lb_confirm.setBounds(29, 130, 105, 25);
		contentPane.add(lb_confirm);
		
		JLabel lb_Register = new JLabel("Register Form");
		lb_Register.setFont(new Font("Tahoma", Font.BOLD, 23));
		lb_Register.setBounds(10, 11, 216, 44);
		contentPane.add(lb_Register);
		
		 Name= new JTextField();
		 Name.setBounds(144, 54, 224, 20);
		contentPane.add( Name);
		 Name.setColumns(10);
		
		 username = new JTextField();
		 username.setColumns(10);
		 username.setBounds(144, 83, 224, 20);
		contentPane.add(username);
		
		 email= new JTextField();
		email.setColumns(10);
		email.setBounds(144, 157, 224, 20);
		contentPane.add(email);
		
		phone= new JTextField();
		phone.setColumns(10);
		phone.setBounds(144, 184, 224, 20);
		contentPane.add(phone);
		
		password= new JPasswordField();
		password.setBounds(144, 109, 224, 20);
		contentPane.add(password);
		
		confirm_password = new JPasswordField();
		confirm_password.setBounds(144, 132, 224, 20);
		contentPane.add(confirm_password);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(144, 214, 224, 20);
		contentPane.add(address);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationForm", "root",
                            "20Nessa23!");
                    String sql = "INSERT INTO registration (Name,Username,Password,ConfirmPassword,Email,Phone,Address) VALUES (?, ?, ?,?,?,?,?)";
                    PreparedStatement pr = con.prepareStatement(sql);
                    pr.setString(1,  Name.getText());
                    pr.setString(2, username.getText());
                    pr.setString(3, password.getText());
                    pr.setString(4, confirm_password.getText());
                    pr.setString(5, email.getText());
                    pr.setString(6, phone.getText());
                    pr.setString(7, address.getText());
                    int count = pr.executeUpdate();
                    if (count == 1) {
                        JOptionPane.showMessageDialog(null, "Record added successfully");
                        Name.setText("");
                        username.setText("");
                        password.setText("");
                       confirm_password.setText("");
                        email.setText("");
                        phone.setText("");
                        address.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "No record added");
                    }
                    con.close();

                } catch (Exception d) {
                    d.printStackTrace();
                }
			}
		});
		btnSubmit.setBounds(54, 269, 89, 32);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(176, 269, 89, 32);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(297, 269, 89, 32);
		contentPane.add(btnExit);
	}
}
