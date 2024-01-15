package composition;

public class Processor {
	private String brand;
	private String series;
	private int generations;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxFrequency;

	public Processor() {
		this.brand = "Intel";
		this.series = "i5 7200u";
		this.generations = 7;
		this.cores = 2;
		this.threads = 4;
		this.cacheMemory = "3 MB";
		this.frequency = "2.5 GHz";
		this.minFrequency = "2.5 GHz";
		this.maxFrequency = "3.1 GHz";
	}

	public Processor(String brand, String series, int generations, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxFrequency) {
		this.brand = brand;
		this.series = series;
		this.generations = generations;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxFrequency = maxFrequency;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generations=" + generations + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + "]";
	}

}
