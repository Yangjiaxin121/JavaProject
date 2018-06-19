package jihelei;

import java.util.ArrayList;
import java.util.Collections;

public class Example27 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Collections.addAll(list, "C","Z","B","K");
		System.out.println("排序前："+list);
		Collections.reverse(list);
		System.out.println("翻转后："+list);
		Collections.sort(list);
		System.out.println("按自然排序后："+list);
		Collections.shuffle(list);
		System.out.println("洗牌后："+list);
	}

}
