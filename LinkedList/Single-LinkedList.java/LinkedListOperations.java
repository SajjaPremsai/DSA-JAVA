// Inserting node at front of the head

import java.util.Scanner;

public class LinkedListOperations {

    static node head;
    static int choice;
    public static void main(String[] args) {
        
        System.out.println("Operations to perform on Linkedlist : ");
        System.out.println("1.Insert the node ");
        System.out.println("2.Insert at First ");
        System.out.println("3.Insert at Last ");
        System.out.println("4.Insert at Nth position ");
        System.out.println("5.Delete at First ");
        System.out.println("6.Delete at Last ");
        System.out.println("7.Delete at Nth position ");
        System.out.println("8.Print all the nodes ");
        System.out.println("9.Search for a node ");
        System.out.println("10.Get the mid node of the list");
        System.out.println("11.Reverse the List");
        System.out.println("Enter 0 to exit ");
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("Enter number to perfrom the action : ");
            choice = in.nextInt();
        switch (choice) {
        case 1:
          insert_node();
          break;
        case 2:
           Insert_at_first();
           break;
        case 3:
           insert_at_last();
           break;
        case 4:
            insert_at_nth();
           break;
        case 5:
            delete_at_first();
           break;
        case 6:
           delete_at_last();
           break;
        case 7:
           delete_at_nth();
           break;
        case 8:
            display_all();
            break;            
        case 9:
            search_ele();
            break;
        case 10:
            mid_ele();
            break;
        case 11:
            reverse_list();
            break;
        default:
            System.out.println("Enter Correct Choice ");
            break;
       }
    }while(choice != 0);
    }
    static void insert_node(){
        Scanner in = new Scanner(System.in);
        if(head == null){
            node new_node = new node();
            System.out.println("Enter data ");
            new_node.data = in.nextInt();
            new_node.next = null;
            head = new_node;
        }
        else
        {
            node temp = head;
            while(temp.next != null)
               temp = temp.next;
            node new_node = new node();
            System.out.println("Enter data ");
            new_node.data = in.nextInt();
            new_node.next = null;
            temp.next = new_node; 
        }
    }
    static void Insert_at_first(){
        if(head == null){
            System.out.println("No nodes are inserted to insert first");
        }
        else{
            Scanner in = new Scanner(System.in);
            node new_node = new node();
            System.out.println("Enter Data ");
            new_node.data = in.nextInt();
            new_node.next = head;
            head = new_node;
        }
        
    }
    static void insert_at_last(){
        if(head == null){
            System.out.println("No nodes are inserted to insert first");
        }
        else{
            node temp = head;
            while(temp.next != null)
               temp = temp.next;
            Scanner in = new Scanner(System.in);
            node new_node = new node();
            System.out.println("Enter Data ");
            new_node.data = in.nextInt();
            new_node.next = null;
            temp.next = new_node;
        }
    }
    static void insert_at_nth(){
        System.out.println("Enter Position to insert the node ");
        Scanner in = new Scanner(System.in);
        int pos = in.nextInt();
        if(head == null)
           System.out.println("No nodes are inserted : ");
        else if(pos > length_list())
           System.out.println("Position Exceeds the length of the List");
        else{
            node temp=head;
            node prev = head;
           for(int i = 0 ; i < pos - 1 ; i++)
           {
              prev = temp;
              temp=temp.next;
           }
            node new_node = new node();
            System.out.println("Enter Data ");
            new_node.data = in.nextInt();
            new_node.next = temp;
            prev.next = new_node;
        }
    }
    static void delete_at_first(){
        if(head == null)
            System.out.println("No nodes are existed ");
        else{
            node temp = head;
            head = head.next;
            temp.next = null;
        }
    }
    static void delete_at_last(){
        if(head == null)
           System.out.println("No nodes are existed ");
        else if(length_list() == 1)
           head = null;
        else{
            node temp = head;
            node prev = temp;
            while(temp.next != null)
            {
              prev = temp;
              temp = temp.next;
            }
            prev.next = null;
        }
    }
    static void delete_at_nth(){

        if(head == null)
           System.out.println("No nodes are existed ");
        System.out.println("Enter position of node to delete ");
        Scanner in = new Scanner(System.in);
        int pos = in.nextInt();
        if(pos > length_list())
           System.out.println("Enter Position is greater than length of the list ");
        else{
            node temp = head;
            node prev = temp;
            for(int i = 0 ; i < pos ; i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
        
    }
    static void display_all(){
        if(head == null)
          System.out.println("No node Exists...");
        else{
            node temp = head;
            while(temp != null){
                System.out.print(temp.data);
                System.out.print("->");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    static int length_list()
    {
        node temp = head;
        int length  = 1;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }
    static void search_ele(){
        System.out.println("Enter Searching Element ");
        Scanner in = new Scanner(System.in);
        int ele = in.nextInt();
        node temp = head;
        int i = 1;
        while(temp != null){
           if(temp.data == ele)
                break;
            else{
                temp = temp.next;
                i++;
            }
        }
        if( i < length_list())
            System.out.println("Element is found at the " + i);
        else
            System.out.println("Element doesnot exists in the list ");
    }
    static void mid_ele(){
        int mid = length_list()/2;
        node temp = head;
        while(mid != 0){
          temp = temp.next;
          mid--;
        }
        System.out.println("The mid node of the list is " + temp.data);
    }
    static void reverse_list()
    {
        node prev = null;
        node current = head;
        node next = null;
        while(current != null){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
        }
        head = prev;
    }
}

