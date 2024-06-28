package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HalfQueueReverse {
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        System.out.println("Given elements are:");
        for(int x:queue){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Half Reverse element:");
        int k = 4;
        halfQueueReverse(k);
        display();
    }

    public static void halfQueueReverse(int k) {
        if (queue.isEmpty() || k < 0 || k > queue.size()) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
    }

    public static void display() {
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
