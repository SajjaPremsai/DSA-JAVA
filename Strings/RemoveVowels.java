import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Words : ");
        String a = in.nextLine();
        for(int i = 0 ; i < a.length() ; i++){
            char b = a.charAt(i);
            if(b =='a' || b == 'e' || b == 'i' || b == 'o' || b == 'u'){
               continue;
            }
            System.out.print(b);
        }
    }
}
