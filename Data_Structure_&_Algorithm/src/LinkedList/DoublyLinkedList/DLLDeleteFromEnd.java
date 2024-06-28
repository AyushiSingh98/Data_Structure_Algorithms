package LinkedList.DoublyLinkedList;


public class DLLDeleteFromEnd {
    static DoubleLinkedListNode head;
    static DoubleLinkedListNode tail;

    public static void main(String[] args) {
       DLLDeleteFromEnd.addNode(10);
       DLLDeleteFromEnd.addNode(20);
       DLLDeleteFromEnd.addNode(30);
       DLLDeleteFromEnd.addNode(40);
       DLLDeleteFromEnd.addNode(50);
       DLLDeleteFromEnd.println(head);
       DLLDeleteFromEnd.deleteFromEnd();
       DLLDeleteFromEnd.deleteFromEnd();
        DLLDeleteFromEnd.println(head);

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

    public static void deleteFromEnd(){
        if(head==null)
            return;
        if(head.next==null)
            head=tail=null;
        else{
            DoubleLinkedListNode temp=tail;
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
            temp=null;
        }

    }

}
