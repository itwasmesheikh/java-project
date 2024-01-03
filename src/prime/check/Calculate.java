package prime.check;

public class Calculate {
	public boolean isPrime(int num) {
		int temp;
		boolean isPrime = true;
		for(int i = 2; i<=num/i; i++) {
			temp = num%i;
			if(temp == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public boolean isPrime(double value) {
		int num = (int) value;
		int temp;
		boolean isPrime = true;
		for(int i = 2; i<=num/i; i++) {
			temp = num%i;
			if(temp == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
		
}
