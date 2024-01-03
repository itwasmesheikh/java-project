package Hello;

public class Methods {

	public static void main(String[] args) {
		
		loop1();
		System.out.println();
		System.out.println("*******");
		System.out.println();
		loop2();

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

}
