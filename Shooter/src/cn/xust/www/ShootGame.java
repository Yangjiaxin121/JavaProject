package cn.xust.www;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

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
//构造方法注视之后对象肯定不会被创建
//	public ShootGame() {
//		flyings = new FlyingObject[2];
//		flyings[0] = new Airplane();
//		flyings[1] = new Bee();
//		bullets = new Bullet[1];
//		bullets[0] = new Bullet(50,100);
//				
//	}

	
	//工厂模式都是产生对象的，创建敌人·对象过程都是随机的，有可能是敌人有可能是小蜜蜂
	public static FlyingObject nextOne(){
		Random r = new Random();
		int type = r.nextInt(20);
		if(type == 0) {
			return new Bee();      //随机数为0返回蜜蜂对象
		} else {
			return new Airplane();     //随机数为1-19返回敌机对象
		}
		/*
		 * 意思就是说，我们敌方飞机多，而小蜜蜂少
		 * r.nextInt(20); 
		 * 如果随机数是0，我让他创建小蜜蜂对象
		 * 若果随机数是1～19，我让它创建敌人对象AirPlane();
		 */
	}
	int flyEnterIndex = 0;//计算敌人入场的个数
	public void enterAction() {
		flyEnterIndex++;//10毫秒加1
		if(flyEnterIndex%40==0) {    //400（40*10）
			FlyingObject obj = nextOne(); //创建一个敌人的对象
			flyings = Arrays.copyOf(flyings, flyings.length + 1);
			flyings[flyings.length - 1] = obj;
		}
	}
	private void stepActopn() {
		// TODO Auto-generated method stub
		hero.step();
		//遍历敌人，也就是蜜蜂和敌方飞机
		for (int i = 0; i < flyings.length; i++) {
			flyings[i].step();
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();
		}
	}
	int shootIndex = 0;
	private void shootAction() {
		// TODO Auto-generated method stub
		/*
		 * 子弹入场
		 * 10毫秒走一次
		 */
		shootIndex++;      //10毫秒增1
		if (shootIndex%30 == 0) {    //300(30*10)
			Bullet[] bs = hero.shoot();
			bullets = Arrays.copyOf(bullets, bullets.length+bs.length);
			System.arraycopy(bs, 0, bullets, bullets.length-bs.length, bs.length);	
		}
		
	}
	//创建定时器的对象
	private Timer timer;
	private int interval = 10; //毫秒数
	void action(){
		timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				enterAction();//敌人和蜜蜂入场
				stepActopn();//飞行物移动
				shootAction();//英雄机发射子弹，子弹入场
				repaint();//重新画新的飞机
			}

		}, interval,interval);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(background, 0, 0, null);
		paintHero(g);
		FlyingObject(g);
		paintBullet(g);
	}
	//编写方法，画英雄机
	private void paintHero(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(hero.image, hero.x, hero.y, null);
	}
	//画敌方战机
	private void FlyingObject (Graphics g) {
		for (int i = 0; i < flyings.length; i++) {
			 FlyingObject f = flyings[i];
			 g.drawImage(f.image, f.x, f.y, null);
		}
	}
	//子弹
	private void paintBullet(Graphics g) {
		for (int i = 0; i < bullets.length; i++) {
			Bullet b = bullets[i];
			g.drawImage(b.image, b.x, b.y, null);
		}
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
		game.action();
		
		
	}
}
