// Print even elements of an array

public class Demo067 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }

}
