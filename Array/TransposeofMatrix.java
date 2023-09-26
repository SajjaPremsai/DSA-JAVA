import java.util.Scanner;

public class TransposeofMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n , m;
        System.out.println("Enter Row Size of Array : ");
        n = in.nextInt();
        System.out.println("Enter Column Size of Array : ");
        m = in.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter " + n + " row  " + "Elements : ");
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< m ; j++){
                a[i][j] = in.nextInt();
            }
        }


        // Main Logic Starts here.....


        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                    int temp = a[i][j];
                     a[i][j] = a[j][i];
                     a[j][i] = temp;
                
            }
        }

        // Array Printing after transpose fo array 


        for(int i = 0 ; i < n ; i++){
            for( int j = 0 ; j < m ; j++){
              System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    
}
