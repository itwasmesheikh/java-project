package vahicles.parent;

import vahicles.parent.Bike;
import vahicles.parent.Car;
import vahicles.parent.Truck;

public class Demo {

	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		System.out.println(bike.getHandle());
		System.out.println(bike.getEngine());

	}

}
