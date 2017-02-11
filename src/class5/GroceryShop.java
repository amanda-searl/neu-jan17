package class5;

public class GroceryShop {

	public Fruit buyApple(float price, float weight) {
		Apple a = new Apple();
		a.setPrice(price);
		a.setWeight(weight);
		return a;
	}

	public Fruit buyOrange(float price, float weight) {
		Orange o = new Orange();
		o.setPrice(price);
		o.setWeight(weight);
		return o;
	}

	public Fruit buy(Apple a, float price, float weight) {
		a.setPrice(price);
		a.setWeight(weight);
		return a;
	}

	public Fruit buy(Fruit f, float price, float weight) {
		f.setPrice(price);
		f.setWeight(weight);
		return f;
	}

	public Fruit buy(Orange o, float price, float weight) {
		o.setPrice(price);
		o.setWeight(weight);
		return o;

	}

	public static void main(String[] args) {
		//Fruit f = new Fruit();
		Fruit f = new Apple();
		Apple a = new Apple();
		a.setPrice(0.59f);
		a.setWeight(0.10f);
		System.out.println(a);
		Orange o = new Orange();
		o.setPrice(0.25f);
		o.setWeight(0.30f);
		System.out.println(o);
		Mango m = new Mango();
		m.flavor = "Sweet";
		m.setPrice(1.0f);
		m.setWeight(0.65f);
		System.out.println(m);
		GroceryShop gs = new GroceryShop();
		float tp = gs.calculateTotalPrice(a, o, m);
		float tw = gs.calculateTotalWeight(a, o, m);
		System.out.println("Total Price of All Fruits  -> " + tp);
		System.out.println("Total Weight of All Fruits -> " + tw);

		// Fruit x = a;
		// Mango m1 = a;
		// Apple a1 = a;

		// Fruit f = new Fruit();
		// Apple a2 = f;

		Fruit[] fruits = { a, m };
		System.out.println(gs.calculateTotalDiscount(fruits));
		System.out.println(gs.calculateTotalPrice(fruits));

		fruits = new Fruit[] { m, o, a };

		System.out.println(gs.calculateTotalPrice(fruits));
		System.out.println(gs.calculateTotalDiscount(fruits));

		gs.buy(new Apple(), 0.1f, 0.2f);
		gs.buy(new Orange(), 0.24f, 0.45f);
	}

	public float calculateTotalDiscount(Fruit fruits[]) {
		float tp = 0f;
		for (Fruit f : fruits) {
			tp = tp + f.getDiscount();
		}
		return tp;

	}

	public float calculateTotalPrice(Fruit fruits[]) {
		float tp = 0f;
		for (Fruit f : fruits) {
			tp = tp + f.getPrice();
		}
		return tp;
	}

	public float calculateTotalWeight(Fruit fruits[]) {
		float tp = 0f;
		for (Fruit f : fruits) {
			tp = tp + f.getWeight();
		}
		return tp;

	}

	public float calculateTotalPrice(Apple a, Orange o, Mango m) {
		return a.getPrice() + o.getPrice() + m.getPrice();
	}

	public float calculateTotalWeight(Apple a, Orange o, Mango m) {
		return a.getWeight() + o.getWeight() + m.getWeight();
	}
}
