package innerClass;

public class DoorTwo {
	public boolean isLocked(String key) {
		class Lock {
			public boolean isLocked(String key) {
				if(key.equals("ABCD"))
					return false;
				else
					return true;
			}
		}
		return new Lock().isLocked(key);
	}
}
