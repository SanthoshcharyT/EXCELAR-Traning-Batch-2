import java.util.Scanner;

public class Demo018 {

    static int year;
        public static void main(String[] args) {
            Scanner s1 = new Scanner(System.in);
            System.out.print("Enter a year: ");
            year = s1.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

    }
    
}
