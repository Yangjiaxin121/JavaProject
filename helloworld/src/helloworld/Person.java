package helloworld;
/**
 *
 * @author yangjiaxin
 *
 */
public class Person {
	int age = 10;
	void speak() {
		System.out.println("大家好，我今年"+ age +"岁！");
	}
	void say() {
		System.out.println("我是一个人！");
	}
	public void finalize() {
		System.out.println("对象将被作为垃圾回收.....");
	}
}
