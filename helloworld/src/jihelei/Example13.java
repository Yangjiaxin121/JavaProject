package jihelei;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Student1 implements Comparable{
	int age;
	String name;
	public Student1(String name,int age) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return name+":"+age;
	}
	public int compareTo(Object obj) {
		Student1 s = (Student1) obj;
		if(this.age - s.age>0) {
			return 1;
		}
		if(this.age - s.age==0) {
			return this.name.compareTo(s.name);
		}
		return -1;
	}
}

public class Example13 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Student1("Jack",19));
		ts.add(new Student1("Rode",18));
		ts.add(new Student1("Tom",19));
		ts.add(new Student1("Rose",18));
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
