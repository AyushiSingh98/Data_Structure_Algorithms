package Queue;

import java.util.Stack;

public class QueueReverse {
    int data;
    QueueReverse next;
    static QueueReverse front=null ,rear=null,temp;

    QueueReverse(int data){
        this.data = data;
        this.next=null;
    }

    public static void main(String[] args) {
        enQueue(10);
        enQueue(20);
        enQueue(30);
        enQueue(40);
        enQueue(50);
        display();
        QueueReverse.reverseQueue();
        display();
//        dequeue();
//        dequeue();
//         display();
//        QueueReverse.reverseQueue();
//        display();
    }

    public static void enQueue(int data){
        QueueReverse temp=new QueueReverse(data);
        //System.out.println("Insert element "+ data);
        if(front==null)
            front=temp;
        else
            rear.next=temp;
        rear=temp;
    }

    public static int dequeue(){
       if(front==null)
           System.out.println("Queue is underflow");
       QueueReverse temp=front;
      //  System.out.println("Delete element from queue "+temp.data);
        front=front.next;
        if(front==null)
            rear=null;
        return temp.data;
    }

    public static void display(){
        temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void reverseQueue(){
        Stack<Integer> stack=new Stack<>();
        while(front!=null){
            stack.push(QueueReverse.dequeue());
        }
        while(!stack.isEmpty()){
            QueueReverse.enQueue(stack.pop());
        }
    }
}
