package cn.xust.www;

import java.util.Random;


 
public class BigPlane extends FlyingObject implements Enemy, Award{
	static int speed = 1; 
	private int life;
	private int awardType;
	private int i = 0;
	
	public BigPlane() {
		life = 4+ShootGame.level;
		this.image = ShootGame.bigPlane;
		this.ember = ShootGame.bigPlaneEmber;
		width = image.getWidth();
		height = image.getHeight();
		y = -height;       
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH - width);
		awardType = rand.nextInt(2);
	}
	
	public int getType() {
		return awardType;
	}
	
	@Override
	public int getScore() {
		return 50;
	}
	
	
	
	@Override
	public void step() {   //移动
		y += speed;
	}
	
	public boolean shootBy(Bullet bullet) {
		if(super.shootBy(bullet)){
			life--;
		}
		return life==0;
	}
	public Bullet[] shoot1() {
		int xstep = this.width/4;
		int ystep = 20;
		Bullet[] bullets = new Bullet[1];
		bullets[0] = new Bullet(this.x + 2*xstep, this.y - ystep);
		return bullets;
	}
}
