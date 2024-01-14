package vahicles.parent;

import vahicles.parent.Bike;

public class Demo {

	public static void main(String[] args) {
		Car car = new Car("Round", "On", "On", "On", "Music", "On", 4, 5, 40, "LED");
		Bike bike = new Bike("Long", "Diesel", 4, 5, 40, "LED");
		System.out.println(bike);
		System.out.println(car);
		bike.run();

	}

}
