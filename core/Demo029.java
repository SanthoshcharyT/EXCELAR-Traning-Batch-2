import java.util.Scanner;

public class Demo029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an uppercase character: ");
        char upper = scanner.next().charAt(0);

        char lower = Character.toLowerCase(upper);

        System.out.println("The lowercase character is: " + lower);

        scanner.close();
    }
}
