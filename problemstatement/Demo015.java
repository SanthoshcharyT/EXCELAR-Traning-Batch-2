import java.util.Scanner;

public class Demo015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = ((num + 50) / 100) * 100;

        System.out.println("Nearest multiple of 100: " + result);

        scanner.close();
    }
}
