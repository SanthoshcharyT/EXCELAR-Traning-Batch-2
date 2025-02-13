//Find the 2nd maximum number in an array (TCS)

public class Demo076 {
    public static void main(String[] args) {
        int arr[] = { 9, 6, 3, 2, 5, 8, 7, 4, 1 };
        int n = arr.length;
        int max = arr[1];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The Second maximum element in array " + max);
    }

}
