package shangji;
class Point{
	private double x;
	private double y;
	public Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(Point p) {
		x = p.x;
	}
	public void setY(Point p) {
		y = p.y;
	}
}
class Circle{
	private Point point;
	private double radius;
	public Circle(Point point,double radius) {
		this.point = point;
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public Point getPoint() {
		return point;
	}
	public void setRadius(Circle c) {
		radius = c.radius;
	}
	public void setPoint(Circle c) {
		point = c.point;
	}
	public double Area() {
		return 3.14*radius*radius;
	}
	public boolean contians(Point p){
		if((point.getX()-p.getX())*(point.getX()-p.getX())+(point.getY()-p.getY())*(point.getY()-p.getY())
				>(radius*radius)) {
			return false;
		}else {
			return true;
		}
		
		
	}
}

public class TestCricle {
	public static void main(String[] args) {
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Circle c1 = new Circle(p1,5);
		System.out.println("圆心坐标："+p1.getX()+","+p1.getY());
		System.out.println("点p2的坐标："+p2.getX()+","+p2.getY());
		System.out.println("圆的面积："+c1.Area());
		System.out.println("p2是否在圆内："+c1.contians(p2));
	}

}
