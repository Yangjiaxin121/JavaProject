package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Random;

public class Example14 {
	public static void main(String[] args) {
		final Frame frame = new Frame("验证码");
		final Panel panel = new MyPanel();
		frame.add(panel);
		frame.setSize(200,100);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
class MyPanel extends Panel {
	public void paint(Graphics g) {
		int width = 160;
		int height = 40;
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, width-1, height-1);
		Random r = new Random();
		for(int i=0;i<100;i++) {
			int x = r.nextInt(width) - 2;
			int y = r.nextInt(height) - 2;
			g.drawOval(x, y, 2, 2);
		}
			g.setFont(new Font("黑体",Font.BOLD,30));
			g.setColor(Color.BLUE);
			char[] chars = ("0123456789abcdefghijkmnopqrstuvwxyz"
					+"ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<4;j++) {
				int pos = r.nextInt(chars.length);
				char c = chars[pos];
				sb.append(c+" ");
			}
			g.drawString(sb.toString(), 20, 30);
	}
}