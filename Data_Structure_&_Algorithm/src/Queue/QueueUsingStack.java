// check once leet code also
package Queue;

import java.util.Stack;

public class QueueUsingStack {
    static Stack<Integer> stack1=new Stack<>();
    static Stack<Integer> stack2=new Stack<>();

    public static void main(String[] args) {
        int[] val={10,20,30,40,50};
        for(int x:val){
            System.out.print(x+" ");
             enQueue(x);
        }
        System.out.println();
        System.out.println("Delete element from queue "+deQueue());
        System.out.println("Delete element from queue "+deQueue());
    }

    public static void enQueue(int data){

        stack1.push(data);
    }

    public static int  deQueue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
