package cn.xust.www;

import java.util.Random;


public class Bee extends FlyingObject implements Award{
	private int xspeed = 1;   //x坐标移动速度
	private int yspeed = 2;   //y坐标移动速度
	private int awardType;    //奖励类型
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return awardType;
	}
	public Bee() {
		// TODO Auto-generated constructor stub
		image = ShootGame.bee;
		height = image.getHeight();        //对未来也充满了憧憬
		width = image.getWidth();
		Random r = new Random();
		x = r.nextInt(ShootGame.WIDTH - this.width);
		y = -this.height;
		awardType = r.nextInt(2);
	}
	@Override
	public void step() {
		// TODO Auto-generated method stub
		x += xspeed;
		y += yspeed;
		if (x > ShootGame.WIDTH - this.width) {
			xspeed = -1;
		}
		if (x < 0) {
			xspeed = 1;
		}
	}



}
