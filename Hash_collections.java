import java.util.*;

class Hash_collections {

    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();

        set.add("Abhi");
        set.add("Adi");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr);
        }
        // System.out.println("Elements stored in the hashSet are");
        // for (String str : set) {
        //     System.out.println(str);
        // }
    }
}
