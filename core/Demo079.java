//Check if an element is found in an array

public class Demo079 {
    public static void main(String[] args) {
        int arr[] = {8, 5, 6, 3, 1, 2, 8};
        int n = arr.length;

        int a = 6;

        for (int i = 0; i < n; i++) {
            if (arr[i] == a) {
                System.out.println("Element matched");
                return; 
            }
        }

        System.out.println("Element not matched");         
    }
}
