package vahicles.parent;

public class Bike extends Vehicles {
	private String handle;

	public Bike() {
		super();
		this.handle = "short";
	}

	public Bike(String handle) {
		super();
		this.handle = handle;
	}
	
	public String getHandle() {
		return handle;
	}

}
