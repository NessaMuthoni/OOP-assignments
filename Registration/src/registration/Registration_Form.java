package registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_Form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_4;

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
		
		textField = new JTextField();
		textField.setBounds(144, 54, 224, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 83, 224, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 157, 224, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(144, 184, 224, 20);
		contentPane.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 109, 224, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(144, 132, 224, 20);
		contentPane.add(passwordField_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(144, 214, 224, 20);
		contentPane.add(textField_4);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationForm", "root",
                            "");
                    String sql = "INSERT INTO UserRegistration (Name,Username,Password,ConfirmPassword,Email,Phone,Address) VALUES (?, ?, ?,?,?,?,?)";
                    PreparedStatement pr = con.prepareStatement(sql);
                    pr.setString(1, NAME.getText());
                    pr.setString(2, USERNAME.getText());
                    pr.setString(3, passwordField.getText());
                    pr.setString(4, passwordField_1.getText());
                    pr.setString(5, EMAIL.getText());
                    pr.setString(6, PHONE.getText());
                    pr.setString(7, ADDRESS.getText());
                    int count = pr.executeUpdate();
                    if (count == 1) {
                        JOptionPane.showMessageDialog(null, "Record added successfully");
                        NAME.setText("");
                        USERNAME.setText("");
                        passwordField.setText("");
                        passwordField_1.setText("");
                        EMAIL.setText("");
                        PHONE.setText("");
                        ADDRESS.setText("");
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
