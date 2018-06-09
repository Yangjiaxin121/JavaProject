import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ticket extends JFrame{
	JButton queryButton;
	JButton checkButton;
	JButton printButton;
	JButton storageButton;
	public Ticket(String userNameValue){
		setBg();
		queryButton = new JButton("查询");
		checkButton = new JButton("核对");
		printButton = new JButton("打印");
		storageButton = new JButton("退出");
		
		this.setTitle("星云航空");
		this.setSize(600,400);
		this.setLocation(300, 100);
		this.setLayout(null);
		
		queryButton.setBounds(120,130,60,30);
		this.add(queryButton);
		queryButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				QueryFrame query = new QueryFrame();
				query.setFrame(query);
				query.MyFrame(userNameValue);
			}
			
		});
		
		checkButton.setBounds(400,130,60,30);
		this.add(checkButton);
		checkButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CheckFrame check = new CheckFrame();
			}
			
		});
		
		printButton.setBounds(120,200,60,30);
		this.add(printButton);
		printButton.addActionListener(new ActionListener() {

			@Override       
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PrintFrame print = new PrintFrame();
			}
			
		});
		
		storageButton.setBounds(400,200,60,30);
		this.add(storageButton);
		storageButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//StorageFrame storage = new StorageFrame();
				dispose();
			}
			
		});
		
		
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
	
}
