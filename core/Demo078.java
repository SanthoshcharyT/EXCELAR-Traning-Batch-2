//Copy array elements into another array

public class Demo078 {
    public static void main(String[] args) {
        int arr1[] = {6,5,4,3,2,1,9,8,7};
        int n = arr1.length;
        int arr2[] = new int[n];

        for(int i=0;i<n;i++){
            arr2[i] = arr1[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(arr2[i] + " ");
        }
    }
    
}
