package interfaces;

public class Hello {

	public static void main(String[] args) {
		Phone Aphone = new OnePlus5();
		Phone iphone = new IPhone8();
		System.out.println("Proccessor: "+Aphone.processor());
		System.out.println("Processor: "+iphone.processor());
	}

}
