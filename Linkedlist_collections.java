import java.util.*;

class Linkedlist_collections {

    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Abhinav");
        list.add("Abhishek");

        System.out.println(list);

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.hasNext());
            break;
        }
    }
}
