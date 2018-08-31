package ch05;

public class TestFirstLastLinkList {
	public static void main(String[] args) {
		
		FirstLatsLinkList firstLatsLinkList = new FirstLatsLinkList();
		firstLatsLinkList.insertFirst(34);
		firstLatsLinkList.insertFirst(56);
		firstLatsLinkList.insertFirst(67);
		
		firstLatsLinkList.display();
		
		firstLatsLinkList.deleteFirst();
		firstLatsLinkList.deleteFirst();
		 
		firstLatsLinkList.display();
		
		firstLatsLinkList.insertFirst(100);
		firstLatsLinkList.insertFirst(101);
		
		firstLatsLinkList.display();
	}

}
