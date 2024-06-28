package LinkedList.DoublyLinkedList;

public class DLLDeleteFromMiddle {
    static DoubleLinkedListNode head;
    static DoubleLinkedListNode tail;

    public static void main(String[] args) {
         DLLDeleteFromMiddle.addNode(10);
         DLLDeleteFromMiddle.addNode(20);
         DLLDeleteFromMiddle.addNode(30);
         DLLDeleteFromMiddle.addNode(40);
//         DLLDeleteFromMiddle.addNode(50);
//         DLLDeleteFromMiddle.addNode(60);
        DLLDeleteFromMiddle.println(head);
        DLLDeleteFromMiddle.deleteFromMid();
       // DLLDeleteFromMiddle.deleteFromMid();
        DLLDeleteFromMiddle.println(head);

    }

    public static void addNode(int data) {
        DoubleLinkedListNode temp = new DoubleLinkedListNode(data);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }

    }

    public static void println(DoubleLinkedListNode temp) {
        if (head == null)
            System.out.println("The list is empty");
        while (temp != null) {
            System.out.print(temp.data + "->");
                     temp = temp.next;
        }
        System.out.println("null");
    }

    public static void deleteFromMid(){
        if(head==null)
            return;
         if(head.next==null)
            head=tail=null;
        DoubleLinkedListNode s_ptr=head;
        DoubleLinkedListNode f_ptr=head;
        while(f_ptr!=null && f_ptr.next!=null){
            s_ptr=s_ptr.next;
            f_ptr=f_ptr.next.next;
        }
        s_ptr.prev.next=s_ptr.next;
        s_ptr.next.prev=s_ptr.prev;
        s_ptr=null;

    }
}
