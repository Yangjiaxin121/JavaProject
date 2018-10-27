package KFC;

public abstract class Food {

	String name;
	
	double price;

	public Food() {
		
	}
	
	public Food(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void select() {
		System.out.println("点了food");
	}
	
	
	 
}
