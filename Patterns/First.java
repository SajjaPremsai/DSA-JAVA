// This program prints the following pattern

//     * * * * *
//       * * * *
//         * * *
//           * *
//             *

import java.util.Scanner;

class First{
    public static void main(String[] args) {
        System.out.println("Enter the Size of the Triangle : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0 ; i < n ; i++ ){
            for(int j = i ; j >= 0 ; j--){
                System.out.print(" ");
            }
            for(int k = i ; k < n ; k++){
                System.out.print("*");   
            }
            System.out.println("");
        }
    }
}