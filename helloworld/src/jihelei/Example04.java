package jihelei;

import java.util.ArrayList;
import java.util.Iterator;

public class Example04 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Jack");
		list.add("Rose");
		list.add("Tom");
		list.add("Christopher");
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}
