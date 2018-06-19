package JavaAPI;

import java.util.Random;

public class Example16 {
	public static void main(String[] args) {
		Random r = new Random(13);
		for(int x=0;x<10;x++) {
			System.out.println(r.nextInt(100));
		}
	}

}
