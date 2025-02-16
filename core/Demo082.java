//Merge two arrays and copy them into another array (TCS)

public class Demo082 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] n3 = new int[n1 + n2];

        System.arraycopy(arr1, 0, n3, 0, n1);

        System.arraycopy(arr2, 0, n3, n1, n2);

        System.out.print("Merged Array: ");
        for (int i = 0; i < n3.length; i++) {
            System.out.print(n3[i] + " ");
        }
    }
}
