import java.util.Scanner;

class ReversetheVowels{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Words : ");
        String a = in.nextLine();

        // Main logic starts here...
          

        char b[] = a.toCharArray();

        int i = 0 , j = b.length-1;
        while( i < j ){
            while(b[i] != 'a'  && b[i] != 'e' && b[i] != 'i' && b[i] != 'o' && b[i] != 'u'){
                i++;
            }

            while(b[j] != 'a'  && b[j] != 'e' && b[j] != 'i' && b[j] != 'o' && b[j] != 'u'){
                j--;
            }

            if(i >= j)
               break;
            // Swapping the vowels

            char temp = b[i];
            b[i] = b[j];
            b[j] = temp;

            i++;
            j--;
        }
        for(char k : b)
           System.out.print(k);
          

    }
}