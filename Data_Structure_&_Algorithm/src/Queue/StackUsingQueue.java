//check leetcode once

package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> queue1=new LinkedList<>();
    static Queue<Integer> queue2=new LinkedList<>();

    public static void main(String[] args) {
        int[] data={10,20,30,40,50,60};
        for(int x:data){
            System.out.print(x+" ");
            push(x);
        }
        System.out.println();
        System.out.println("Delete element from queue "+ pop());
        push(70);
        System.out.println("Delete element from queue "+ pop());
        System.out.println("Delete element from queue "+ pop());
        System.out.println("Delete element from queue "+ pop());

    }

    public static void push(int data){
        if(queue1.isEmpty())
            queue2.add(data);
        else
            queue1.add(data);
    }

    public static int pop(){
        int i=0,size;
        if(queue2.isEmpty()){
            size=queue1.size();
            while(i<size-1){
                queue2.add(queue1.remove());
                i++;
            }
            return queue1.remove();
        }
        else{
            size=queue2.size();
            while(i<size-1){
                queue1.add(queue2.remove());
                i++;
            }
            return queue2.remove();
        }
    }
}
