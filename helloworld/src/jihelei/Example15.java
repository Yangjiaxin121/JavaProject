package jihelei;

import java.util.*;

public class Example15 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		map.put("3", "Mary");
		System.out.println("1:"+map.get("1"));
		System.out.println("2:"+map.get("2"));
		System.out.println("3:"+map.get("3"));
		
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		while(it.hasNext()) {
			Object key = it.next();
			Object value = map.get(key);
			System.out.println(key+":"+value);
		}
	}

}
