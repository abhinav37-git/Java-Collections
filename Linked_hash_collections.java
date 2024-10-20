import java.util.*;

class Linked_hash_collections {

    public static void main(String args[]) {
        LinkedHashSet<String> new_set = new LinkedHashSet<String>();

        new_set.add("Abhinav");
        new_set.add("Abhishek");

        System.out.println(new_set);

        Iterator<String> itr = new_set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr);

            break;
        }
    }
}
