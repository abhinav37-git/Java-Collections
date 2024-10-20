import java.util.*;

class Deque_collections {

    public static void main(String args[]) {
        Deque<String> deque = new ArrayDeque<String>();

        deque.add("Abhinav");
        deque.add("Abhishek");

        for (String str : deque) {
            System.out.println(str);
        }
    }
}
