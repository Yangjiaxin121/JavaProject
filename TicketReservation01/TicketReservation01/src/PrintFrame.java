import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

import java.util.List;

public class PrintFrame extends JFrame{
	public PrintFrame() {
		setBg();
		this.setTitle("星云航班");
		this.setSize(600,400);
		this.setLocation(300, 100);
		this.setLayout(null);
		
		JLabel label1 = new JLabel("欢迎来到机票打印",JLabel.CENTER);
		label1.setFont(new Font("宋体",Font.PLAIN,20));
		label1.setForeground(Color.decode("#9C9C9C"));
		label1.setBounds( 200, 10, 200, 80);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label2 = new JLabel("您的信息：");
		label2.setForeground(Color.decode("#9C9C9C"));
		label2.setBounds( 20, 55, 200, 80);
		JButton confirminfo = new JButton("确认信息");
		confirminfo.setBounds(250,300,90,30);
		
		
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
	    label6.setForeground(Color.decode("#9C9C9C"));
	    label6.setBounds(160,60,200,80);
	    JLabel label7 = new JLabel(idnumber);
	    label7.setForeground(Color.decode("#9C9C9C"));
	    label7.setBounds(180,120,200,80);
	    JLabel label8 = new JLabel(info);
	    label8.setForeground(Color.decode("#9C9C9C"));
	    label8.setBounds(160,180,200,80);
		
	    this.add(label1);
		this.add(label2);
		this.add(confirminfo);
	    this.add(label3);
	    this.add(label4);
	    this.add(label5);
	    this.add(label6);
	    this.add(label7);
	    this.add(label8);
	    
		confirminfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame frame = new JFrame("请扫码付款");
				
				((JPanel)frame.getContentPane()).setOpaque(false);   
				ImageIcon img = new ImageIcon  
				("bg.jpg");   
				JLabel background = new JLabel(img);  
				frame.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));   
				background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());   
				
				frame.setSize(300, 300);
			    frame.setBounds(100, 100, 300, 300);
			    frame.setLayout(null);
			    JButton paid = new JButton("已付款");
			    paid.setBounds(100, 200, 90, 30);
			    frame.add(paid);
			    
			    
			    paid.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						frame.setVisible(false);
					}
				});
			    
			    frame.setVisible(true);
			}
		});
		
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
