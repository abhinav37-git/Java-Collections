class NewSet {

    public static HashSet<Integer> newHashSet(HashSet<Integer> hashset, int n) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Loop for inserting the hashset values using user input
        for (int i = 0; i < n; i++) {
            hashset.add(sc.nextInt());
        }

        //Using iterator to iterate through the hashset
        Iterator<Integer> itr = hashset.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            break;
        }

        //Return the hashset from the method
        return hashset;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the input for the length of arraylist
        int n = sc.nextInt();

        //Declaring new array list for inserting the hashset values
        list<Integer> mylist = new ArrayList<>();
        System.out.println("Enter the elements of new hash set");

        //Use of arraylist into hashset
        mylist = newHashSet(mylist, n);
        System.out.println("The elements of hashset are" + mylist);
    }
}
