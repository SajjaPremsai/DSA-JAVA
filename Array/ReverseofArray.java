import java.util.Scanner;

public class ReverseofArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        System.out.println("Enter Size of Array : ");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " " + "Elements : ");
        for(int i = 0 ; i< n ; i++)
        a[i] = in.nextInt();


        // Main Login is starts here.........
        
        for(int i = 0 ;i < n/2 ; i ++){
            int temp = a[i];
            a[i] = a[n-1-i];
            a[n-i-1] = temp;
        }


        System.out.println("After Reverse Of Array : ");


        for(int i = 0 ; i < n ; i++){
            System.out.println(a[i]);
        }




    }
}
