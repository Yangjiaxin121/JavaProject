package ch12;

public class TestTree {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10,"James");
		tree.insert(20,"YAO");
		tree.insert(15,"Kobi");
		tree.insert(3,"Mac");
		tree.insert(4, "zhangsan");
		tree.insert(90, "lisi");
		
//		System.out.println(tree.root.data);
//		
//		Node node = tree.find(20);
//		System.out.println(node.data+","+ node.sDate);
		
		//tree.frontOrder(tree.root);
		
		//tree.inOrder(tree.root);
		
		tree.afterOrder(tree.root);
	}

}
