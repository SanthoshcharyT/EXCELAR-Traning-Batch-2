/*Checking the given number is Even Or Odd*/


import java.util.Scanner;

public class Demo_020 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = s1.nextInt();

        if (a % 2 == 0) {
            System.out.println("The number " + a + " is Even");
        } else {
            System.out.println("the number " + a + " is Odd");
        }
    }

}
