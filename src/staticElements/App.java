package staticElements;

public class App {

	public static void main(String[] args) {
		System.out.println("Current variable value is: "+Test.getStaticVariable());
		Test.setStaticVariable(1);
		System.out.println("Current variable value is: "+Test.getStaticVariable());
		Test.setStaticVariable(5);
		System.out.println("Current variable value is: "+Test.getStaticVariable());

	}

}
