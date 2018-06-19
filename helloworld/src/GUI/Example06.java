package GUI;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Example06 {
	public static void main(String[] args) {
		final Frame f = new Frame("WindowEvent");
		f.setLayout(new FlowLayout());
		f.setSize(300,200);
		f.setLocation(300, 200);
		f.setVisible(true);
		Button but = new Button("Button");
		f.add(but);
		but.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("鼠标完成点击事件");
				if(e.getButton()==e.BUTTON1) {
					System.out.println("鼠标左点击事件");
				}
				if(e.getButton()==e.BUTTON3) {
					System.out.println("鼠标右点击事件");
				}
				if(e.getButton()==e.BUTTON2) {
					System.out.println("鼠标中键点击事件");
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("鼠标按下事件");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("鼠标放开事件");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("鼠标进入按钮区域事件");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("鼠标移出按钮区域事件");
			}
			
		});
	}

}
