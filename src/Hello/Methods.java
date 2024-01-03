package Hello;

public class Methods {

	public static void main(String[] args) {
		                                                       
		loop1();                                                // "Methods is used for Reusing a function numerous times."
		System.out.println();                                   // "Here methods are main, loop1, loop2."
		System.out.println("*******");
		System.out.println();
		loop2();
		System.out.println();
		System.out.println("*******");
		System.out.println();
		loop1();
		
		
		loop(1,10);
		System.out.println();
		System.out.println("*******");
		System.out.println();
		loop(20,30);
		System.out.println();
		System.out.println("*******");
		System.out.println();
		loop(1,10);

	}
	
	public static void loop1() {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}

	}
	
	public static void loop2() {
		int j = 20;
		while(j<=30) {
			System.out.println(j);
			j++;
		}

	}
	
	public static void loop(int start, int end) {
		while(start<=end) {
			System.out.println(start);
			start++;
		}

	}

}
