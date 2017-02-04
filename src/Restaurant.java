
public class Restaurant {
	public static void main(String args[]) throws Exception {
		Meal harshaMeal = new Meal("Chicken Wings", "Biryani");
		Meal frankMeal = new Meal("ff", "chicken burger", null);
		Meal amandaMeal = new Meal("chicken wings");
		System.out.println("-----Harsha is changing his meal --------");
		harshaMeal.display();
		harshaMeal.setMainCourse("Fried Rice");
		System.out.println("-----Harsha is changing his meal --------");

		harshaMeal.display();
		System.out.println("-----Harsha is changing his meal --------");
		harshaMeal.setMainCourse("Fish Tacos");

		harshaMeal.display();
		System.out.println("----Harsha has changed his meal --------");

		System.out.println("Kevin changing appetizer...");
		Meal kevinMeal = new Meal();
		kevinMeal.setAppetizer("Greek Salad");
		kevinMeal.display();
		System.out.println("Kevin changing appetizer...");
		kevinMeal.setAppetizer("French Fries");
		kevinMeal.display();
		System.out.println("Kevin changing dessert...");

		kevinMeal.setDessert("Fruit Bowl");
		kevinMeal.display();
		System.out.println("Kevin changing dessert...");

		kevinMeal.setDessert("Chocolate Ice cream");
		kevinMeal.display();
		harshaMeal = null;
		frankMeal = null;
		amandaMeal = null;
		System.gc();
		System.out.println("Restaurant is closed");
		// Thread.sleep(5000);
		// kevin.appetizer = "salad";
		// kevin.display();
		// Thread.sleep(10000);
		// kevin.mainCourse = "Fish Tacos";
		// kevin.display();
	}
}
