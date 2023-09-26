import java.util.Scanner;

public class UppercasetoLowercase {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter the Words : ");
        String a = in.nextLine();

        // Main logic starts here...
          

        char b[] = a.toCharArray();
        char res ;
        for(int i = 0 ; i< b.length ; i++){
            if(b[i] >='A' && b[i] <='z'){
                res = (char) (b[i] - 'A' + 'a');
                b[i] = res;
            }
        }
        for(char i : b){
            System.out.print(i);
        }
    }
}
