package IO;

import java.io.*;

class Person implements Serializable{
	private String id;
	private String name;
	private int age;
	public Person(String id,String name,int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public String grtName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class Example13 {
	public static void main(String[] args) throws Exception {
		Person p = new Person("p1","zhangsan",20);
		System.out.println("-------写入文件前-----");
		System.out.println("Person对象的id："+p.getId());
		System.out.println("Person对象的name："+p.grtName());
		System.out.println("Person对象的age："+p.getAge());
		FileOutputStream fos = new FileOutputStream("objectStream.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		
		FileInputStream fis = new FileInputStream("objectStream.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p1 = (Person) ois.readObject();
		System.out.println("-------从文件读取后-----");
		System.out.println("Person对象的id："+p1.getId());
		System.out.println("Person对象的name："+p1.grtName());
		System.out.println("Person对象的age："+p1.getAge());
	}

}
