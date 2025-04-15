import java.util.*;

class Priority_col {

    public static void main(String[] args) {

        CustomComparator<String> compareTo = new CustomComparator<>(){
            public static void(String s1, s2){
                System.out.println(s1.compareTo(s2));

                return s1.compareTo(s2);
            }
        }
        PriorityQueue<String> pqueue = new PriorityQueue<>();

        pqueue.add("Abhinav");
        pqueue.add("New_string");
        pqueue.add("Last_string");

        Iterator<String> itr = pqueue.iterator();

        // while (itr.hasNext()) {
        //     System.out.println(pqueue.element());

        //     break;
        // }
        //

        //Removing the highest priority order first
        while(!pqueue.isEmpty()){
            System.out.println(pqueue.poll());
        }
    }
}
