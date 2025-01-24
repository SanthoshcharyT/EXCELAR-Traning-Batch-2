import java.util.Scanner;

public class Demo027 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Alphbet: ");
        char a = s1.next().charAt(0);

        if (a >= 'a' && a <= 'z') {
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                System.out.println("The Character is Vowel. ");
            }
        } else {
            System.out.println("The Charater is consonant. ");
        }
    }

}
