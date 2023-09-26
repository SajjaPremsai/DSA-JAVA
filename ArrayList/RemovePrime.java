import java.util.ArrayList;

public class RemovePrime {
    public static void main(String[] args) {
    int Arr[] = {
        728, 556, 783, 501, 768, 335, 641, 378, 745, 281, 768, 359, 896, 173, 329, 271, 658, 260, 528, 782, 381, 868, 866, 376, 227};
       ArrayList<Integer> A = new ArrayList<>();
    
            for(int i = 0 ; i<Arr.length ; i++){
                for(int j = 2 ; j < Arr[i]-1 ; j++){
                    if(Arr[i] % j == 0)
                    {
                        A.add(Arr[i]);
                        break;
                    }   
                }
            }
        System.out.println(A);

    }
}

