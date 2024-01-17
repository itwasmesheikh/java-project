package Encapsulation;

public class Hello {

	public static void main(String[] args) {
		Person Numan = new Person();
		System.out.println(Numan);
		Person Maanha = new Person("Maanha", 9, "Female");
		Maanha.setAge(10);
		System.out.println(Maanha);

	}

}
