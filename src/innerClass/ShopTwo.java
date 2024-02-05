package innerClass;

public class ShopTwo {

	public static void main(String[] args) {
		DoorTwo door = new DoorTwo();
		if(door.isLocked(args[0]))
			System.out.println("Shop has closed. Please visit later");
		else
			System.out.println("Welcome! The shop is open.");

	}

}
