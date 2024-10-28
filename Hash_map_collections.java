import java.util.*;

class Hash_map_collections {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "abhinav");
        map.put(2, "abhishek");
        map.put(3, "new_collection");

        System.out.println(map);

        Set set = map.entrySet();

        Iterator itr = set.iterator();

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // while (itr.hasNext()) {

        //     System.out.println(itr.next());
        // }
    }
}
