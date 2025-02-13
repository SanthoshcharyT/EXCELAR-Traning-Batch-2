//Count even numbers in an array

public class Demo068 {
    public static void main(String[] args) {
        int a[] = { 96, 3, 53, 2, 6, 2, 35, 3, 8 };
        int n = a.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println( "No of even numbers: " +count);

    }

}
