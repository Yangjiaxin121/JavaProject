package ch05;



/**
 * 双向链表
 * @author yangjiaxin
 *
 */
public class DoubleLinkList {
	//头节点
	private Node first;
	
	private Node last;
	
	public DoubleLinkList() {
		first = null;
		last = null;
	}
	
	/**
	 * 插入一个结点，在头结点后进行插入
	 * 
	 */
	public void insertFirst(long value) {
		Node node = new Node(value);
		if (isEmpty()) {
			last = node;
		} else {
			first.previous = node;
		}
		node.next = first;
		first = node;
		
	}
	
	/**
	 * 插入一个结点，从尾节点进行插入
	 */
	public void insertLast(long value) {
		Node node = new Node(value);
		if (isEmpty()) {
			first = node;
		} else {
			last.next = node;
			node.previous = last;
		}
		last = node;
	}
	
	/**
	 * 删除一个结点，在头节点后进行删除
	 */
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = temp.next;
		return temp;
	}
	
	/**
	 * 删除结点，从尾部删除
	 */
	public Node deleteLast() {
		
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
			
		}
		last = last.previous;
		return last;
		
	}
	
	/**
	 * 显示方法
	 */
	public void display() {
		Node current = first;
		while(current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
	
	/**
	 * 查找方法
	 */
	public Node find(long value) {
		Node current = first;
		while(current.data != value) {
			if (current.next ==null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}
	
	/**
	 * 删除方法，根据数据域进行删除
	 */
	public Node delete(long value) {
		Node current = first;
		while(current.data != value) {
			if (current.next == null) {
				return null;	
			}
			current = current.next;
		}
		if (current == first) {
			first = first.next;
		} else {
			current.previous.next = current.next;
		}
		return current;
	}
	
	
	/**
	 * 判断是否为空
	 */
	public boolean isEmpty() {
		return (first == null);
	}
	
	
	
	

}
