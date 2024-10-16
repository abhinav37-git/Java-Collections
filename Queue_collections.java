import java.io.*;
import java.util.*;

class Queue_collections {

    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("Abhinav");

        System.out.println(queue.element());
        System.out.println(queue.peek());

        Iterator itr1 = queue.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.hasNext());

            break;
        }

        queue.remove();
        queue.poll();

        System.out.println("After removing two elements from the queue");
        Iterator<String> itr2 = queue.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.hasNext());

            break;
        }
    }
}
