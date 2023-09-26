import java.util.Scanner;

public class SubarrayofArray {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        int n ;
        System.out.println("Enter Size of Array : ");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " " + "Elements : ");
        for(int i = 0 ; i< n ; i++)
        a[i] = in.nextInt();



        //Main Logic starts here.....

         int count = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                for(int k = i ; k<=j ; k++){
                    count++;
                    System.out.print(a[k]);
                }
                System.out.println();
            }
        }
    //    System.out.println("No fo Sub-Arrays are " + count)
    }
}
