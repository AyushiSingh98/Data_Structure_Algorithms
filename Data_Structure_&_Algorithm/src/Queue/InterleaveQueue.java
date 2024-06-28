package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveQueue {
    static Queue<Integer> queue=new LinkedList<>();

    public static void main(String[] args) {
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        queue.add(16);
        queue.add(17);
        queue.add(18);
        queue.add(19);
        queue.add(20);
        System.out.println("Given elements are:");
        for(int x:queue){
            System.out.print(x+" ");
        }
        System.out.println();
        interleaveQueue(queue);
        int length=queue.size();
        for(int i=0;i<length;i++){
            System.out.print(queue.remove()+" ");
        }
    }

    public static void interleaveQueue(Queue<Integer> queue){
        if(queue.size()%2 !=0) {
            System.out.println("Enter even number of integers");
            return ;
        }
        System.out.println("Interleave queue :");
        Stack<Integer> stack=new Stack<>();

        int half=queue.size()/2;
        int i;

        for(i=0;i<half;i++){
           stack.push(queue.remove());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        for(i=0;i<half;i++){
            queue.add(queue.remove());
        }

        for(i=0;i<half;i++){
            stack.push(queue.remove());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
            queue.add(queue.remove());
        }
    }
}
