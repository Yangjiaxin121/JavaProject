package mianxiangduixiang2;

public class Example02 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		animalShout(dog);
		//Cat cat = new Cat();
		//animalShout(cat);
	}

	private static void animalShout(Animal animal) {
		// TODO Auto-generated method stub
		if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.sleep();
			cat.shout();
		} else {
			System.out.println("this animal is not a cat");
		}
	}

}
