package ch05;

public class TestDoubleLinkList {
	public static void main(String[] args) {
		DoubleLinkList dLinkList = new DoubleLinkList();
		dLinkList.insertLast(45);
		dLinkList.insertFirst(56);
		dLinkList.insertFirst(90);
		dLinkList.display();
		
//		dLinkList.deleteFirst();
//		dLinkList.display();
		
		while(!dLinkList.isEmpty()) {
			//dLinkList.deleteLast();
			dLinkList.deleteFirst();
			dLinkList.display();
		}
	}

}
