package Stack;

public class TwoStackUsingArray {
    static int size;
    static int top1, top2;
    static int arr[];

    TwoStackUsingArray(int data) {
        arr = new int[data];
        size = data;
        top1 = -1;
        top2 = size;
    }

    public static void main(String[] args) {
        TwoStackUsingArray ts = new TwoStackUsingArray(9);
        ts.push1(1);
        ts.push1(2);
        ts.push2(3);
        ts.push2(4);
        ts.push1(10);
        ts.push1(20);
        ts.push2(60);
        ts.push2(40);
        System.out.println("Popped element from stack 1:" + TwoStackUsingArray.pop1());
        ts.push1(45);
        System.out.println("Popped element from stack 1:" + TwoStackUsingArray.pop1());

        System.out.println("Popped element from stack 2:" + TwoStackUsingArray.pop2());

    }

    public static void push1(int data) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = data;
            System.out.println("Push 1:" + data);
        } else {
            System.out.println("Stack is overflow");
            return;
        }
    }

    public static void push2(int data) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = data;
            System.out.println("Push 2:" + data);
        }
        else {
            System.out.println("Stack is overflow");
            return;
        }
    }

    public static int pop1() {
        if (top1 >= 0) {
            int data = arr[top1];
            top1--;
            return data;
        } else {
            System.out.println("Stack is underflow");
            return 0;
        }
    }

    public static int pop2() {
        if (top2 < size) {
            int data = arr[top2];
            top2--;
            return data;
        } else {
            System.out.println("Stack is undeflow");
            return 0;
        }
    }
}
