import java.util.Scanner;

// It gives wheather the input number is even or odd

class First {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        while(n != 1 && n != 0){
            n -=2;
        }
        if(n == 1){
            System.out.println("Odd");
        }
        else{

            System.out.println("Even");
        }
    }
}
