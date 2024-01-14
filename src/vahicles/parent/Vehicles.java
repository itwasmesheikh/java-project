package vahicles.parent;

public class Vehicles {
	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;
	
	public Vehicles() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTank = 35;
		this.lights = "LED";
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}

	public Vehicles(String engine, int wheels, int seats, int fuelTank, String lights) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}
	
	public void run() {
		System.out.println("Running Vehicles.");
	}

	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
