package class5;

public class Apple extends Fruit {

	@Override
	public String toString() {
		return "Apple -> Weight -> " + getWeight() + " :: Price -> " + getPrice();
	}

	public float getDiscount() {
		float p = getPrice();
		// float p = price;
		if (p > 0.50f) {
			return 0.10f;
		} else {
			return 0.0f;
		}
	}

}
