package Stack;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(9);
        stack.push(1);
        stack.push(5);
        stack.push(-3);
        stack.push(0);
        for (int num : stack)
            System.out.println("Elements to be sorted:" + num);

        System.out.println();
        sortStack(stack);

        for (int num : stack)
            System.out.println("Elements after sorted:" + num);
    }

    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;
        int temp = stack.pop();
        sortStack(stack);
        insertElement(stack, temp);
    }

    public static void insertElement(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }
        int data = stack.pop();
        insertElement(stack, temp);
        stack.push(data);
    }
}
