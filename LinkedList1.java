import java.util.*;
import java.util.Scanner;

public class LinkedList1 {

    public static List<Integer> newList(List<Integer> newlist, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            newlist.add(sc.nextInt());
        }

        sc.close();

        return newlist;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the new list elements");

        int n = sc.nextInt();

        List<Integer> mylist = new ArrayList<>();

        mylist = newList(mylist, n);

        System.out.println(mylist);

        sc.close();
    }
}
