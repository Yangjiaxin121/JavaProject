package GUI;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Example07 {
	public static void main(String[] args) {
		Frame f = new Frame("KeyEvent");
		f.setLayout(new FlowLayout());
		f.setSize(400,300);
		f.setLocation(300, 200);
		TextField tf = new TextField(30);
		f.add(tf);
		f.setVisible(true);
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int KeyCode = e.getKeyCode();
				String s = KeyEvent.getKeyText(KeyCode);
				System.out.println("输入的内容为："+s+",");
				System.out.println("对应的KeyCode为："+KeyCode);
			}
		});
	}

}
