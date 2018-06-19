package GUI;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.*;

public class Example19 extends JFrame {
	private JCheckBox italic;
	private JCheckBox bold;
	private JLabel label;
	public Example19() {
		label = new JLabel("传智播客欢迎你！",JLabel.CENTER);
		label.setFont(new Font("宋体",Font.PLAIN,20));
		this.add(label);
		JPanel panel = new JPanel();
		italic = new JCheckBox("ITALIC");
		bold = new JCheckBox("BOLD");
		
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int mode = 0;
				if(bold.isSelected()) {
					mode += Font.BOLD;
				}
				if(italic.isSelected()) {
					mode += Font.ITALIC;
				}
				label.setFont(new Font("宋体",mode,20));
			}
			
		};
		italic.addActionListener(listener);
		bold.addActionListener(listener);
		
		panel.add(italic);
		panel.add(bold);
		
		this.add(panel,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Example19();
	}

}
