package abstracts;

public class Hello {

	public static void main(String[] args) {
		Person nobody = new Vegan();
		nobody.speak();
		nobody.eat();
		System.out.println();
		Person anybody = new NonVegan();
		anybody.speak();
		anybody.eat();
		
	}

}
