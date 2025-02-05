//Generate the first 20 numbers in the Fibonacci series 

public class Demo060 {
    public static void main(String[] args) {
        int a = 20;

        int first = 0;
        int second = 1;

        System.out.println("Fibinacci Series upto 20 numbers: ");
        for (int i = 0; i <= a; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

}
