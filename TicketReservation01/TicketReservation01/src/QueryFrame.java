import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QueryFrame extends JFrame{
	private  QueryFrame q;
	
   public void setFrame(QueryFrame qq) {
	   q = qq;
   }
	
	
	public void  MyFrame(String userNameValue) {
		setBg();
		setTitle("机票查询界面");
		this.setSize(600,400);
		this.setLocation(300, 100);
		this.setLayout(null);
		
		JLabel label = new JLabel("欢迎来到机票查询",JLabel.CENTER);
		label.setFont(new Font("宋体",Font.PLAIN,20));
		label.setForeground(Color.decode("#9C9C9C"));
		label.setBounds( 200, 10, 200, 80);
		this.add(label);
		
		String str1 = "北京----伦敦 7.15--7.22  ¥22622";
		JLabel label_1 = new JLabel(str1);
		label_1.setFont(new Font("宋体",Font.PLAIN,13));
		label_1.setForeground(Color.decode("#9C9C9C"));
		label_1.setBounds( 60, 80, 240, 80);
		this.add(label_1);
		
		String str2 = "北京----澳门 6.4--6.11  ¥930";
		JLabel label_2 = new JLabel(str2);
		label_2.setFont(new Font("宋体",Font.PLAIN,13));
		label_2.setForeground(Color.decode("#9C9C9C"));
		label_2.setBounds( 60, 120, 240, 80);
		this.add(label_2);
		
		String str3 = "北京----悉尼 5.9--5.21  ¥11400";
		JLabel label_3 = new JLabel(str3);
		label_3.setFont(new Font("宋体",Font.PLAIN,13));
		label_3.setForeground(Color.decode("#9C9C9C"));
		label_3.setBounds( 60, 160, 240, 80);
		this.add(label_3);
		
		String str4 = "北京----纽约 5.10--5.11  ¥10300";
		JLabel label_4 = new JLabel(str4);
		label_4.setFont(new Font("宋体",Font.PLAIN,13));
		label_4.setForeground(Color.decode("#9C9C9C"));
		label_4.setBounds( 60, 200, 240, 80);
		this.add(label_4);
		
		String str5 = "北京----新加坡 6.9--6.11  ¥8400";
		JLabel label_5 = new JLabel(str5);
		label_5.setFont(new Font("宋体",Font.PLAIN,13));
		label_5.setForeground(Color.decode("#9C9C9C"));
		label_5.setBounds( 60, 240, 240, 80);
		this.add(label_5);
		
		JButton b1 = new JButton("预定");
		b1.setBounds(400, 105, 60, 30);
		this.add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				try {
//					FileWriter writer = new FileWriter("writer.txt");
//					writer.write(str1);
//					writer.write("\r\n");
//					writer.close();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				Connection conn = null;
				Statement stmt = null;
				boolean rs ;
				PreparedStatement  psta=null;
				try {
					
					//userNameValue;
					//String passwordValue = passwordText.getText();
					Class.forName("com.mysql.jdbc.Driver");

					
					conn = DriverManager
							.getConnection("jdbc:mysql://localhost/Ticket?useSSL=true&user=root&password=1234");
					//stmt = conn.createStatement();
					//String sql = "select * from ticket where name = ?;";
					String sql = "update ticket set info = ? where name = ?;";
					//rs = stmt.executeQuery("select * from ticket where name = ?;");
					//rs = stmt.executeQuery("select * from ticket where name = 'yang12';");
					 psta=conn.prepareStatement(sql);  
					 psta.setString(1,str1);
                     psta.setString(2,userNameValue);   
                     rs=psta.execute(); 
                     
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException ex) {
					System.out.println("SQlException:" + ex.getMessage());
					System.out.println("SQLState:" + ex.getSQLState());
					System.out.println("VendorError:" + ex.getErrorCode());
				}
				 JOptionPane.showMessageDialog(
	                        q,
	                        "预定成功",
	                        "0.0",
	                        JOptionPane.INFORMATION_MESSAGE
	                );

				
			}
			
		});
		
		JButton b2 = new JButton("预定");
		b2.setBounds(400, 145, 60, 30);
		this.add(b2);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Connection conn = null;
				Statement stmt = null;
				boolean rs ;
				PreparedStatement  psta=null;
				try {
					
					//userNameValue;
					//String passwordValue = passwordText.getText();
					Class.forName("com.mysql.jdbc.Driver");

					
					conn = DriverManager
							.getConnection("jdbc:mysql://localhost/Ticket?useSSL=true&user=root&password=1234");
					//stmt = conn.createStatement();
					//String sql = "select * from ticket where name = ?;";
					String sql = "update ticket set info = ? where name = ?;";
					//rs = stmt.executeQuery("select * from ticket where name = ?;");
					//rs = stmt.executeQuery("select * from ticket where name = 'yang12';");
					 psta=conn.prepareStatement(sql);  
					 psta.setString(1,str2);
                     psta.setString(2,userNameValue);   
                     rs=psta.execute(); 
                     
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException ex) {
					System.out.println("SQlException:" + ex.getMessage());
					System.out.println("SQLState:" + ex.getSQLState());
					System.out.println("VendorError:" + ex.getErrorCode());
				}
				 JOptionPane.showMessageDialog(
	                        q,
	                        "预定成功",
	                        "0.0",
	                        JOptionPane.INFORMATION_MESSAGE
	                );

			}
			
		});
		
		JButton b3 = new JButton("预定");
		b3.setBounds(400, 185, 60, 30);
		this.add(b3);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Connection conn = null;
				Statement stmt = null;
				boolean rs ;
				PreparedStatement  psta=null;
				try {
					
					//userNameValue;
					//String passwordValue = passwordText.getText();
					Class.forName("com.mysql.jdbc.Driver");

					
					conn = DriverManager
							.getConnection("jdbc:mysql://localhost/Ticket?useSSL=true&user=root&password=1234");
					//stmt = conn.createStatement();
					//String sql = "select * from ticket where name = ?;";
					String sql = "update ticket set info = ? where name = ?;";
					//rs = stmt.executeQuery("select * from ticket where name = ?;");
					//rs = stmt.executeQuery("select * from ticket where name = 'yang12';");
					 psta=conn.prepareStatement(sql);  
					 psta.setString(1,str3);
                     psta.setString(2,userNameValue);   
                     rs=psta.execute(); 
                     
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException ex) {
					System.out.println("SQlException:" + ex.getMessage());
					System.out.println("SQLState:" + ex.getSQLState());
					System.out.println("VendorError:" + ex.getErrorCode());
				}
				 JOptionPane.showMessageDialog(
	                        q,
	                        "预定成功",
	                        "0.0",
	                        JOptionPane.INFORMATION_MESSAGE
	                );

			}
			
		});
		
		JButton b4 = new JButton("预定");
		b4.setBounds(400, 225, 60, 30);
		this.add(b4);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Connection conn = null;
				Statement stmt = null;
				boolean rs ;
				PreparedStatement  psta=null;
				try {
					
					//userNameValue;
					//String passwordValue = passwordText.getText();
					Class.forName("com.mysql.jdbc.Driver");

					
					conn = DriverManager
							.getConnection("jdbc:mysql://localhost/Ticket?useSSL=true&user=root&password=1234");
					//stmt = conn.createStatement();
					//String sql = "select * from ticket where name = ?;";
					String sql = "update ticket set info = ? where name = ?;";
					//rs = stmt.executeQuery("select * from ticket where name = ?;");
					//rs = stmt.executeQuery("select * from ticket where name = 'yang12';");
					 psta=conn.prepareStatement(sql);  
					 psta.setString(1,str4);
                     psta.setString(2,userNameValue);   
                     rs=psta.execute(); 
                     
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException ex) {
					System.out.println("SQlException:" + ex.getMessage());
					System.out.println("SQLState:" + ex.getSQLState());
					System.out.println("VendorError:" + ex.getErrorCode());
				}
				 JOptionPane.showMessageDialog(
	                        q,
	                        "预定成功",
	                        "0.0",
	                        JOptionPane.INFORMATION_MESSAGE
	                );

			}
			
		});
		
		JButton b5 = new JButton("预定");
		b5.setBounds(400, 265, 60, 30);
		this.add(b5);
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Connection conn = null;
				Statement stmt = null;
				boolean rs ;
				PreparedStatement  psta=null;
				try {
					
					//userNameValue;
					//String passwordValue = passwordText.getText();
					Class.forName("com.mysql.jdbc.Driver");

					
					conn = DriverManager
							.getConnection("jdbc:mysql://localhost/Ticket?useSSL=true&user=root&password=1234");
					//stmt = conn.createStatement();
					//String sql = "select * from ticket where name = ?;";
					String sql = "update ticket set info = ? where name = ?;";
					//rs = stmt.executeQuery("select * from ticket where name = ?;");
					//rs = stmt.executeQuery("select * from ticket where name = 'yang12';");
					 psta=conn.prepareStatement(sql);  
					 psta.setString(1,str5);
                     psta.setString(2,userNameValue);   
                     rs=psta.execute(); 
                     
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException ex) {
					System.out.println("SQlException:" + ex.getMessage());
					System.out.println("SQLState:" + ex.getSQLState());
					System.out.println("VendorError:" + ex.getErrorCode());
				}
				 JOptionPane.showMessageDialog(
	                        q,
	                        "预定成功",
	                        "0.0",
	                        JOptionPane.INFORMATION_MESSAGE
	                );

			}
			
		});
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

}
