import java.util.Scanner;

public class StackOperations {
    static int pos = -1;
    static Node top;
    static int choice;
    public static void main(String[] args) {
        System.out.println("Operations to perform on Stack : ");
        System.out.println("1.Push ");
        System.out.println("2.Pop ");
        System.out.println("3.Peek ");
        System.out.println("4.Display all data in the Stack : ");
        System.out.println("5.Size of the Stack ");
        System.out.println("Enter 0 to exit ");
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("Enter number to perfrom the action : ");
            choice = in.nextInt();
        switch (choice) {
        case 1:
          push();
          break;
        case 2:
           pop();
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
        default:
            System.out.println("Enter Correct Choice ");
            break;
       }
    }while(choice != 0);
    }

    static void push(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value : ");
        int val = in.nextInt();
        Node n1 = new Node();
        n1.data = val;
        n1.next = null;
        if(pos == -1){
            pos++;
            top = n1;
        }
        else if(pos > -1)
        {
          pos++;
          n1.next = top;
          top = n1;
        }
    }
    static void display(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    static void peek(){
        System.out.println(top.data);
    }
    static void pop(){
        if(pos == -1){
            System.out.println("Stack is Under Flow... try to insert then use the pop...");
        }
        else if(pos > -1){
        Node temp = top;
        top = temp.next;
        temp.next = null;
        }
    }
    static int size(){
        Node temp = top;
        int i = 1;
        while(temp != null){
            temp = temp.next;
            i++;
        }
        return i;
    }
}
