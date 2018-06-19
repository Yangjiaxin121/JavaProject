package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example16 {
	public static void main(String[] args) {
		JButton btn1 = new JButton("模态对话框");
		JButton btn2 = new JButton("非模态对话框");
		JFrame f = new JFrame("DialogDemo");
		f.setSize(300, 250);
		f.setLocation(300, 200);
		f.setLayout(new FlowLayout());
		f.add(btn1);
		f.add(btn2);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		final JLabel label = new JLabel();
		final JDialog dialog = new JDialog(f,"Dialog");
		dialog.setSize(220,150);
		dialog.setLayout(new FlowLayout());
		final JButton btn3 = new JButton("确定");
		dialog.add(btn3);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.setModal(true);
				if(dialog.getComponents().length==1) {
					dialog.add(label);
				}
				label.setText("模式对话框，点击确定按钮关闭");
				dialog.setVisible(true);
			}
			
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.setModal(false);
				if(dialog.getComponents().length==1) {
					dialog.add(label);
				}
				label.setText("模式对话框，点击确定按钮关闭");
				dialog.setVisible(true);
			}
			
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.dispose();
			}
			
		});
	}

}
