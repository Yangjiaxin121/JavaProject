package cn.xust.www;

import java.util.Random;

public class Airplane extends FlyingObject implements Enemy{
	static int speed = 2;
	private int life;


	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 5;
	}
	public Airplane() {
		// TODO Auto-generated constructor stub
		life = 1;
		image = ShootGame.airplane;
		this.ember = ShootGame.airplaneEmber;
		height = image.getHeight();        //对未来也充满了憧憬
		width = image.getWidth();
		Random r = new Random();
		x = r.nextInt(ShootGame.WIDTH - this.width);
		y = -this.height;
	}
	@Override
	public void step() {
		// TODO Auto-generated method stub
		y += speed;	
	}
//	
//	public boolean shootBy(Bullet bullet) {
//		if(super.shootBy(bullet)){
//			life--;
//		}
//		return life==0;
//	}

	
}
