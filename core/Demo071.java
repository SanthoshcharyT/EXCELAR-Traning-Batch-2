// Reverse array elements

public class Demo071 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 45, 6, 8, 5, 9 };
        int n = arr.length;

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.print("Reversed array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
