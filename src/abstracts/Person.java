package abstracts;

public abstract class Person implements IsAlive,LiveLife  {
	public void speak() {
		System.out.println("Share his/her thought.");
	}
	public abstract void eat();
	
	@Override
	public void breath() {
		System.out.println("Be alive, remain living.");
	}
	
	@Override
	public void message() {
		System.out.println("Life is journey. Keep moving and meet new people.");
	}
}
