package jihelei;

import java.util.*;

class Student{
	String id;
	String name;
	public Student(String id,String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id+":"+name;
	}
	public int hashCode() {
		return id.hashCode();
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student stu = (Student) obj;
		boolean b=this.id.equals(stu.id);
		return b;
	}
}
public class Example10 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Student stu1 = new Student("1","Jack");
		Student stu2 = new Student("2","Rose");
		Student stu3 = new Student("3","Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}

}
