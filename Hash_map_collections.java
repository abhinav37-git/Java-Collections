import java.util.*;

class Hash_map_collections {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "abhinav");
        map.put(2, "abhishek");
        map.put(3, "new_collection");
        map.put(4, "null_input");

        System.out.println(map);

        // Non iterable

        Set set = map.entrySet();

        for (Map.Entry entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + " " + entrySet.getValue());

            break;
        }
    }
}
