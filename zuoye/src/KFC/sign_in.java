package KFC;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.sql.PreparedStatement;

public class sign_in extends JFrame{
	private  sign_in q;
	
	
	   public void setFrame(sign_in si) {
		   q = si;
	   }
	public  void My_sign_in() {
		setBg();
		this.setTitle("KFC注册界面");
		this.setSize(600,400);
		this.setLocation(300, 100);
		this.setLayout(null);
		
		JLabel label = new JLabel("欢迎注册",JLabel.CENTER);
		label.setFont(new Font("宋体",Font.PLAIN,20));
		label.setBounds( 200, 10, 200, 80);
		this.add(label);
		
		JLabel username = new JLabel("用户名:");
		username.setFont(new Font("宋体",Font.PLAIN,20));
		username.setBounds(150,100,90,30);
		JLabel password = new JLabel("密码:");
		password.setFont(new Font("宋体",Font.PLAIN,20));
		password.setForeground(Color.decode("#9C9C9C"));
		password.setBounds(150,170,90,30);
		JLabel idNumber = new JLabel("身份证:");
		idNumber.setFont(new Font("宋体",Font.PLAIN,20));
		idNumber.setBounds(150,240,90,30);
		
		
		JTextField usernameText = new JTextField(200);
		usernameText.setBounds(230,100,200,30);
		//JTextField passwordText = new JTextField(200);
		JPasswordField passwordText = new JPasswordField(15);
		passwordText.setBounds(230,170,200,30);
		JTextField idNumberText = new JTextField();
		idNumberText.setBounds(230,240,200,30);
		
		JButton signIn = new JButton("确认");
		signIn.setBounds(220,310,60,30);
		signIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userNameValue = usernameText.getText();
				String passwordValue = passwordText.getText();
				String idNumberValue = idNumberText.getText();
				if(userNameValue.equals("")) {
					//System.out.println("用户名不能为空！请重新输入");
					JOptionPane.showMessageDialog(
	                        q,
	                        "用户名不能为空！请重新输入",
	                        "0.0",
	                        JOptionPane.WARNING_MESSAGE
	                );
				} else if(passwordValue.equals("")) {
					//System.out.println("密码不能为空！请重新输入");
					JOptionPane.showMessageDialog(
	                        q,
	                        "密码不能为空！请重新输入",
	                        "0.0",
	                        JOptionPane.WARNING_MESSAGE
	                );
				} else if(idNumberValue.equals("")) {
					//System.out.println("身份证号不能为空");
					JOptionPane.showMessageDialog(
	                        q,
	                        "身份证号不能为空",
	                        "0.0",
	                        JOptionPane.WARNING_MESSAGE
	                );
					
				} else {
					try {
						Connection conn = null;
						PreparedStatement pstmt = null;
						Class.forName("com.mysql.jdbc.Driver");

						conn = DriverManager.getConnection("jdbc:mysql://localhost/Ticket?useSSL=true&user=root&password=1234");
						pstmt = conn.prepareStatement("insert into ticket values (?,?,?,?)");
						
						pstmt.setString(1, userNameValue);
						pstmt.setString(2, passwordValue);
						pstmt.setString(3, idNumberValue);
						pstmt.setString(4, null);
						pstmt.executeUpdate();
						
						JOptionPane.showMessageDialog(
		                        q,
		                        "注册成功",
		                        "0.0",
		                        JOptionPane.INFORMATION_MESSAGE
		                );
						dispose();
						
					}catch (ClassNotFoundException e1){
						e1.printStackTrace();
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					
				}
				
			}
			
		});
		JButton cancle = new JButton("取消");
		cancle.setBounds(310,310,60,30);
		cancle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();                  //关闭本页
			}
			
		});
		
		
		this.add(username);
		this.add(password);
		this.add(idNumber);
		this.add(usernameText);
		this.add(passwordText);
		this.add(idNumberText);
		this.add(signIn);
		this.add(cancle);
		
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void setBg(){   
		((JPanel)this.getContentPane()).setOpaque(false);   
		ImageIcon img = new ImageIcon  
		("kfc.jpg");   
		JLabel background = new JLabel(img);  
		this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));   
		background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());   
		} 

}
