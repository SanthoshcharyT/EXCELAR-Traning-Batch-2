//Print leader elements of an array

public class Demo081 {
    public static void main(String[] args) {
        int arr[] = {4, 3, 5, 6, 78, 9};
        int n = arr.length;
        int max = arr[n - 1];

        System.out.print(max + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
}
