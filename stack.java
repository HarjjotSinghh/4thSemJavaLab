
import java.util.*;

class stack {
    static void push_into_stack(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void pop_from_stack(Stack<Integer> stack) {
        System.out.println("Pop Operation:");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    static void peek_into_stack(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on top: " + element);
    }

    static void search_in_stack(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position: " + pos);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        push_into_stack(stack);
        pop_from_stack(stack);
        push_into_stack(stack);
        peek_into_stack(stack);
        search_in_stack(stack, 42);
        search_in_stack(stack, 89);
        System.out.println("Harjot Singh Rana | 11576802722 | CSE 3");
    }
}
