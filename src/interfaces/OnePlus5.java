package interfaces;

public class OnePlus5 implements Phone {

	@Override
	public String processor() {
		
		return "SD835";
	}

	@Override
	public String OS() {
		
		return "Android";
	}

	@Override
	public int spaceInGb() {
		
		return 64;
	}
	
	
}
