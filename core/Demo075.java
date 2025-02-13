//Find the maximum number in an array

public class Demo075 {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 2, 5, 8, 3, 6, 9 };
        int n = arr.length;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array " + max);


    }

}
