import java.util.Scanner;

public class Demo028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a lowercase character: ");
        char lower = scanner.next().charAt(0);

        char upper = Character.toUpperCase(lower);

        System.out.println("The uppercase character is: " + upper);

        scanner.close();
    }
}
