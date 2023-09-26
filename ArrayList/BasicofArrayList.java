import java.util.ArrayList;

class BasicofArrayList {
    public static void main(String[] args) {
         ArrayList<Integer> List = new ArrayList<>();

         // Adding elements 

         List.add(30);
         List.add(20);
         List.add(40);
         List.add(310);
         System.out.println(List);

         // Getting elements at the given Index

         System.out.println(List.indexOf(310));

         //Adding elements at the given Index

         List.add(0,10);
         System.out.println(List);

         //Changing the value at a given Index

         List.set(4, 50);
         System.out.println(List);

         //Removing elemenst at the given Index

         List.remove(1);
         System.out.println(List);

        // Getting 
    

        // Getting the Size Of a ArrayList

        System.out.println(List.size());

        }
}
