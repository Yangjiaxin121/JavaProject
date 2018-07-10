package cn.xust.www;

import java.util.Random;

public class Bullet extends FlyingObject{
	private int speed = 3; 
	private boolean bomb;
	public Bullet(int x,int y) {
		// TODO Auto-generated constructor stub
		image = ShootGame.bullet;
		height = image.getHeight();        //对未来也充满了憧憬
		width = image.getWidth();
		this.x = x;
		this.y = y;
	}
	public void setBomb(boolean bomb) {
		this.bomb = bomb;
	}
	
	public boolean isBomb() {
		return bomb;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		y -= speed;
	}
	
	/**
	 * 子弹碰到敌机，敌人消失，子弹不消失
	 * 分析碰撞的行为属于哪个对象   
	 *  class Bullet{
	 *  	public boolean shoot(FlyingObject obj){
	 *  		this:子弹 obj：敌人
	 *  	}
	 *  }
	 *  
	 *  class FlyingObject{
	 *  	public boolean shootBy(Bullet obj){
	 *  		
	 *  	}
	 *  }
	 */

}
