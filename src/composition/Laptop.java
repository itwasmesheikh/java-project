package composition;

import composition.Processor;
import composition.Graphics_Card;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private Graphics_Card graphicsCard;
	private String opticalDrive;
	private String keyboard;

	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();  //Anonymous Object created.
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicsCard = new Graphics_Card();  //Anonymous Object created.
		this.opticalDrive = "MLT Layer";
		this.keyboard = "Backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, Graphics_Card graphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

}
