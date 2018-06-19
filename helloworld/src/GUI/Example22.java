package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Example22 extends JFrame{
	public Example22() {
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenu menu = new JMenu("操作");
		menuBar.add(menu);
		JMenuItem item1 = new JMenuItem("弹出窗口");
		JMenuItem item2 = new JMenuItem("关闭");
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JDialog dialog = new JDialog(Example22.this,true);
				dialog.setTitle("弹出窗口");
				dialog.setSize(200,200);
				dialog.setLocation(50,50);
				dialog.setVisible(true);
			}
			
		});
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		menu.add(item1);
		menu.addSeparator();     //添加一个分隔符
		menu.add(item2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Example22();
	}

}
