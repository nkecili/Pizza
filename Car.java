package homeWorkNumber1;

public class Car {

	String name;
	String brand;
	long price;
	int serie;
	static long price1 = 230000;

	// constructors
	// default constructor
	public Car() {
		System.out.println(" Lamborghini is the best car in the world ");
	}

	// parameterized constructor
	public Car(String nam1, String brand1, long price1) {
		this.name = nam1;
		this.brand = brand1;
		this.price = price1;
		System.out.println("the car name is " + nam1 + " the brand is " + brand1 + " it costs " + price1);
	}

	// methods
	public static void doDivision(int b, int q) {
		int nmb1 = 81;
		int numb2 = 9;
		int division = nmb1 / numb2;
		System.out.println("division is " + division);
	}

	public static int doMultiplication() {
		int l = 4;
		int c = 3;
		int multi = l * c;
		System.out.println("multi is " + multi);
		return multi;
	}

	public static void doloop() {

		for (int i = 0; i <= 6; i++) {
			System.out.println("this is when i = " + i);
			if (price1 >= 230000) {
				System.out.println("this is a Lamborghini");
			} else {
				System.out.println("it is not a Lamborghini");
			}

		}

	}

	public static void main(String[] args) {
        System.out.println(" practice construction");
		Car car1 = new Car();
		Car car2 = new Car("LamborghiniHurican", "Lamborghini", 230000);
		System.out.println("===============================================");
		System.out.println("practice methods");
		Car.doDivision(81, 9);
		Car.doMultiplication();
		System.out.println("==================================================");
		System.out.println("practice doloop");
        Car.doloop();
	}

}
