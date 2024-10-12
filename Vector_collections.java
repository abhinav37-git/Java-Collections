import java.util.*;

class Vector_collections {

    public static void main(String args[]) {
        Vector<String> list = new Vector<String>();

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
