package cn.xust.www;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.print.attribute.standard.PrinterState;
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
	public static BufferedImage bigplane;
	public static BufferedImage hero_ember0;

	/*
	 * 游戏分为四种状态，分为start、running、 pause、Game_over，表示游戏开始状态，运行状态，暂停状态
	 * 结束状态
	 * 		鼠标点击事件即就是我们的游戏开始状态start
	 * 		
	 */
	public static final int START = 0;//开始
	public static final int RUNNING = 1;//运行
	public static final int PAUSE = 2;//暂停
	public static final int GAME_OVER = 3;//结束状态
	
	private int state = 0; //记录当前状态，初始为启动状态

	
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
			bigplane = ImageIO.read(ShootGame.class.getResource("bigplane.png"));

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
	/**
	 * 检测子弹与敌人碰撞
	 */
	public void bangAction() {
		// TODO Auto-generated method stub
		/**
		 * 子弹与敌人的碰撞
		 * 1:判断子弹与敌人是否撞上了
		 * 2:英雄级得分或者获得生命和火力值的奖励
		 * 3:敌人消失
		 * 
		 * 		首先第一步：
		 * 			所有子弹和所有敌人的遍历
		 */
//		for (int i = 0; i < bullets.length; i++) {
//			Bullet b = bullets[i];
//			for (int j = 0; j < flyings.length; j++) {
//				FlyingObject f = flyings[j];
//				if (f.shootBy(b)) {//撞上了
//					/*
//					 * 判断被撞敌人的类型，是小蜜蜂还是敌机
//					 * 若是敌机则加分
//					 * 若是小蜜蜂则判断，是生命值还是火力
//					 * 		是生命则增命
//					 * 		是火力则增火力值
//					 * 	被撞敌人消失
//					 */
//					
//				}
//			}
//		}
		for (int i = 0; i < bullets.length; i++) {  //遍历所有子弹
			bang(bullets[i]); //bullets[i]代表每一个子弹和所有敌人相撞
			
		}
	}
	/*
	 * 一个子弹与所有敌人相碰撞
	 */
	int score = 0;
	public void bang(Bullet b) {
		int index = -1;  //被撞敌人的下标不能为0，如果为0默认第一个被撞
		for (int i = 0; i < flyings.length; i++) {//遍历所有敌人
			FlyingObject f = flyings[i];//获取每一个敌人
			if (f.shootBy(b)) {//
					index = i;//记录被准过敌人的下标
					break;//其余敌人不再比较			
			}	
		}
		/*
		 * 检查子弹与所有敌人相撞
		 */
	
		if (index != -1) {//代表有撞上的
			//获取被撞敌人的对象
			FlyingObject one = flyings[index];
			//获取到被撞敌人后得分或者得到火力值，此时要判断被准过对象是什么东东呢？
			//若果被撞对象是敌人
			if (one instanceof Enemy) {
				Enemy e = (Enemy)one;//将被撞对象强转为敌人累计加分
				//因为分数要画在页面上
				score += e.getScore();
			}
			//如果被撞对象是
			if (one instanceof Award) {//若果被撞对象是奖励类型
				Award a = (Award)one;
				int type = a.getType();//获取奖励类型并判断
				switch (type) {
				case Award.DOUBLE_FIRE:
					hero.addDoubleFire();//若奖励类型为火力值
					break;

				case Award.LIFE://若奖励类型为生命值
					hero.addLife();
					break;
				}
				/*
				 * 第三步：将被撞的敌人对象消失--------从flyings数组中删除
				 * 1：消失意味着在页面上不再画出来
				 * 2：画的是flyings数组中的对象
				 * 3:flyings数组中有的就能画出来
				 * 	flyings数组中没有的就画不出来
				 * 4:消失意味着对象不存在
				 * 	将被撞的敌人对象从数组中删除flyings
				 */
				
			}
			FlyingObject f = flyings[index];
			flyings[index] = flyings[flyings.length-1];
			flyings[flyings.length-1] = f;
			//缩容（删除最后一个元素，即就是被撞的敌人对象）
			flyings = Arrays.copyOf(flyings, flyings.length-1);
		}
		
	}
	
	public void checkGameOverAction() {
		// TODO Auto-generated method stub
		if (isGameOver()) {//游戏结束
			//什么时候游戏结束，英雄级的命数小于等于0
			//英雄级为1，蜜蜂和敌机同时碰撞英雄机，英雄机命数为-1
			//游戏结束，游戏的开始，游戏的运行，暂停
			state = GAME_OVER;
			
		}
	}
	private boolean isGameOver() {
		// TODO Auto-generated method stub
		//一个英雄机和所有敌人碰撞
		for (int i = 0; i < flyings.length; i++) {//遍历所有敌人
			FlyingObject f = flyings[i];
			if (hero.hit(f)) {//撞上了
				hero.subtractLife();
				hero.setDoubleFire(0);
				//将被撞敌人于数组对后一个元素交换
				FlyingObject t = flyings[i];
				flyings[i] = flyings[flyings.length-1];
				flyings[flyings.length-1] = t;
				flyings = Arrays.copyOf(flyings, flyings.length-1);
			}
		}
		return hero.getLife() <= 0;//英雄级命数小于1等于0即游戏结束
	}
	//创建定时器的对象
	private Timer timer;
	private int interval = 10; //毫秒数
	void action(){
		MouseAdapter l = new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				switch (state) {//根据当前状态操作
				case START:  //启动状态
					state = RUNNING;
					break;
				
				case GAME_OVER:
					score = 0;
					hero = new Hero();
					flyings = new FlyingObject[0];
					bullets = new Bullet[0];
					state = START;        //游戏变为启动状态
					break;
//				case RUNNING:
//					state = START;
//					break;
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseReleased(e);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				//鼠标进入事件，从停滞状态变为运行状态
				if (state == PAUSE) {
					state = RUNNING;

				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				//鼠标离开事件，从运行状态变为停滞状态
				if (state == RUNNING) {
					state = PAUSE;
				}
			
			}

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				// TODO Auto-generated method stub
				super.mouseWheelMoved(e);
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseDragged(e);
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseMoved(e);
				if (state == RUNNING) {
					//获取鼠标的坐标
					int x = e.getX();
					int y = e.getY();
					hero.movedTo(x,y);
				}

			}
			
		};
		this.addMouseListener(l);
		this.addMouseMotionListener(l);
		/**
		 * 英雄级随鼠标移动
		 * 事件：发生了一件事情
		 * 处理事件：发生这个事件之后我们所要做的处理
		 * 事件：
		 * 	鼠标点击事件-----启动状态变成运行状态
		 * 	鼠标移动事件-----英雄机跟着移动
		 * 	鼠标移开之后-----运行状态变为暂停状态
		 * 	鼠标进入-----暂停状态变为运行状态
		 * 
		 * 	如何将事件和事件处理联系在一起监听器
		 * 	
		 * 	采用监听器需如下两步：
		 * 		1.创建监听器对象
		 * 		2.安装监听器
		 * 			谁在操作呢？---在操作谁呢？----  鼠标在操作飞机
		 * 		3.这些事件都在谁的操作呢？
		 * 			因此我们要将监听器安装在面板上，对不对？
		 * 	
		 * 		//创建监听器的对象
		 * 		MouseListener m1 =- new MouseListener(){
		 * 		重写：
		 * 
		 * 			mouseClicked()
		 * 			mouseReleased
		 * 			...
		 * 		}
		 *		//将监听器安装到面板上
		 *		this.addMouseListener(ml);
		 *		this.addMOuseListener(mml);
		 *
		 *		让英雄级随着鼠标的移动而移动，需要重写mouseMove方法
		 * 
		 */

		timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {//运行时
				// TODO Auto-generated method stub
				if (state == RUNNING) {
					enterAction();//敌人和蜜蜂入场
					stepActopn();//飞行物移动
					shootAction();//英雄机发射子弹，子弹入场
					bangAction();
					checkGameOverAction();
				}
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
		paintScore(g);//画分和画命
		PrinterState(g);
	}
	
	public void PrinterState(Graphics g) {
		// TODO Auto-generated method stub
		//根据当前的不同状态画不同的图
		switch (state) {
		case START:
			g.drawImage(start, 0, 0, null);
			break;
			
		case PAUSE:
			g.drawImage(pause, 0, 0, null);
			break;
			
		case GAME_OVER:
			g.drawImage(gameover, 0, 0, null);
			break;
	
		}
	}
	//画分数和命
	private void paintScore(Graphics g) {
		// TODO Auto-generated method stub
		//改变分数的样式（颜色和字体）
		//g.drawImage("分数:"+ score, 10, 25, null);
		g.setColor(Color.RED);
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		g.drawString("Score:"+score, 10, 25);
		g.drawString("Life:"+hero.getLife(), 10, 45);
		
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
