package composition;

public class Graphics_Card {
	private String brand;
	private int series;
	private String memory;

	public Graphics_Card() {
		this.brand = "Nvidia";
		this.series = 940;
		this.memory = "2 GB";
	}

	public Graphics_Card(String brand, int series, String memory) {
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Graphics_Card [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}

}
