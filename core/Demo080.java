//Shift array elements to the left, moving the first element to the last position

public class Demo080 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        int first = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
