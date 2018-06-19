package IO;

import java.io.*;

class Student{
	public String toString() {
		return "我是一个学生";
	}
}

public class Example16 {
	public static void main(String[] args) throws Exception {
		PrintStream ps =  new PrintStream(new FileOutputStream("printStream.txt"),true);
		Student stu = new Student();
		ps.print("这是一个数字:");
		ps.println(19);
		ps.println(stu);
	}

}
