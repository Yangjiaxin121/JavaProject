package cn.xust.www;

import java.awt.image.BufferedImage;

public class FlyingObject {
	//定义属性 protected  由于这几个属性要被子类使用因此我们定义为protected
	protected BufferedImage image;
	protected int x;
	protected int y;
	protected int width;
	protected int height;
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
