package abstracts;

public class Hello {

	public static void main(String[] args) {
		Person nobody = new NonVegan();
		nobody.speak();
		nobody.breath();
		nobody.eat();
		nobody.message();
		
	}

}
