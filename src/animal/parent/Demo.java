package animal.parent;

public class Demo {

	public static void main(String[] args) {
		Reptile reptile = new Reptile(5, 30, "Reptile", "Cold");
		System.out.println(reptile.showInfo());
		
		Fish fish = new Fish(2, 5, "Fish", "Warm");
		System.out.println(fish.showInfo());

	}

}
