package ch01;

public class TestMyArray {
	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		myArray.insert(13);
		myArray.insert(34);
		myArray.insert(90);
		
		myArray.display();
		
		System.out.println(myArray.search(34));
		System.out.println(myArray.get(2));
//		
//		myArray.delete(1);
//		myArray.display();
		
		myArray.change(0, 12);
		myArray.display();
		
	}

}
