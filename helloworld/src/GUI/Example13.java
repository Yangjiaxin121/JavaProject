package GUI;

import java.awt.Button;
import java.awt.Frame;

public class Example13 {
	public static void main(String[] args) {
		Frame f = new Frame("hello");
		f.setLayout(null);
		f.setSize(300,150);
		Button btn1 = new Button("press");
		Button btn2 = new Button("pop");
		btn1.setBounds(40,60,100,30);
		btn2.setBounds(140,90,100,30);
		f.add(btn1);
		f.add(btn2);
		f.setVisible(true);
	}

}
