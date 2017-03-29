package class8;

public class TwoPeopleEatingTest {

	public static void main(String[] args) {
		Person kevin = new Person("Kevin");
		Person frank = new Person("Frank");
		// kevin.eat();
		// frank.eat();
		EatingThread kt = new EatingThread(kevin);
		EatingThread ft = new EatingThread(frank);
		kt.start();
		ft.start();
	}

}
