//Implement stack using linked list(Problem-1)
package LinkedList.SingleLinkedList;

public class StackUsingLL {
    static LinkedListNode top;
    static int count=0;
    public static void main(String[] args) {
        StackUsingLL.push(10);
        StackUsingLL.push(20);
        StackUsingLL.push(30);
        StackUsingLL.push(40);
        StackUsingLL.push(50);
        StackUsingLL.push(60);
        StackUsingLL.peek();
        StackUsingLL.pop();
        StackUsingLL.peek();

    }

    public static void push(int data){
        if(count>4){
            System.out.println("Stack is OVERFLOW");
             return;
        }
        LinkedListNode temp=new LinkedListNode(data);
        if(top==null)
            top=temp;
        else{
            temp.next=top;
            top=temp;
        }
        System.out.println(temp.data+" ");
        count++;
    }

    public static void peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element of Stack:"+top.data);
    }

    public static void pop(){
        if(top==null) {
            System.out.println("Stack is UNDERFLOW");
            return;
        }
        LinkedListNode temp=top;
        top=top.next;
        temp.next=null;
        temp=null;
    }
}
