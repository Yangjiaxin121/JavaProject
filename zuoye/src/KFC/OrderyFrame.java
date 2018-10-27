package KFC;

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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class OrderyFrame extends JFrame{
	
	public  Set<String> menuSet = new HashSet<>();
	private  OrderyFrame q;
	
   public void setFrame(OrderyFrame qq) {
	   q = qq;
   }
	
	
	public void  MyFrame() {
		setBg();
		setTitle("KFC界面");
		this.setSize(600,400);
		this.setLocation(300, 100);
		this.setLayout(null);
		
		JLabel label = new JLabel("欢迎来到KFC点餐",JLabel.CENTER);
		label.setFont(new Font("宋体",Font.PLAIN,20));
		label.setBounds( 200, 10, 200, 80);
		this.add(label);
		
		String str1 = "主食";
		JLabel label_1 = new JLabel(str1);
		label_1.setFont(new Font("宋体",Font.PLAIN,15));
		label_1.setBounds( 100, 60, 240, 80);
		this.add(label_1);
		
		String str2 = "饮料";
		JLabel label_2 = new JLabel(str2);
		label_2.setFont(new Font("宋体",Font.PLAIN,15));
		label_2.setBounds( 280, 60, 240, 80);
		this.add(label_2);
		
		String str3 = "小吃";
		JLabel label_3 = new JLabel(str3);
		label_3.setFont(new Font("宋体",Font.PLAIN,15));
		label_3.setBounds( 480, 60, 240, 80);
		this.add(label_3);
		

//		JLabel label_4 = new JLabel(str4);
//		label_4.setFont(new Font("宋体",Font.PLAIN,15));
//		label_4.setForeground(Color.decode("#9C9C9C"));
//		label_4.setBounds( 100, 100, 240, 80);
//		this.add(label_4);
		
		String food1 = "鸡排饭";
		JCheckBox checkBox1 = new JCheckBox(food1);
		checkBox1.setFont(new Font("宋体",Font.PLAIN,15));
		checkBox1.setBounds( 100, 100, 100, 70);
		this.add(checkBox1);
		
		JLabel priceLabel1 = new JLabel("20元");
		priceLabel1.setFont(new Font("宋体",Font.PLAIN,15));
		priceLabel1.setBounds( 190, 100, 100, 70);
		this.add(priceLabel1);
		
		checkBox1.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					menuSet.add(checkBox.getText());
				}else {
					menuSet.remove(checkBox.getText());
				}
			}
		});
		
		String food2 = "汉堡包";
		JCheckBox checkBox2 = new JCheckBox(food2);
		checkBox2.setFont(new Font("宋体",Font.PLAIN,15));
		checkBox2.setBounds( 100, 150, 100, 70);
		this.add(checkBox2);
		
		JLabel priceLabel2 = new JLabel("15元");
		priceLabel2.setFont(new Font("宋体",Font.PLAIN,15));
		priceLabel2.setBounds( 190, 150, 100, 70);
		this.add(priceLabel2);
		
		checkBox2.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					menuSet.add(checkBox.getText());
				}else {
					menuSet.remove(checkBox.getText());
				}
			}
		});
		
		String food3 = "全家桶";
		JCheckBox checkBox3 = new JCheckBox(food3);
		checkBox3.setFont(new Font("宋体",Font.PLAIN,15));
		checkBox3.setBounds( 100, 200, 100, 70);
		this.add(checkBox3);
		
		JLabel priceLabel3 = new JLabel("30元");
		priceLabel3.setFont(new Font("宋体",Font.PLAIN,15));
		priceLabel3.setBounds( 190, 200, 100, 70);
		this.add(priceLabel3);
		
		checkBox3.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					menuSet.add(checkBox.getText());
				}else {
					menuSet.remove(checkBox.getText());
				}
			}
		});
		
		String food4 = "咖啡";
		JCheckBox checkBox4 = new JCheckBox(food4);
		checkBox4.setFont(new Font("宋体",Font.PLAIN,15));
		checkBox4.setBounds( 280, 100, 100, 70);
		this.add(checkBox4);
		
		JLabel priceLabel4 = new JLabel("15元");
		priceLabel4.setFont(new Font("宋体",Font.PLAIN,15));
		priceLabel4.setBounds(370, 100, 100, 70);
		this.add(priceLabel4);
		
		checkBox4.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					menuSet.add(checkBox.getText());
				}else {
					menuSet.remove(checkBox.getText());
				}
			}
		});
		
		String food5 = "果汁";
		JCheckBox checkBox5 = new JCheckBox(food5);
		checkBox5.setFont(new Font("宋体",Font.PLAIN,15));
		checkBox5.setBounds( 280, 150, 100, 70);
		this.add(checkBox5);
		
		JLabel priceLabel5 = new JLabel("10元");
		priceLabel5.setFont(new Font("宋体",Font.PLAIN,15));
		priceLabel5.setBounds(370, 150, 100, 70);
		this.add(priceLabel5);
		
		checkBox5.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					menuSet.add(checkBox.getText());
				}else {
					menuSet.remove(checkBox.getText());
				}
			}
		});
		
		String food6 = "奶茶";
		JCheckBox checkBox6 = new JCheckBox(food6);
		checkBox6.setFont(new Font("宋体",Font.PLAIN,15));
		checkBox6.setBounds( 280, 200, 100, 70);
		this.add(checkBox6);
		
		JLabel priceLabel6 = new JLabel("15元");
		priceLabel6.setFont(new Font("宋体",Font.PLAIN,15));
		priceLabel6.setBounds(370, 200, 100, 70);
		this.add(priceLabel6);
		
		checkBox6.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					menuSet.add(checkBox.getText());
				}else {
					menuSet.remove(checkBox.getText());
				}
			}
		});
		
		String food7 = "蛋挞";
		JCheckBox checkBox7 = new JCheckBox(food7);
		checkBox7.setFont(new Font("宋体",Font.PLAIN,15));
		checkBox7.setBounds( 480, 100, 100, 70);
		this.add(checkBox7);
		
		JLabel priceLabel7 = new JLabel("5元");
		priceLabel7.setFont(new Font("宋体",Font.PLAIN,15));
		priceLabel7.setBounds(560, 100, 100, 70);
		this.add(priceLabel7);
		
		checkBox7.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					menuSet.add(checkBox.getText());
				}else {
					menuSet.remove(checkBox.getText());
				}
			}
		});
		
		String food8 = "薯条";
		JCheckBox checkBox8 = new JCheckBox(food8);
		checkBox8.setFont(new Font("宋体",Font.PLAIN,15));
		checkBox8.setBounds( 480, 150, 100, 70);
		this.add(checkBox8);
		
		JLabel priceLabel8 = new JLabel("10元");
		priceLabel8.setFont(new Font("宋体",Font.PLAIN,15));
		priceLabel8.setBounds(560, 150, 100, 70);
		this.add(priceLabel8);
		
		checkBox8.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					menuSet.add(checkBox.getText());
				}else {
					menuSet.remove(checkBox.getText());
				}
			}
		});
		
		String food9 = "薯条";
		JCheckBox checkBox9 = new JCheckBox(food9);
		checkBox9.setFont(new Font("宋体",Font.PLAIN,15));
		checkBox9.setBounds( 480, 200, 100, 70);
		this.add(checkBox9);
		
		JLabel priceLabel9 = new JLabel("10元");
		priceLabel9.setFont(new Font("宋体",Font.PLAIN,15));
		priceLabel9.setBounds(560, 200, 100, 70);
		this.add(priceLabel9);
		
		checkBox9.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					menuSet.add(checkBox.getText());
				}else {
					menuSet.remove(checkBox.getText());
				}
			}
		});
		

		JButton b1 = new JButton("预定");
		b1.setBounds(450, 300, 60, 30);
		this.add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				 JOptionPane.showMessageDialog(
	                        q,
	                        "预定成功",
	                        "0.0",
	                        JOptionPane.INFORMATION_MESSAGE
	                );
				 
				 System.out.println(menuSet);
				 
				 JFrame frame = new JFrame("请扫码付款");
					
					((JPanel)frame.getContentPane()).setOpaque(false);   
					ImageIcon img = new ImageIcon  
					("kfc.jpg");   
					JLabel background = new JLabel(img);  
					frame.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));   
					background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());   
					
					double totalPrice = getTotalPrice();
					JLabel priceLabel = new JLabel("请付款"+ totalPrice +"元");
					priceLabel.setFont(new Font("宋体",Font.PLAIN,15));
					priceLabel.setBounds(100, 100, 120, 30);
					frame.add(priceLabel);
					

					
					int couponsPrice = (int) (Math.random()*10);
					JLabel coupons = new JLabel("优惠券" + couponsPrice);
					coupons.setFont(new Font("宋体",Font.PLAIN,15));
					coupons.setBounds(100, 130, 120, 30);
					frame.add(coupons);
					
					JLabel payLabel = new JLabel("付款");
					payLabel.setFont(new Font("宋体",Font.PLAIN,15));
					payLabel.setBounds(100, 160, 120, 30);
					frame.add(payLabel);
					
					JTextField jTextArea = new JTextField(200);
					jTextArea.setBounds(140, 160, 120, 30);
					frame.add(jTextArea);
					
					frame.setSize(300, 300);
				    frame.setBounds(100, 100, 300, 300);
				    frame.setLayout(null);
				    JButton paid = new JButton("付款");
				    paid.setBounds(100, 200, 90, 30);
				    paid.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							double result = Double.parseDouble(jTextArea.getText()) + couponsPrice - totalPrice;
							
							if (result<0) {
								coupons.setText("金额不够支付");
							} else {
								coupons.setText("找零:"+ result);
							}
							
						}
						
					});
				    frame.add(paid);
				    
				    

				    
				    frame.setVisible(true);
				
			}
			
		});

		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public double getTotalPrice() {
		double totalPrice = 0.0;
		Food food;
		for (String string : menuSet) {
			food = getFood(string);
			totalPrice = totalPrice + food.getPrice();
		}
		System.out.println(totalPrice);
		return totalPrice;
	}
	  //使用 getFood方法获取形状类型的对象
	public Food getFood(String foodType) {
		if (foodType == null) {
			return null;
		}
		if (foodType.equalsIgnoreCase("鸡排饭")) {
			return new ChickenRice();
		} else if (foodType.equalsIgnoreCase("汉堡包")) {
			return new Hamburger();
		} else if (foodType.equalsIgnoreCase("全家桶")) {
			return new Buckets();
		} else if (foodType.equals("奶茶")) {
			return new Milktea();
		} else if (foodType.equals("咖啡")) {
			return new Coffee();
		} else if (foodType.equals("果汁")) {
			return new Juice();
		} else if (foodType.equals("蛋挞")) {
			return new EggTart();
		} else if (foodType.equals("薯条")) {
			return new French();
		} else if (foodType.equals("鸡米花")) {
			return new PopcornChicken();
		}
		return null;
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
