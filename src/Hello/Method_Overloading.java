package Hello;

public class Method_Overloading {

	public static void main(String[] args) {
		System.out.println("Area of Rectangle : "+area(5.3,6.7));
		System.out.println("Area of Square :"+area(6.3));

	}
	
	public static double area(double width , double length) {
		return width*length;
		
	}
	
	public static double area(double side) {
		return side*side;
		
	}
	
	public static int area(int side) {
		return side*side;
		
	}

}
