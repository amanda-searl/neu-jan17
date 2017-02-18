package class6;

public class Circle {

	protected final float DUMMY = 10;
	private float radius;
	private static final float PI = 22f / 7f;
	private static int counter = 0;

	public static int getCounter() {
		return counter;
	}

	public void draw() {
		System.out.println("Draw with some color");
	}

	public Circle() {
		// pi = 22f / 7f;
		counter++;
		System.out.println("Circle with counter -> " + counter + " is created");
	}

	public Circle(float radius) {
		this();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public final float getArea() {
		return PI * getRadius() * getRadius();
	}

	public final float getPerimeter() {
		return 2 * PI * getRadius();
	}

	public void display() {
		System.out.println(DUMMY);
	}

	public void someMischievousMethod() {
		// pi = 22 / 8f;
	}

	public static void main(String args[]) {
		Circle c = new Circle();
		c.setRadius(10);
		Circle a = new Circle();
		a.setRadius(15);

		System.out.println(c.getRadius());
		System.out.println(c.PI);
		System.out.println(a.PI);
		System.out.println(Circle.PI);
		// System.out.println(RedCircle.PI);
		System.out.println(c.getArea());
		c.someMischievousMethod();
		System.out.println(c.getArea());

		String x = new String("Siva");
		RedCircle rc = new RedCircle();
		rc.setRadius(10);
		System.out.println(rc.getArea());
	}
}

final class RedCircle extends Circle {

	private final float DUMMY = 15;

	public void display() {
		System.out.println(super.DUMMY);
	}

	@Override
	public void draw() {
		System.out.println("Draw with some red color");
	}

}
