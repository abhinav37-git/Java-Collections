import java.util.*;

public class LinkedList1{
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(34);
        list.add(35);
        list.add(36);
        list.add(37);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}