package userInput;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("What's your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hey there, "+name+". Welcome to the world of code.");
		sc.close();

	}

}
