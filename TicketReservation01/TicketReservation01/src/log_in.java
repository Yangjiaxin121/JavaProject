import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


import javax.swing.*;





public class log_in extends JFrame{
	public log_in(){
		setBg();
		this.setTitle("星云航空");
		this.setSize(600,400);
		this.setLocation(300, 100);
		this.setLayout(null);
		
		JLabel username = new JLabel("用户名:");
		username.setFont(new Font("宋体",Font.PLAIN,20));
		username.setForeground(Color.decode("#9C9C9C"));
		username.setBounds(150,130,90,30);
		JLabel password = new JLabel("密码:");
		password.setFont(new Font("宋体",Font.PLAIN,20));
		password.setForeground(Color.decode("#9C9C9C"));
		password.setBounds(150,200,90,30);
		
		JTextField usernameText = new JTextField(200);
		usernameText.setBounds(230,130,200,30);
		//JTextField passwordText = new JTextField(200);
		JPasswordField passwordText = new JPasswordField(200);
		passwordText.setBounds(230,200,200,30);
		
		JButton logIn = new JButton("登陆");
		logIn.setBounds(220,290,60,30);
		logIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				PreparedStatement  psta=null;
				try {
					
					String userNameValue = usernameText.getText();
					String passwordValue = passwordText.getText();
					Class.forName("com.mysql.jdbc.Driver");

					
					conn = DriverManager
							.getConnection("jdbc:mysql://localhost/Ticket?useSSL=false&user=root&password=1234");
					//stmt = conn.createStatement();
					String sql = "select * from ticket where name = ?;";
					//rs = stmt.executeQuery("select * from ticket where name = ?;");
					//rs = stmt.executeQuery("select * from ticket where name = 'yang12';");
					 psta=conn.prepareStatement(sql);  
                     psta.setString(1,userNameValue);   
                     rs=psta.executeQuery(); 
//					JOptionPane.showMessageDialog(
//	                        null,
//	                        "瀵嗙爜涓嶈兘涓虹┖锛佽閲嶆柊杈撳叆",
//	                        "0.0",
//	                        JOptionPane.WARNING_MESSAGE
//	                );
					String s = null;
					while (rs.next()) {
						 s = rs.getString("password");
					}
					
					if(passwordValue.equals(s)) {
						Ticket t = new Ticket(userNameValue);
						Util.name = userNameValue;
					}else {
						JOptionPane.showMessageDialog(
		                        null,
		                        "用户名或密码错误",
		                        "0.0",
		                        JOptionPane.WARNING_MESSAGE
		                );
						
					}
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException ex) {
					System.out.println("SQlException:" + ex.getMessage());
					System.out.println("SQLState:" + ex.getSQLState());
					System.out.println("VendorError:" + ex.getErrorCode());
				}
			}
			
		});
		JButton signIn = new JButton("注册");
		signIn.setBounds(310,290,60,30);
		signIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sign_in si = new sign_in();
				si.setFrame(si);
				si.My_sign_in();
				
				
			}
			
		});
		
		

		this.add(username);
		this.add(password);
		this.add(logIn);
		this.add(signIn);
		this.add(usernameText);
		this.add(passwordText);
		
		
		
		JLabel label = new JLabel("欢迎来到星云航空",JLabel.CENTER);
		label.setFont(new Font("宋体",Font.PLAIN,20));
		label.setForeground(Color.decode("#9C9C9C"));
		label.setBounds( 200, 10, 200, 80);
		this.add(label);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public void setBg(){   
		((JPanel)this.getContentPane()).setOpaque(false);   
		ImageIcon img = new ImageIcon  
		("bg.jpg");   
		JLabel background = new JLabel(img);  
		this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));   
		background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());   
		} 
	public static void main(String[] args) {
		new log_in();
	}


}
