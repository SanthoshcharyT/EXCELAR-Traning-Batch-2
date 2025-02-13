//Print the sum of all elements in an array

public class Demo069 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int n = a.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.print("Sum of elements = " + sum);
    }
}
