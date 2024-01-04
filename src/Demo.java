import prime.check.*;

public class Demo {

	public static void main(String[] args) {
		Calculate prime = new Calculate();
		Calculate numberCheck = new Calculate();
		if(prime.isPrime(7.5))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		System.out.println(Calculate.numberCheck(-15));

	}

}
