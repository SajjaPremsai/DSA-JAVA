import java.util.Scanner;

public class RotationofMatrixto90 {
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

    // Main Logic Starts Here.....


    // step-1 : Transpose the matrix 


    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < i ; j++){
                int temp = a[i][j];
                 a[i][j] = a[j][i];
                 a[j][i] = temp;
            
        }
    }

    // step-2 Now reverse each array 
    

     for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m/2 ; j++){
            int temp = a[i][j];
            a[i][j] = a[i][m-j-1];
                 a[i][m-j-1] = temp;
        }
     }


    // finally print the array 


    for(int i = 0 ; i< n ; i++){
        for(int j = 0 ; j< m ; j++){
           System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }

    }
}
