package anonymousInnerClass;

abstract class Lock{
	public abstract boolean isUnlocked(String keyCode);
	
	public void test() {
		System.out.println("Test");
	}
}

public class Door {
	Lock lock = new Lock() {
		@Override
		public boolean isUnlocked(String keyCode) {
			if(keyCode.equals("ABCD"))
				return true;
			else
				return false;
		}
	};

	public Lock getLock() {
		return lock;
	}
	
	
}
