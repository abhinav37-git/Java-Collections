import java.util.*;

class ArrList_collections {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Abhinav");
        list.add("Abhishek");
        System.out.println(list);

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.hasNext());
            break;
        }
    }
}
