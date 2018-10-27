package KFC;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HomePage extends JFrame{
	JButton orderButton;
	JButton checkButton;
	JButton printButton;
	JButton storageButton;
	public HomePage(){
		setBg();
		orderButton = new JButton("点餐");
		checkButton = new JButton("介绍");
		printButton = new JButton("我的");
		storageButton = new JButton("退出");
		
		this.setTitle("KFC");
		this.setSize(600,400);
		this.setLocation(300, 100);
		this.setLayout(null);
		
		orderButton.setBounds(120,130,60,30);
		this.add(orderButton);
		orderButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				OrderyFrame orderyFrame = new OrderyFrame();
				orderyFrame.setFrame(orderyFrame);
				orderyFrame.MyFrame();
			}
			
		});
		
		checkButton.setBounds(400,130,60,30);
		this.add(checkButton);
		checkButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//CheckFrame check = new CheckFrame();
				IntroFrame introFrame = new IntroFrame();
			}
			
		});
		
		printButton.setBounds(120,200,60,30);
		this.add(printButton);
		printButton.addActionListener(new ActionListener() {

			@Override       
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//PrintFrame print = new PrintFrame();
				JOptionPane.showMessageDialog(
                        null,
                        "你是我的心，你是我的肝，你是我生命的四分之三",
                        "0.0",
                        JOptionPane.INFORMATION_MESSAGE
                );
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
		
		
		JLabel label = new JLabel("欢迎来到KFC",JLabel.CENTER);
		label.setFont(new Font("宋体",Font.PLAIN,20));
		label.setBounds( 200, 10, 200, 80);
		this.add(label);
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
