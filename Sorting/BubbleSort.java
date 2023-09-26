import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter no of elements : ");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements : ");
        for(int i = 0 ; i < n  ; i++)
           arr[i] = in.nextInt();
         
        // Main Logic Starts here....

         for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }

         for(int a : arr)
           System.out.print(a + " ");

    }
}
