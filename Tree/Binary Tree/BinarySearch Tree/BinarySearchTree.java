import java.util.Scanner;

public class BinarySearchTree{           
           
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
        System.out.println("Enter the value to insert " + node.val);
        int val = scanner.nextInt();
        if(node.val > val ){
            node.left = new Node(val);
            insert(scanner, node.left);
        }

        if(node.val < val){
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
