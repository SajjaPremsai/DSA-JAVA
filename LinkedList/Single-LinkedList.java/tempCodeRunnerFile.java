static void display_all(){
        if(head == null)
          System.out.println("No node Exists...");
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data);
                System.out.print("->");
                temp = temp.next;
            }
            System.out.println();
        }
    }