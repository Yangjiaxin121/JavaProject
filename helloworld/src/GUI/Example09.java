package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Example09 {
	public static void main(String[] args) {
		final Frame f= new Frame("BorderLayout");
		f.setLayout(new BorderLayout());
		f.setSize(300,300);
		f.setLocation(300, 200);
		f.setVisible(true);
		//创建5个按钮，分别用于填充BorderLayout的5个区域
		Button but1 = new Button("东部");
		Button but2 = new Button("西部");
		Button but3 = new Button("南部");
		Button but4 = new Button("北部");
		Button but5 = new Button("中部");
		//设置按钮所在区域
		f.add(but1, BorderLayout.EAST);
		f.add(but2, BorderLayout.WEST);
		f.add(but3, BorderLayout.SOUTH);
		f.add(but4, BorderLayout.NORTH);
		f.add(but5, BorderLayout.CENTER);
				
	}

}
