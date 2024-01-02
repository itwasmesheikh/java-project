package Hello;

public class Sum_of_digits {

	public static void main(String[] args) {
		int value = 9999;
		int sumOfDigits = 0;
		while(true) {
			sumOfDigits = sumOfDigits + value%10;
			value = value/10;
			if(value<1) {
				break;
			}
		}
		//sumOfDigits = sumOfDigits + value; //This line will be applicable if the "if" condition will (value<10).
		System.out.println("Sum of digits is : "+sumOfDigits);

	}

}
