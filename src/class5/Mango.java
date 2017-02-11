package class5;

import java.util.*;

public class Mango extends Fruit {

	String flavor;

	public Mango() {

	}

	public Mango(float price, float weight) {
		super(price, weight);
	}

	public String toString() {
		// ArrayList al = new ArrayList();
		return "Mango -> Weight -> " + getWeight() + " :: Price -> " + getPrice();
	}

	public float getDiscount() {
		if (getDaysOfExpiry() < 5) {
			return 0.20f;
		} else {
			return 0f;
		}
	}
}
