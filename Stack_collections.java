import java.util.*;

class Stack_collections {

    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();

        stack.push("Abhinav");
        stack.push("Abhishek");

        System.out.println(stack);

        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.hasNext());
            break;
        }
    }
}
