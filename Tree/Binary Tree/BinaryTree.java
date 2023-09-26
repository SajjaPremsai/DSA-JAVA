import java.util.Scanner;

public class BinaryTree{           
           
    private class Node{ 
        int val;
        Node left;
        Node right;
        private Node(int val){
           this.val = val;
        }
    }
    
    private Node root;

    public void insert(Scanner scanner){
        System.out.println("Enter the Root Value : ");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner,root);
    }

    private void insert(Scanner scanner , Node node){
        System.out.println("Do you want insert at left of the " + node.val);
        Boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to insert at the left side of the " + node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            insert(scanner, node.left);
        }

        System.out.println("Do you want to insert at the right of the " + node.val);
        Boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to insert at the right of the " + node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            insert(scanner, node.right);
        }
    }
    
    public void display(){
        display(root, "");
    }

    private void display(Node node, String Intend){
            if(node == null)
           return;
        System.out.println(Intend + node.val);
        display(node.left, Intend + "\t");
        display(node.right, Intend + "\t");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.insert(obj);
        tree.display();
    }
}
