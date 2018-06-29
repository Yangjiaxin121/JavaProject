package cn.xust.www;

import java.util.Random;

public class Bullet extends FlyingObject{
	private int speed = 3; 
	public Bullet(int x,int y) {
		// TODO Auto-generated constructor stub
		image = ShootGame.bullet;
		height = image.getHeight();        //对未来也充满了憧憬
		width = image.getWidth();
		this.x = x;
		this.y = y;
	}
	@Override
	public void step() {
		// TODO Auto-generated method stub
		y -= speed;
	}

}
