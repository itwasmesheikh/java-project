import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
        	numbers[i] = scanner.nextInt();
        }
        System.out.println();

        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
    }
}
