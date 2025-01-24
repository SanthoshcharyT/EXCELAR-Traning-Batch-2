import java.util.Scanner;

class Demo030 {

    public void swap() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = s1.nextInt();

        System.out.print("Enter the Second Number: ");
        int b = s1.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
    }

    public static void main(String[] args) {
        Demo030 s1 = new Demo030();
        s1.swap();
    }
}
