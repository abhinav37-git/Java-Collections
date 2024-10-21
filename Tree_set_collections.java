import java.util.*;

class Tree_set_collections {

    public static void main(String args[]) {
        TreeSet<String> tree = new TreeSet<String>();

        tree.add("Abhinav");
        tree.add("Abhishek");

        Iterator<String> itr = tree.iterator();

        System.out.println(tree);

        while (itr.hasNext()) {
            System.out.println(itr.next());

            break;
        }
    }
}
