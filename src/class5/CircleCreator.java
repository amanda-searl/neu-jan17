package class5;

import class6.Circle;

//final fields
//final methods
//final classes
//static fields
//static final fields
//static methods
//

public class CircleCreator {

	public void main(String[] args) {
		Circle a = new Circle();
		// Circle.counter = 10;
		Circle b = new Circle();
		System.out.println(Circle.getCounter());

		Circle c = new Circle();
		c.display();
		//RedCircle rc = new RedCircle();
		//rc.display();

	}

}
