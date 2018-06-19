package shangji;

public class Father {
	private String name = "zhangjun";
	public void test() {
		Child c = new Child();
		c.introFather();
	}
	 class Child{
		void introFather() {
			System.out.println("name:"+name);
		}
	}
	 public static void main(String[] args) {
			Father f = new Father();
			f.test();
		}

}