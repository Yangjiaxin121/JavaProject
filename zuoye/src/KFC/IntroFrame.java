package KFC;

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

public class IntroFrame extends JFrame{
	public IntroFrame() {
		setBg();
		this.setLayout(null);
		this.setTitle("KFC");
		this.setSize(600,400);
		this.setLocation(300, 100);
		this.setLayout(null);
		
		JLabel label1 = new JLabel("KFC's introduce",JLabel.CENTER);
		label1.setFont(new Font("宋体",Font.PLAIN,20));
		label1.setBounds( 200, 10, 200, 80);
		
		String string = "“生活如此多娇”、“尽情自在肯德基”。";
		JLabel label2 = new JLabel(string);
		label2.setBounds( 100, 90,  300, 80);	
		
		String string3 = "肯德基——鸡群中的战斗机！";
		JLabel label3 = new JLabel(string3);
		label3.setBounds( 100, 150,  300, 80);	
		
		String string4 = "因为你，生活如此美丽——肯德基，来自异域风情的魅力....";
		JLabel label4 = new JLabel(string4);
		label4.setBounds( 100, 210,  300, 80);	
		
		
	    this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);

				

		
		
		
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
