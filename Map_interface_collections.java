import java.util.*;

class Map_interface_collections {

    public static void main(String args[]) {
        Map map = new HashMap();

        map.put(1, "Abhinav");
        map.put(2, "Abhishek");

        System.out.println(map);

        Set set = map.entrySet();

        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.hasNext());

            break;
        }
    }
}
