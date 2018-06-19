package GUI;

import java.awt.*;
import java.awt.event.*;

public class Example05 {
	public static void main(String[] args) {
		final Frame f = new Frame("WindowEvent");
		f.setSize(400,300);
		f.setLocation(300, 200);
		f.setVisible(true);
		Button btn = new Button("Exit");
		f.add(btn);
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		/*f.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("WindowOpened--窗口打开事件");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("正在关闭事件");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("关闭事件");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("窗口图表化事件");
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("取消图表化事件");
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("窗口激活事件");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("窗口停用事件");
			}
			
		});*/
	}

}
