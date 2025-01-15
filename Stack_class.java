import java.util.*;

public class Stack_class{
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();

        stack.push("lambo");
        stack.push("ferrari");


        System.out.println(stack.peek());
        System.out.println(stack);

        stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack);

    }
}