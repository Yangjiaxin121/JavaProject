import java.awt.Color;
import java.awt.Font;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheckFrame extends JFrame{
	public CheckFrame() {
		setBg();
		this.setLayout(null);
		this.setTitle("星云航空");
		this.setSize(600,400);
		this.setLocation(300, 100);
		this.setLayout(null);
		
		JLabel label1 = new JLabel("欢迎来到机票核对界面",JLabel.CENTER);
		label1.setFont(new Font("宋体",Font.PLAIN,20));
		label1.setForeground(Color.decode("#9C9C9C"));
		label1.setBounds( 200, 10, 200, 80);
		JButton confirminfo = new JButton("确认信息");
		confirminfo.setBounds(300,300,90,30);
		JButton refresh = new JButton("刷新");
		refresh.setBounds(200, 300, 90, 30);
		
		JLabel label2 = new JLabel("您的信息：");
		label2.setForeground(Color.decode("#9C9C9C"));
		label2.setBounds( 20, 55, 200, 80);	
		JLabel label3 = new JLabel("姓名:");
		label3.setForeground(Color.decode("#9C9C9C"));
		label3.setBounds(120, 60, 200, 80);
		JLabel label4 = new JLabel("身份证号:");
		label4.setForeground(Color.decode("#9C9C9C"));
		label4.setBounds(120,120,200,80);
		JLabel label5 = new JLabel("信息:");
		label5.setForeground(Color.decode("#9C9C9C"));
		label5.setBounds(120,180,200,80);
		
		
		entity e = new entity(Util.name,"","","");
		List<String> list=Util.queryinfo(e);
		Object[] arr = list.toArray();
	    String name = (String) arr[0];
	    String idnumber = (String) arr[1];
	    String info = (String) arr[2];
	    
	    JLabel label6 = new JLabel(name);
	    label6.setBounds(160,60,200,80);
	    label6.setForeground(Color.decode("#9C9C9C"));
	    JLabel label7 = new JLabel(idnumber);
	    label7.setBounds(180,120,200,80);
	    label7.setForeground(Color.decode("#9C9C9C"));
	    JLabel label8 = new JLabel(info);
	    label8.setBounds(160,180,200,80);
	    label8.setForeground(Color.decode("#9C9C9C"));
	    
	   // JButton button1 = new JButton("修改姓名");
	   // button1.setBounds(400, 90, 90, 30);
	    JButton button2 = new JButton("修改身份证号");
	    button2.setBounds(400, 150, 120, 30);
	    JButton button3 = new JButton("修改旅游信息");
	    button3.setBounds(400, 210, 120, 30);
	    
	    
	    
	    
		
	    this.add(label1);
		this.add(label2);
		this.add(confirminfo);
		this.add(refresh);
	    this.add(label3);
	    this.add(label4);
	    this.add(label5);
	    this.add(label6);
	    this.add(label7);
	    this.add(label8);
	    //this.add(button1);
	    this.add(button2);
	    this.add(button3);
	    
		
		

		
		
		confirminfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		
		
//		button1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				JFrame frame = new JFrame("请填写新的姓名");
//				frame.setSize(300, 300);
//			    frame.setBounds(100, 100, 300, 300);
//			    frame.setLayout(null);
//			    JTextField newnametext = new JTextField();
//				newnametext.setBounds(70,100,150,30);
//			    JButton cnfir = new JButton("确定");
//			    cnfir.setBounds(100, 200, 90, 30);
//			    frame.add(cnfir);
//			    frame.add(newnametext);
//			    
//			    cnfir.addActionListener(new ActionListener() {
//					
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						// TODO Auto-generated method stub
//						String newname = newnametext.getText();
//						Connection conn = null;
//						Statement stmt = null;
//						boolean rs ;
//						PreparedStatement  psta=null;
//						try {
//							Class.forName("com.mysql.jdbc.Driver");
//
//							
//							conn = DriverManager
//									.getConnection("jdbc:mysql://localhost/Ticket?useSSL=true&user=root&password=1234");
//
//							String sql = "update ticket set name = ? where name = ?;";
//
//							 psta=conn.prepareStatement(sql);  
//							 psta.setString(1,newname);
//		                     psta.setString(2,Util.name);   
//		                     rs=psta.execute(); 
//		                     
//						} catch (ClassNotFoundException e1) {
//							e1.printStackTrace();
//						} catch (SQLException ex) {
//							System.out.println("SQlException:" + ex.getMessage());
//							System.out.println("SQLState:" + ex.getSQLState());
//							System.out.println("VendorError:" + ex.getErrorCode());
//						}
//						 JOptionPane.showMessageDialog(
//			                        frame,
//			                        "棰勫畾鎴愬姛",
//			                        "0.0",
//			                        JOptionPane.INFORMATION_MESSAGE
//			                );
//								
//							
//					
//						frame.setVisible(false);
//					}
//				});
//			    
//			    
//			    
//			    frame.setVisible(true);
//			}
//		});
//		
//		
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFrame frame = new JFrame("请填写新的身份证号");
				frame.setSize(300, 300);
			    frame.setBounds(100, 100, 300, 300);
			    frame.setLayout(null);
			    
				((JPanel)frame.getContentPane()).setOpaque(false);   
				ImageIcon img = new ImageIcon  
				("bg.jpg");   
				JLabel background = new JLabel(img);  
				frame.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));   
				background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());   
				
			    JTextField newidtext = new JTextField();
				newidtext.setBounds(70,100,150,30);
			    JButton cnfir = new JButton("确定");
			    cnfir.setBounds(100, 200, 90, 30);
			    frame.add(cnfir);
			    frame.add(newidtext);
			    
			    
			    cnfir.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						String newid = newidtext.getText();
						Connection conn = null;
						Statement stmt = null;
						boolean rs ;
						PreparedStatement  psta=null;
						try {
							Class.forName("com.mysql.jdbc.Driver");

							
							conn = DriverManager
									.getConnection("jdbc:mysql://localhost/Ticket?useSSL=true&user=root&password=1234");

							String sql = "update ticket set idnumber = ? where name = ?;";

							 psta=conn.prepareStatement(sql);  
							 psta.setString(1,newid);
		                     psta.setString(2,Util.name);   
		                     rs=psta.execute(); 
		                     
						} catch (ClassNotFoundException e1) {
							e1.printStackTrace();
						} catch (SQLException ex) {
							System.out.println("SQlException:" + ex.getMessage());
							System.out.println("SQLState:" + ex.getSQLState());
							System.out.println("VendorError:" + ex.getErrorCode());
						}
						 JOptionPane.showMessageDialog(
			                        frame,
			                        "修改成功",
			                        "0.0",
			                        JOptionPane.INFORMATION_MESSAGE
			                );
						
						
						
						frame.setVisible(false);
					}
				});
			    
			    
			    
			    frame.setVisible(true);
			}
		});
		
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				QueryFrame query = new QueryFrame();
				query.setFrame(query);
				query.MyFrame(Util.name);
			}
		});
		
		
		refresh.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				entity e = new entity();
			    e.name=Util.name;
				List<String> list=Util.queryinfo(e);
				Object[] arr = list.toArray();
			         String name = (String) arr[0];
			         String idnumber = (String) arr[1];
			         String info = (String) arr[2];
			    label6.setText(name);
			    label7.setText(idnumber);
			    label8.setText(info);
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
