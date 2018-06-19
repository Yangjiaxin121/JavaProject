package GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example15 extends JFrame {
	public Example15() {
		this.setTitle("JFrameTest");
		this.setSize(200,300);
		JButton bt = new JButton("按钮");
		this.setLayout(new FlowLayout());
		this.add(bt);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Example15();
	}
}
