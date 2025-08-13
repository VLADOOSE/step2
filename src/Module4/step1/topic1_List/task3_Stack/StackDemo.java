package Module4.step1.topic1_List.task3_Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack= new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println(stack);
        System.out.println(stack.peek() + "\n");
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
