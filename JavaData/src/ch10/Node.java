package ch10;


/**
 * 二叉树结点
 * @author yangjiaxin
 *
 */
public class Node {
	
	//数据项
	private long data;
	//左子结点
	public Node letfChild;
	//右子结点
	public Node rightChild;
	
	
	/**
	 * 构造方法
	 * @param data
	 */
	public Node(long data) {
		this.data = data;
	}

}
