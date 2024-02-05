package innerClass;

public class Door {
	private Lock lock;
	public Door() {
		lock = new Lock(true);
	}
	
	public Lock getLock() {
		return lock;
	}

	public void shopStatus() {
		if(lock.isLock())
			System.out.println("Shop is closed. You may come tomorrow.");
		else
			System.out.println("Shop is open. And you're welcome.");
	}
	
	public class Lock{
		private boolean lock;

		public Lock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
	}
}
