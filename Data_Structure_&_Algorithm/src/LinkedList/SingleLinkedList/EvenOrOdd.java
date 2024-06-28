package LinkedList.SingleLinkedList;

public class EvenOrOdd {
    static LinkedListNode head;

    public static void main(String[] args) {
        EvenOrOdd.addNode(10);
        EvenOrOdd.addNode(20);
        EvenOrOdd.addNode(30);
        EvenOrOdd.addNode(40);
        EvenOrOdd.addNode(50);
        EvenOrOdd.addNode(60);
        EvenOrOdd.display();
        EvenOrOdd.evenOrOdd(head);
    }

    public static void addNode(int data){
        LinkedListNode temp=new LinkedListNode(data);
        if(head==null){
            head=temp;
            return;
        }
        LinkedListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
    }

    public static void display(){
        LinkedListNode temp=head;
        if(head==null)
            System.out.println("list is empty");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void evenOrOdd(LinkedListNode temp){
        while(temp!=null && temp.next!=null){
            temp=temp.next.next;
        }
        if(temp==null)
            System.out.println("Linked List Length is even");
        else
            System.out.println("Linked List Length is odd");
    }
}
