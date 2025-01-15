import java.util.*;

class ArrList_collections {

    public static void main(String args[]) {
        List<String> friends = new ArrayList();

        friends.add("Abhinav");
        friends.add("Abhishek");
        friends.add("Saransh");

        for (String friend : friends) {
            System.out.println(friend);
        }

        friends.set(2, "Router");
        System.out.println(friends);

        System.out.println(friends.contains("Router"));

//        //New list
        List<String> list2 = new ArrayList();
        list2.add("Joshi");
        list2.add("Monal");

        Iterator<String> it = friends.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }





//        Iterator<String> it = new friends.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        System.out.println(friends.get(1));
    }
}
