//Add the first and last elements of an array

public class Demo063{
    public static void main(String[] args) {
        int arr[] = {5,6,2,4,6};
        int n= arr.length;

        int res = arr[0] + arr[n-1];
        System.out.print("Addition first and last elemnts of Array : " + res);
    }
}