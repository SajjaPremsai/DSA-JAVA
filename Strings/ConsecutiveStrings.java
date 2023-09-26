import java.util.Scanner;

public class ConsecutiveStrings {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter the Words : ");
        String a = in.nextLine();
        // Main logic starts here...
        
        StringBuilder sb = new StringBuilder();
        char b[] = a.toCharArray();
        int count = 1;
        for(int i = 0 ; i< b.length-1; i++){
            if(b[i] == b[i+1]) count++;
            else if(b[i] != b[i+1] && count == 1) sb.append(b[i]);
            else if(b[i] != b[i+1] && count > 1) count = 1;
        }
        if(b[b.length-1] != b[b.length-2])
           sb.append(b[b.length-1]);
        System.out.println(sb.toString());

        
    }
}
