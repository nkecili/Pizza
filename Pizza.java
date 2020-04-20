package homeWorkNumber1;

public class Pizza {

	static String name = "neapolitan";
	static String address = "rome";
	static int unitprice = 5;
	static long phonenumber = 345658765;

	static float discout;
	static char rate;

	// default
	Pizza() {
		System.out.println("we love eating pizza");

	}

	// parameterized constructor
	public Pizza(String name1, String address1) {
		this.name = name1;
		this.address = address1;
		System.out.println("my favorite pizza is " + name + " youu can look for it on that address " + address);
	}
	// methods

	public static void dosummation() {
		int x = 65;
		int y = 23;
		int sum = x + y;
		System.out.println("this is the summation " + sum);
	}

	public static int domultiplication() {

		int k = 56;
		int h = 43;
		int multi = k * h;
		System.out.println("this is multiplication " + multi);
		return multi;
	}

	public static void ifPractice() {

		for (int i = 0; i < 5; i++) {
			System.out.println("this is when i = " + i);

			if (unitprice < 2) {
				System.out.println("this is not our pizza");
			} else if (unitprice >= 5) {
				System.out.println("this is our pizza");
			} else {
				System.out.println("this not italian pizza");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("this return and non return methods\n");
		Pizza.dosummation();
		Pizza.domultiplication();

		System.out.println("=====================================================");
		System.out.println("this default constructor and parameterized \n");
		Pizza naple = new Pizza();
		Pizza naple1 = new Pizza("Italian", "Milan");
		System.out.println("==================================================================================");

		System.out.println("creation object for variables  \n");
		System.out.println(Pizza.name);
		System.out.println(Pizza.address);
		System.out.println(Pizza.unitprice);
		System.out.println(Pizza.phonenumber);
		System.out.println("welcome to " + Pizza.address + ", taste our delicious " + Pizza.name
				+ " pizza, our price is " + Pizza.unitprice
				+ " euros for unite, if you need more informations you can call us on " + Pizza.phonenumber);

		System.out.println("thanks for coming and we hope that you enjoyed our food");
		System.out.println("==============================================================");
		System.out.println("this is controlflow if else if ");
		Pizza.ifPractice();
	}

}
