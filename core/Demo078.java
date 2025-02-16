//Print even numbers on the left side and odd numbers on the right side

public class Demo078 {
    public static void main(String[] args) {
        int n = 10; 
        
        System.out.println("Even\tOdd");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            } else {
                System.out.println(i);
            }
        }
    }
}

