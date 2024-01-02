package Hello;

public class For_Loop {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);

		}
		for (int i = 1, j = 1; i <= 10 && j <= 10; i++, j++) {
			i++;
			j++;
			System.out.println("i = " + i + " and j = " + j);
		}

	}

}
