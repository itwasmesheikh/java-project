package animal.parent;

class Crocodile extends Reptile {
	private String eggs;

	public Crocodile(int height, int weight, String animalType, String bloodType, String eggs) {
		super(height, weight, animalType, bloodType);
		this.eggs = eggs;
	}
}

public class Reptile extends Animal {
	private String drySkin;
	private String backBone;
	private String softShelledEggs;
	
	
	public Reptile(int height, int weight, String animalType, String bloodType) {
		super(height, weight, animalType, animalType);
		this.drySkin = "Yes";
		this.backBone = "yes";
		this.softShelledEggs = "Yes";
	}


	public String showInfo() {
		return "Reptile [drySkin=" + drySkin + ", backBone=" + backBone + ", softShelledEggs=" + softShelledEggs
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
}