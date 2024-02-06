package staticElements;

public class Test {
	private static int staticVariable = 0;

	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		Test.staticVariable = staticVariable;
	}
	
	
}
