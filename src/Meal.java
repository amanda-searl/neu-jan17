
class Appetizer {
}

class MainCourse {
}

class Dessert {
}

public class Meal {
	Appetizer a;
	MainCourse mc;
	Dessert dc;

	Meal(Appetizer a) {
	}

	Meal(MainCourse mc) {
	}

	private String appetizer;

	public String getAppetizer() {
		return appetizer;
	}

	private String mainCourse;

	public String getMainCourse() {
		return mainCourse;
	}

	private String dessert;
	private int mainCourseCounter = 0;

	public void setDessert(String d) {
		this.dessert = d;
	}

	public void setAppetizer(String appetizer) {
		if (this.appetizer != null) {
			System.out.println("You can't set the appetizer again..");
			return;
		}
		this.appetizer = appetizer;
	}

	public void setMainCourse(String mc) {
		mainCourseCounter++;
		if (mainCourseCounter > 1) {
			System.out.println("I can't change your main course. You just got to eat what you got");
			return;
		}
		this.mainCourse = mc;
	}

	Meal(String a, String mc, String d) {
		System.out.println("----\n");
		System.out.println("Good afternoon");
		appetizer = a;
		mainCourse = mc;
		dessert = d;
		display();
		System.out.println("Thank you");

	}

	public void finalize() {
		System.out.println("Put the Plate in Garbage bin");
	}

	Meal(String a) {
		this(a, null, null);
	}

	Meal() {
		this(null, null, null);

	}

	Meal(String appetizer, String mainCourse) {
		// this(appetizer, mainCourse, null);
		this(appetizer, mainCourse, "vanila ice cream");
		// this.dessert = "vanila ice cream";
	}

	public void display() {
		System.out.println("Appetizer -> " + appetizer + "\nMainCourse -> " + mainCourse + "\nDesert -> " + dessert);
	}
}
