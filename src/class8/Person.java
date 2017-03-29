package class8;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void see() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " is seeing");
			pause(getRandom(50));
		}

	}

	public void pause(int x) {
		try {
			Thread.sleep(x);
		} catch (Exception e) {
		}
	}

	public Person(String name) {
		this.name = name;
	}

	public void speak() {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				System.out.println(name + " is speaking");
			}
			pause(getRandom(50));
		}
	}

	public int getRandom(int x) {
		return (int) (Math.random() * x);
	}

	public void think() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " is thinking");
			pause(getRandom(50));
		}

	}

	public void eat() {
		getAPlate();
		buyTheMeal();
		sitOnAChair();
		putThePlateOnTable();
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(name + " is eating");
				int x = getRandom(50);
				if (x > 25)
					// throw new IllegalStateException("I'm throwing up..");
					pause(getRandom(50));

			}
		}

	}

	private void putThePlateOnTable() {
		System.out.println(name + " put the Plate on the Table");
		pause(100);

	}

	private void sitOnAChair() {
		System.out.println(name + "sit on a chair ");
		pause(50);
	}

	private void buyTheMeal() {
		System.out.println(name + "buy the Meal");
		pause(1000);

	}

	private void getAPlate() {
		System.out.println(name + " get a Plate");
		pause(250);

	}

}
