package cn.xust.www;

import java.awt.image.BufferedImage;
import java.util.Random;



public class Hero extends FlyingObject{
	private int life;       //生命值
	private int doubleFire;   //火力值
	private BufferedImage[] images;     //图片数组
	private int index;      //控制切换的频率
	
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
		/*
		 * 两种放手定义数组，静态初始化   int[] arr = {1,2,3};
		 * 				动态初始化     int[] arr = new int[3];
		 * 							int[] arr = new int[]{1,2,3};         p63
		 */
		index = 0;
	}
	
}
