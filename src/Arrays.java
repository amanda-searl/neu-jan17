
public class Arrays {

	public static void main(String args[]) {
		Kid k[] = new Kid[5];
		for (int i = 0; i < k.length; i++) {
			k[i] = new Kid();
			k[i].age = getRandomNumber(10);
		}
		Arrays a = new Arrays();
		// a.feedKids(k);
		a.drinkBasedOnAge(k);
	}

	public static int getRandomNumber(int number) {
		return (int) (Math.random() * number) + 1;
	}

	public void drinkBasedOnAge(Kid[] kids) {
		int counter = 0;
		while (true) {
			if (counter < kids.length) {
				kids[counter].drinkMilkBasedOnAge();
			} else {
				break;
			}
			counter++;
		}
	}

	public void feedKids(Kid[] kids) {
		int unit = 2;
		for (Kid k : kids) {
			k.feedMilk(unit);
			unit++;
		}
	}
}

class Kid {
	int age;

	void feedMilk(int units) {
		System.out.println("Drinking milk of units -> " + units);
	}

	void drinkMilkBasedOnAge() {
		feedMilk(age);
	}
}