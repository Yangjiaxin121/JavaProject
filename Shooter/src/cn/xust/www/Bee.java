package cn.xust.www;

public class Bee extends FlyingObject implements Award{
	private int xspeed = 1;   //x坐标移动速度
	private int yspeed = 2;   //y坐标移动速度
	private int awardType;    //奖励类型
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return awardType;
	}




}
