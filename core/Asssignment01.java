import java.util.Scanner;

public class Asssignment01 {
    public static void main(String[] args) {
        Scanner s8 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s8.nextInt();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        s8.close();
    }
}
