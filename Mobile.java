package homeWorkNumber1;

public class Mobile {


	String name;
	String brand;
	long price;
	int serie;
	static long price1 = 1200;

	// constructors
	// default constructor
	public Mobile() {
		System.out.println(" iphone is the best phone ");
	}

	// parameterized constructor
	public Mobile(String nam1, String brand1, long price1) {
		this.name = nam1;
		this.brand = brand1;
		this.price = price1;
		System.out.println("the phone name is " + nam1 + " the brand is " + brand1 + " it costs " + price1);
	}

	// methods
	public static void doDivision(int e, int n) {
		int nmb1 = 100;
		int numb2 = 5;
		int division = nmb1 / numb2;
		System.out.println("division is " + division);
	}

	public static int doMultiplication() {
		int b= 34;
		int j = 4;
		int multi = b * j;
		System.out.println("multi is " + multi);
		return multi;
	}

	public static void doloop() {

		for (int i = 0; i <= 6; i++) {
			System.out.println("this is when i = " + i);
			if (price1 >= 1200) {
				System.out.println("this is an iphone");
			} else {
				System.out.println("it is not an iphone");
			}

		}

	}

	public static void main(String[] args) {
		
	
        System.out.println("practice construction");
	    Mobile mob1 = new Mobile();
		Mobile mob2 = new Mobile("iphone", "apple", 1200);
		System.out.println("========================================");
		System.out.println("this is do methods");
		Mobile.doDivision(81, 9);
		Mobile.doMultiplication();
		System.out.println("========================================");
		System.out.println("this is do loop");
        Mobile.doloop();
	}

}


	
	
	









	

