import java.util.ArrayList;
import java.util.Scanner;

public class RemovingtheEvenElements {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(20);
        List.add(5);
        List.add(2);
        List.add(8);
        List.add(7);
        List.add(1);
        List.add(3);
        List.add(11);
        List.add(8);
        List.add(16);
        List.add(20);
        



        // Main Logic Starts here......

        for(int i = List.size()-1 ; i >= 0  ; i--){
            if(List.get(i) % 2 == 0){
                List.remove(i);
            }
        }


        System.out.println(List);
    }
}
