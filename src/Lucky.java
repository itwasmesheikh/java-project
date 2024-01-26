import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        String result = isLucky(N);
        System.out.println(result);
    }

    private static String isLucky(int rock) {
        if (String.valueOf(rock).contains("13")) {
            return "Lucky Rock";
        } else {
            return "Unlucky Rock";
        }
    }
}