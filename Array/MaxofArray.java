import java.util.Scanner;

class MaxofArray{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        System.out.println("Enter Size of Array : ");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " " + "Elements : ");
        for(int i = 0 ; i< n ; i++)
        a[i] = in.nextInt();

        // Main Logic Starts here......

        int MAX_ELE = a[0]; // Assuming the first element is Biggest 
         for(int i = 1 ; i < n; i++){
            if(a[i] > MAX_ELE){
               MAX_ELE =a[i];
            }  
         }

         System.out.println("The Max Element Of the Array is " + MAX_ELE);

    }
}