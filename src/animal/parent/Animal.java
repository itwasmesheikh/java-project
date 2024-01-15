package animal.parent;

public class Animal {
	private int height;
	private int weight;
	private String animalType;
	private String bloodType;
	
	public Animal(int height, int weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public Animal() {
		this.height = 0;
		this.weight = 0;
		this.animalType = "Unknown";
		this.bloodType = "Unknown";
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getBloodType() {
		return bloodType;
	}

	public String showInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}

}
