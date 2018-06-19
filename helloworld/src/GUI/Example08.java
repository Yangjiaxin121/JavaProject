package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example08 {
	public static void main(String[] args) {
		final Frame f = new Frame("Flowlayout");
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
		f.setSize(200,300);
		f.setLocation(300, 200);
		Button but1 = new Button("第一个按键");
		f.add(but1);
		but1.addActionListener(new ActionListener() {

			private int num = 1;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.add(new Button( "第"+ ++num +"个按钮"));
				f.setVisible(true);
				
			}
			
		});
		f.setVisible(true);
	}

}
