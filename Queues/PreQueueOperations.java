import java.util.ArrayDeque;
import java.util.Queue;

class PreQueueOperations {
   public static void main(String[] args) {
    Queue<Integer> obj = new ArrayDeque<>();

    // offer: is used for to push the element into the queue

    obj.offer(11);
    obj.offer(12);
    obj.offer(13);
    obj.offer(14);
    obj.offer(15);

    // peek : is used for to see the first element in the queue

    System.out.println(obj.peek());

    // remove : is used to remove the first element in the queue

    System.out.println(obj.remove());

    // size : is used to get the size of the queue

    System.out.println(obj.size());


    // clear : it moves the all the elements

    obj.clear();

    System.out.println(obj.peek());

   } 
}
