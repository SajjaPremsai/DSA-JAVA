import java.util.Scanner;

public class InsertionSort {
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
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i : arr)
          System.out.print(i+ " ");
    }
}
