package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Example23 extends JFrame{
	private JPopupMenu popupMenu;
	public Example23() {
		//创建一个JPopupMenu菜单
		popupMenu = new JPopupMenu();
		//创建三个JMenuItem
		JMenuItem refreshItem = new JMenuItem("refresh");
		JMenuItem creatItem = new JMenuItem("creat");
		JMenuItem exitItem = new JMenuItem("exit");
		//添加点击事件
		exitItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		popupMenu.add(refreshItem);
		popupMenu.add(creatItem);
		popupMenu.addSeparator();
		popupMenu.add(exitItem);
		//为JFrame窗口clicked鼠标事件监听器
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getButton()==e.BUTTON3) {
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Example23();
	}

}
