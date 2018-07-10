package cn.xust.www;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	//定义属性 protected  由于这几个属性要被子类使用因此我们定义为protected
	protected BufferedImage image;
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	public BufferedImage[] ember;
	public abstract void step();//有抽象方法的类是抽象类
	

	

	/**
	 * 敌人被子弹碰到 敌人：this 子弹：bullet
	 * @param obj
	 * @return
	 */

	public boolean shootBy(Bullet bullet){
		if(bullet.isBomb()){
			return false;
		}
		int x = bullet.x;  //子弹横坐标
		int y = bullet.y;  //子弹纵坐标
		boolean shoot = this.x<x && x<this.x+width && this.y<y && y<this.y+height;
		if(shoot){
			bullet.setBomb(true);
		}
		return shoot;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
