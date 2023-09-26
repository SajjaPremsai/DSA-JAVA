import java.nio.file.FileStore;
import java.util.Scanner;

public class QueueOperations {
    static QueueNode First = null;
    static QueueNode Last = null;
    static int choice;
    public static void main(String[] args) {
        System.out.println("Operations to perform on Stack : ");
        System.out.println("1.Push into Queue ");
        System.out.println("2.Remove from the Queue");
        System.out.println("3.Peek ");
        System.out.println("4.Display all data in the Stack : ");
        System.out.println("5.Size of the Stack ");
        System.out.println("6.Clear Queue");
        System.out.println("Enter 0 to exit ");
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("Enter number to perfrom the action : ");
            choice = in.nextInt();
        switch (choice) {
        case 1:
          insert();
          break;
        case 2:
           remove();
           break;
        case 3:
           peek();
           break;
        case 4:
            display();
           break;
        case 5:
        System.out.println("Size of the stack is : " + size());
        break;
        case 6:
           clear();
           break;
        default:
            System.out.println("Enter Correct Choice ");
            break;
       }
    }while(choice != 0);
    }
    static void insert(){
      Scanner in = new Scanner(System.in);
      QueueNode n1 = new QueueNode();
      System.out.println("Enter the Data : ");
      n1.data = in.nextInt();
      n1.next = null;
      if(First == null && Last == null){
        First = Last = n1;
      }
      else{
        Last.next = n1;
        Last = n1;
      }
    }
    static void remove(){
      if(First == null){
        System.out.println("No elements are Existed to remove ");
      }
      else{
      QueueNode temp = First.next;
      First.next = null;
      First = temp;
      }
    }
    static void peek(){
      if(First == null)
         System.out.println("null");
      else
      System.out.println(First.data);
    }
    static int size(){
     if(First == null && Last == null)
      return 0;
     else{
      QueueNode temp = First;
      int i = 0;
      while(temp != null){
        temp = temp.next;
        i++;
      }
      return i;
    }
}
    static void clear(){
        if(First == null)
            System.out.println("No elements are Existed to Clear");
        else{
      First = Last = null;
      System.out.println("Stack is cleared");    
    }
    }
    static void display(){
      QueueNode temp = First;
      while(temp != null){
        System.out.print(temp.data);
        System.out.print("->");
        temp = temp.next;
      }
      System.out.println();
    }
}
