package ch12;

/**
 * 二叉树类
 * 
 * @author yangjiaxin
 *
 */
public class Tree {
	// 根结点
	public Node root;
	
	/**
	 * 插入结点
	 * 
	 * @param value
	 */
	public void insert(long value, String sValue) {
		// 封装结点
		Node newNode = new Node(value,sValue);
		// 引用当前结点
		Node current = root;
		// 引用父结点
		Node parent;
		// 如果root为null,也就是第一次插入的时候
		if (root == null) {
			root = newNode;
			return;
		} else {
			while (true) {
				// 父结点指向当前结点
				parent = current;
				// 如果当前指向的结点数据比插入的要大，则向左走
				if (current.data > value) {
					current = current.letfChild;
					if (current == null) {
						parent.letfChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	/**
	 * 查找结点
	 * 
	 * @param value
	 */
	public Node find(long value) {
		//引用当前结点，从根结点开始
		Node current = root;
		//循环，只要查找值不等于当前结点的数据项
		while(current.data != value) {
			//进行比较，比较查找值和当前结点的大小
			if (current.data > value) {
				current = current.letfChild;
			} else {
				current = current.rightChild;
			}
			//如果查找不到，返回为空
			if (current == null) {
				return null;
			}
		}
		return current;

	}

	/**
	 * 删除结点
	 * 
	 * @param value
	 */
	public void delete(long value) {

	}
	
	/**
	 * 前序遍历
	 * @param localNode
	 */
	public void frontOrder(Node localNode) {
		if (localNode != null) {
			//访问根结点
			System.out.println(localNode.data+","+localNode.sDate);;
			//前序遍历左子树
			frontOrder(localNode.letfChild);
			//前序遍历右子树
			frontOrder(localNode.rightChild);
		}
	}
	
	/**
	 * 中序遍历   拍出来是从小到大的
	 */
	public void inOrder(Node localNode) {
		if (localNode != null) {
			//中序遍历左子树
			inOrder(localNode.letfChild);
			//访问根结点
			System.out.println(localNode.data+","+localNode.sDate);;
			//中序遍历右子树
			inOrder(localNode.rightChild);
		}
	}
	
	/**
	 * 后序遍历   拍出来是从小到大的
	 */
	public void afterOrder(Node localNode) {
		if (localNode != null) {
			//后序遍历左子树
			afterOrder(localNode.letfChild);
			//后序遍历右子树
			afterOrder(localNode.rightChild);
			//访问根结点
			System.out.println(localNode.data+","+localNode.sDate);
		}
	}
	
	

}














