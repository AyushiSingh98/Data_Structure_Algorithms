package Stack;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        for(int num:stack)
            System.out.println(num);

        System.out.println();
        reverseStack(stack);

        for(int num:stack)
            System.out.println(num);
    }

    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        int temp= stack.pop();
        reverseStack(stack);
        insertElement(stack, temp);
    }

    public static void insertElement(Stack<Integer> stack,int temp){
        if(stack.isEmpty()) {
            stack.push(temp);
            return;
        }
        int data=stack.pop();
        insertElement(stack,temp);
        stack.push(data);
    }
}
