package homeWorkNumber1;

public class Computer {

	String name;
	String brand;
	int price;

	// default constructor

	Computer() {
		System.out.println(" Macbook is the best computer");
	}

	// parameterized constructor
	Computer(String name1, String brand1, int price1) {
		this.name = name1;
		this.brand = brand1;
		this.price = price1;
		System.out.println("our computer name is " + name1 + " our brand is " + brand1 + " our priceis " + price1);

	}

	// return method without parameters
	public static void doDivision() {
		int u = 49;
		int h = 9;
		int division = u / h;
		System.out.println("the division is " + division);
	}

	// return method with parameters
	public static void doSubstruction(int f, int d) {
		int numf = 39;
		int numd = 7;
		int substruction = numf - numd;
		System.out.println("the substruction is " + substruction);
	}

	public static void doWhile() {
		int w = 5;
		for(int i = 0 ; i<=5 ; i++)
		
		do {
			System.out.println(" MacBook is the best computer to practice java");
		} while (w > 2);

	}

	public static void main(String[] args) {
        System.out.println("practice constructor");
		Computer computer1 = new Computer();
		Computer computer2 = new Computer("MacBook", " Apple", 2000);
		System.out.println("==================================================");
		System.out.println("practice methods");
		Computer.doDivision();
		Computer.doSubstruction(39, 7);
		System.out.println("========================================================");
		System.out.println("practice dowhile");
		Computer.doWhile();
	}

}
