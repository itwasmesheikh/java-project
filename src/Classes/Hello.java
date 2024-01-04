package Classes;

public class Hello {

	public static void main(String[] args) {
		Car car = new Car();
		car.setDoors("Closed");
		car.setEngine("On");
		car.setDriver("Seated");
		car.setSpeed(120);
		System.out.println(car.run());

	}

}
