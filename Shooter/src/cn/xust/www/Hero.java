package cn.xust.www;

import java.awt.image.BufferedImage;
import java.util.Random;



public class Hero extends FlyingObject{
	private int life;       //生命值
	private int score;      //分数值
	private int doubleFire;   //火力值
	private BufferedImage[] images;     //图片数组
	private int index;      //控制切换的频率
	
	private BufferedImage[] images2;
	
	public Hero() {
		// TODO Auto-generated constructor stub
		image = ShootGame.hero0;
		height = image.getHeight();        //对未来也充满了憧憬
		width = image.getWidth();
		x = 150;
		y = 400;
		life = 3;
		doubleFire = 0;
		//就是我们的英雄机是在相互切换所以我定义了一个数组来存放它。
		images = new BufferedImage[] {ShootGame.hero0,ShootGame.hero1};
		images2 = new BufferedImage[] {};
		/*
		 * 两种放手定义数组，静态初始化   int[] arr = {1,2,3};
		 * 				动态初始化     int[] arr = new int[3];
		 * 							int[] arr = new int[]{1,2,3};         p63
		 */
		index = 0;
	}
	//获取生命值
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
//	//获取分数
//	public int getScore() {
//		return score;
//	}
//	public void setScore(int score) {
//		this.score = score;
//	}
	public void addLife() {
		life++;//命加一
	}

	public void addDoubleFire() {
		doubleFire += 40;
	}
	
	@Override
	public void step() {
		// TODO Auto-generated method stub
		image = images[index++/10%images.length];
	}
	//根据火力值判断子弹是单发还是双发
	/*
	 * 英雄级发射子弹（穿件子弹的对象；有可能是单发也有可能是双发，返回类型为Bullet[]）
	 */
	public Bullet[] shoot() {
		int xstep = this.width/4;
		int ystep = 40;
		//火力值为0单发，火力值大于0双发
		if (doubleFire > 0) {
			Bullet[] bullets = new Bullet[2];
			bullets[0] = new Bullet(this.x + 1*xstep, this.y - ystep);
			bullets[1] = new Bullet(this.x + 3*xstep, this.y - ystep);
//			doubleFire -= 2;
			return bullets;
		} else {
			Bullet[] bullets = new Bullet[1];
			bullets[0] = new Bullet(this.x + 2*xstep, this.y - ystep);
			return bullets;
		}
	}
	/**
	 * 传参创建子弹对象
	 * new 子弹对象  是不是要传参数
	 * Bullet类当中有构造方法(int i,int j); x坐标  y坐标
	 * 单倍火力在中心发射  双倍火力在一半的一半发射   将我们的英雄机的宽分为4份
	 * 单倍火力在1/2位置
	 * 双倍火力在1/4和3/4
	 * 我们接下来的步骤是不是就是得到这些坐标点。
	 * 单倍火力
	 * 子弹的x是英雄级的x+1/2英雄级的宽度
	 * 双倍火力
	 * 子弹的x是英雄级的x+1/4英雄级的宽度
	 * 子弹的x是英雄级的x+3/4英雄级的宽度
	 * 
	 */

	public void movedTo(int x, int y) {
		// TODO Auto-generated method stub
		setX(x-width/2);
		setY(y-height/2);
	}
	/**
	 * 让敌方飞机攻击英雄机
	 */
	public boolean hit(FlyingObject other) {
		int x1 = other.x - this.width/2;
		int x2 = other.x  + other.width + this.width/2;
		int y1 = other.y - this.height/2;
		int y2 = other.y + other.height + this.height/2;
		
		//英雄级的中心坐标:
		int hx = this.x + this.width/2;
		int hy = this.y + this.height/2;
		return hx>x1 && hx<x2 && hy>y1 && hy<y2;
		/*
		 * 默认英雄级和敌人撞上了
		 * 英雄机减掉生命值，火力值归零
		 * 敌人消失
		 */
	}
	/*
	 * 生命值减一
	 */
	public void subtractLife() {
		life--;
	}
	/*
	 * 设置火力值
	 */
	public void setDoubleFire(int doubleFire) {
		this.doubleFire = doubleFire;//将传过来的火力值传给英雄机的火力值
	}
	/**
	 * 英雄机和敌人碰撞也是定时发生的
	 * checkGameOverAction()//检查游戏是否结束
	 */
	

}
