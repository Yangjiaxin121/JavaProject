package shangji;

public class Student {
	String name;
	double score;
	Student(){
		
	}
	Student(String name,double score){
		this.name = name;
		this.score = score;
	}
	void setName(String n) {
		name = n;
	}
	void setScore(double s) {
		score = s;
	}
	String getName() {
		return name;
	}
	double getScore() {
		return score;
	}
	public static void main(String[] args) {
		Student n1 = new Student();
		Student n2 = new Student("Christopher",100);
		n1.setName("John");
		n1.setScore(98);
		System.out.println("n1 name:"+n1.getName()+"  scroe:"+n1.getScore());
		System.out.println("n2 name:"+n2.getName()+"  scroe:"+n2.getScore());

	}
}
