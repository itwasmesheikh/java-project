package anonymousInnerClass;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		door.getLock().test();
		System.out.println(door.getLock().isUnlocked(args[0]));

	}

}
