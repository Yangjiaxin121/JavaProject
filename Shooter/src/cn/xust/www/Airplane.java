package cn.xust.www;

import java.util.Random;

public class Airplane extends FlyingObject implements Enemy{
	private int speed = 2;
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Airplane() {
		// TODO Auto-generated constructor stub
		image = ShootGame.airplane;
		height = image.getHeight();        //对未来也充满了憧憬
		width = image.getWidth();
		Random r = new Random();
		x = r.nextInt(ShootGame.WIDTH - this.width);
		y = -this.height;
	}

}
