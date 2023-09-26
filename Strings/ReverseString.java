import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        System.out.println("Enter the Words : ");
        String a = in.nextLine();
        // Main logic starts here...
        
        StringBuilder sb = new StringBuilder();
        char b[] = a.toCharArray();

        for(int i = b.length-1 ; i <= 0  ; i++)
           sb.append(b[i]);

        System.out.println(sb.toString());
    }
}
