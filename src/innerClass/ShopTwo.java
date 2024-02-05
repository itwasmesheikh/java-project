package innerClass;

public class ShopTwo {

	public static void main(String[] args) {
		//DoorTwo door = new DoorTwo();
		if(new DoorTwo().isLocked(args[0]))
			System.out.println("Shop has closed. Please visit later");
		else
			System.out.println("Welcome! The shop is open.");
		System.out.println(args[1]);
		System.out.println(args[2]);

	}

}
