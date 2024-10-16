import java.io.*;
import java.util.*;

class Queue_collections {

    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Abhinav");
        queue.add("Abhishek");
        Scanner sc = new Scanner(System.in);
        queue.add(sc.nextline);
        queue.add(sc.nextline);

        System.out.prinln(
            "The queue created from the priority queue" + queue.element()
        );
        System.out.println(queue.peek());
        Iterator value = queue.iterator();

        while (value.hasNext()) {
            System.out.println(value.hasNext());

            break;
        }

        queue.remove();
        queue.poll();

        System.out.println("After removing two elements from the queue");
        Iterator<String> itr2 = queue.Iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.hasNext());

            break;
        }
    }
}
