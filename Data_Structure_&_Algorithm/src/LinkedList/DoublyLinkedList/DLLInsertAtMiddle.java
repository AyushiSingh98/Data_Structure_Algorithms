package LinkedList.DoublyLinkedList;//time complexity O(n)

public class DLLInsertAtMiddle {
    static DoubleLinkedListNode head;
    static DoubleLinkedListNode tail;

    public static void main(String[] args) {
        DLLInsertAtMiddle.addNode(10);
        DLLInsertAtMiddle.addNode(20);
        DLLInsertAtMiddle.addNode(30);
        DLLInsertAtMiddle.addNode(40);
        DLLInsertAtMiddle.addNode(50);
        DLLInsertAtMiddle.println(head);
        DLLInsertAtMiddle.insertAtMiddle(60);
        DLLInsertAtMiddle.println(head);
        DLLInsertAtMiddle.insertAtMiddle(80);
        DLLInsertAtMiddle.println(head);

    }

    public static void addNode(int data){
        DoubleLinkedListNode temp=new DoubleLinkedListNode(data);

        if(head==null){
            head=tail=temp;
        }
        else
        {
            tail.next=temp;
            temp.prev=tail;
        }
        tail=temp;
    }
    public static void insertAtMiddle(int data)
    {
        DoubleLinkedListNode temp=new DoubleLinkedListNode(data);
        DoubleLinkedListNode s_ptr=head;
        DoubleLinkedListNode f_ptr=head.next;
        while(f_ptr!=null && f_ptr.next!=null){
            s_ptr=s_ptr.next;
            f_ptr=f_ptr.next.next;
        }
        temp.next=s_ptr.next;
        temp.prev=s_ptr;
        s_ptr.next=temp;
        s_ptr=temp.next;
        s_ptr.prev=temp;
        //s_ptr.next = temp.prev;
    }

    public static void println(DoubleLinkedListNode temp)
    {

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
