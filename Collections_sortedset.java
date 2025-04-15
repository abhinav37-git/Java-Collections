import java.util.*;

public class Collections_sortedset {

    public static SortedSet<String> newSet(SortedSet<String> newset, int n) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine(); //Consuming the leftover after using the nextInt
        for (int i = 0; i < n; i++) {
            newset.add(sc.nextLine());
        }

        sc.close();

        return newset;
    }

    public static void main(String[] args) {
        SortedSet<String> myset = new TreeSet<String>();
        //Defining scanner class for user input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        myset = newSet(myset, n);

        sc.close();

        System.out.print(myset);
    }
}
