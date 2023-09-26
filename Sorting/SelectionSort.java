import java.util.Scanner;

public class SelectionSort {
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

        for(int i = 0 ; i < n-1 ; i++){
            int minval = arr[i];
            int minind = i;
        for(int j = minind+1 ; j < n ; j++){
            if(minval > arr[j]){
                minval = arr[j];
                minind = j;
            }
        }
            int temp = arr[i];
            arr[i] = arr[minind];
            arr[minind] = temp;
        }

        for(int k = 0 ; k < n ; k++)
            System.out.print(arr[k] + " ");
        
    }
}
