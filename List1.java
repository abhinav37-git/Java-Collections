import java.util.*;
import java.util.ArrayList;

class List1 {

    public static void main(String args[]) {
        list<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);

        Iterator<Integer> itr = new Iterator();

        while (itr.hasNext()) {
            System.out.println(itr);
        }
    }
}
