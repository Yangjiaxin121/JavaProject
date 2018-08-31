package ch11;


/**
 * 二叉树结点
 * @author yangjiaxin
 *
 */
public class Node {
	
	//数据项
	public long data;
	//数据项
	public String sDate;
	//左子结点
	public Node letfChild;
	//右子结点
	public Node rightChild;
	
	
	/**
	 * 构造方法
	 * @param data
	 */
	public Node(long data,String sData) {
		this.data = data;
		this.sDate = sData;
	}

}
