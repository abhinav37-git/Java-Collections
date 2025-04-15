import java.util.*;
import java.util.Scanner;

class ArrList_collections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> newlist = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            newlist.add(sc.nextInt());
        }

        Iterator<Integer> itr = newlist.iterator();

        System.out.println("Elements in the list:");
        while (itr.hasNext()) {
            System.out.println(itr.next() + "");
        }
    }
}
