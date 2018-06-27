package cn.xust.www;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//新建类ShootGame，加载图片
public class ShootGame extends JPanel{
	public static final int WIDTH = 400;
	public static final int HEIGHT = 654;
	private Hero hero = new Hero();//创建一个英雄机
	private FlyingObject[] flyings = {};//敌人和蜜蜂
	private Bullet[] bullets = {};//子弹
	


	//
	public static BufferedImage background;
	public static BufferedImage start;
	public static BufferedImage pause;
	public static BufferedImage gameover;
	public static BufferedImage airplane;
	public static BufferedImage bee;
	public static BufferedImage bullet;
	public static BufferedImage hero0;
	public static BufferedImage hero1;

	
	static {
		try {
			background = ImageIO.read(ShootGame.class.getResource("background.png"));
			start = ImageIO.read(ShootGame.class.getResource("start.png"));
			pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
			gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
			airplane = ImageIO.read(ShootGame.class.getResource("airplane.png"));
			bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
			bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
			hero0 = ImageIO.read(ShootGame.class.getResource("hero0.png"));
			hero1 = ImageIO.read(ShootGame.class.getResource("hero1.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ShootGame() {
		flyings = new FlyingObject[2];
		flyings[0] = new Airplane();
		flyings[1] = new Bee();
		bullets = new Bullet[1];
		bullets[0] = new Bullet(50,100);
				
	}

	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(background, 0, 0, null);
		paintHero(g);
	}
	//编写方法，画英雄机
	private void paintHero(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(hero.getImage(), hero.x, hero.y, null);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("飞机大战");
		ShootGame game  = new ShootGame();
		frame.add(game);
		frame.setSize(WIDTH, HEIGHT);
		frame .setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		
	}
}
