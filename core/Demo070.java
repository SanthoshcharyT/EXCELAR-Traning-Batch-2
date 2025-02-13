//Print prime numbers in an array

public class Demo070 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int n= a.length;

        System.out.print("Prime Numbers in array: ");

        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                System.out.print(a[i] + " ");
            }
        }
    }
    
}
