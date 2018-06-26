package cn.xust.www;
/*
 * 这是奖励的类
 */

public interface Award {
	/*
	 * 奖励
	 */
	//如果奖励类型为0，表示双倍获火力，如果奖励类型为1，则表示奖励一条命
	public int DOUBLE_FIRE = 0;
	public int LIFE = 1;
	public int getType();
}
