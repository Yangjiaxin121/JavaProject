package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Cardlayout extends Frame implements ActionListener{

	Panel cardPanel = new Panel();
	Panel controlpaPanel = new Panel();
	Button nexbutton,preButton;
	CardLayout cardLayout = new CardLayout();
	public Cardlayout() {
		setSize(300,200);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Cardlayout.this.dispose();
			}
		});
		//在cardPanel面板对象添加3个文本标签
		cardPanel.setLayout(cardLayout);
		cardPanel.add(new Label("第一个界面",Label.CENTER));
		cardPanel.add(new Label("第二个界面",Label.CENTER));
		cardPanel.add(new Label("第三个界面",Label.CENTER));
		//创建两个按钮对象
		nexbutton = new Button("下一张卡片");
		preButton = new Button("上一张卡片");
		//为按钮对象注册监听器
		nexbutton.addActionListener(this);
		preButton.addActionListener(this);
		controlpaPanel.add(preButton);
		controlpaPanel.add(nexbutton);
		
		this.add(cardPanel, BorderLayout.CENTER);
		this.add(controlpaPanel, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==nexbutton) {
			cardLayout.next(cardPanel);
		}
		if(e.getSource()==preButton) {
			cardLayout.previous(cardPanel);
		}
	}
	
}

public class Example12 {
	public static void main(String[] args) {
		Cardlayout cardlayout = new Cardlayout();
	}

}
