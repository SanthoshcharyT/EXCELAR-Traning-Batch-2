//Linear Search

public class Demo072 {
    public static int Linearsearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 6, 4, 3, 42, 3 };
        int n = arr.length;
        int target = 4;

        int res = Linearsearch(arr, target);
        if (res != -1) {
            System.out.println("Element found at index " + res);
        } else {
            System.out.println("Element Not found ");
        }

    }

}
