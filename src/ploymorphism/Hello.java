package ploymorphism;
import ploymorphism.phone.*;

public class Hello {

	public static void main(String[] args) {
		Phone note8 = new Hello().phone(1);
		System.out.println(note8.getModel());
		note8.features();
		
		Phone nokia = new Hello().phone(2);
		System.out.println(nokia.getModel());
		nokia.features();
		
	}
	
	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1:return new Samsung("Note 8");
		case 2:return new Nokia("3310");
		}
		return null;
	}

}
