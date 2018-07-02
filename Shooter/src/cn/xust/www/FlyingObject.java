package cn.xust.www;

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
	//定义属性 protected  由于这几个属性要被子类使用因此我们定义为protected
	protected BufferedImage image;
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	public abstract void step();//有抽象方法的类是抽象类
	
	/**
	 * 敌人被子弹碰到 敌人：this 子弹：bullet
	 * @param obj
	 * @return
	 */
	public boolean shootBy(Bullet bullet){
		int x1 = this.x;//x1:敌人的x
		int x2 = this.x + this.width;//x2:敌人的x与敌人的宽度之和
		int y1 = this.y;
		int y2 = this.y + this.height;
		int x = bullet.x;
		int y = bullet.y;
		return x > x1 && x < x2 && y >y1 && y<y2;
//		if ((bullet.x > this.x && bullet.x < this.x + width) && (bullet.y > this.y && bullet.y < this.y + height)) {
//			return true;
//		}
		//return false;	   	
		/**
		 * 子弹与敌人碰撞之后呢，奖励方法
		 * 
		 * 检查敌人和子弹碰撞、子弹和敌人撞也是定时触发的
		 * 
		 * 找到Action类编写子弹与敌人碰撞的方法bangAction：所有子弹和所有敌人一起碰撞因此要遍历子弹和敌人
		 */
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
