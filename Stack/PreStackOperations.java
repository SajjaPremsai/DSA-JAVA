import java.util.Stack;

public class PreStackOperations {
    public static void main(String[] args) {
        Stack <Integer> stk1 = new Stack<Integer>();

        // push this function push the elements into stack from the top 

        stk1.push(11);
        stk1.push(12);
        stk1.push(13);
        stk1.push(14);
        stk1.push(15);

        // peek : it is used for to see the top of the element

        System.out.println(stk1.peek());

        // pop : It is used to remove the top of the element 

        stk1.pop();
        System.out.println(stk1.peek());

        // size : it is used to find the no of element are there in th stack

        System.out.println(stk1.size());

    }
}
