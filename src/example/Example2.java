package example;
import java.util.*;

public class Example2 {
	
	public static int counter (String input, char target) {
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == target)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String input = sc.next();
		System.out.println("The lenght of the given name is:" + input.length());
		System.out.println("Enter Alphabate: ");
		char target = sc.next().charAt(0);
		int counter = counter(input, target);
		
		
		if (counter>0)
			System.out.println("It occurs " + counter + " times.");
		else
			System.out.println("The alphabet '" + target + "' is not present in the string.");
	}

}
