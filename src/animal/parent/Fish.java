package animal.parent;

class Eel extends Fish {
	private String release;

	public Eel(int height, int weight, String animalType, String bloodType, String release) {
		super(height, weight, animalType, bloodType);
		this.release = release;
	}


	public String snowInfo() {
		return "Eel [release=" + release + ", showInfo()=" + showInfo() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()="
				+ getBloodType() + "]";
	}

}

public class Fish extends Animal {
	private String liveInWater;
	private String hasGills;
	
	
	public Fish(int height, int weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);
		this.liveInWater = "Yes";
		this.hasGills = "Yes";
	}



	public String showInfo() {
		return "Fish [liveInWater=" + liveInWater + ", hasGills=" + hasGills + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()="
				+ getBloodType() + "]";
	}
	
	
	
}
