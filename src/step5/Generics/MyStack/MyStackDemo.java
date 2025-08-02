package step5.Generics.MyStack;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(4);
        System.out.println(myStack.pop() + "\n" + myStack.peek() + "\n" + myStack.isEmpty());
    }
}
