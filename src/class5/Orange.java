package class5;

public class Orange extends Fruit {

	public String toString() {
		return "Orange -> Weight -> " + getWeight() + " :: Price -> " + getPrice();
	}

	public float getDiscount() {
		if (getWeight() > 0.25f) {
			return 0.20f;
		} else {
			//return super.getDiscount();
			return 0.0f;
		}
	}
}
