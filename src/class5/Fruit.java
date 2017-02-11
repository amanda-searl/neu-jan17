package class5;

public abstract class Fruit {
	private float price;
	private float weight;
	private int daysOfExpiry;

	public Fruit(float price, float weight) {
		this.price = price;
		this.weight = weight;
	}

	public Fruit() {

	}

	public  float getDiscount() {
		if( isNormalOperatingDays()){
			return 0.0f;
		}
		else{
			//return calculateSpecialDiscount();
			return 0.0f;
		}
		
	}
	
	//protected abstract float calculateSpecialDiscount();
	
	public boolean isNormalOperatingDays(){
		return normalOperatingDays;
	}
	
	private boolean normalOperatingDays = false;

	public int getDaysOfExpiry() {
		return daysOfExpiry;
	}

	public void setDaysOfExpiry(int daysOfExpiry) {
		this.daysOfExpiry = daysOfExpiry;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
