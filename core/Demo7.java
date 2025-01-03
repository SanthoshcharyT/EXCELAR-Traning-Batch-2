import java.util.Scanner;
public class Demo7 {
    public static void main(String[]args){
        
        String Name;
        Long phoneno;
        int age;

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        s1.nextLine();

        System.out.print("Enter your PhoneNum: ");
        s1.nextInt();

        System.out.print("Enter Your Age: ");
        s1.nextInt();

        s1.close();
    }
    
}
