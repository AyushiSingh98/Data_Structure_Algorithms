package LinkedList.DoublyLinkedList;

public class DLLDeleteAtBegin {
    static DoubleLinkedListNode head;
    static DoubleLinkedListNode tail;

    public static void main(String[] args) {
        DLLDeleteAtBegin.addNode(10);
        DLLDeleteAtBegin.addNode(20);
        DLLDeleteAtBegin.addNode(30);
        DLLDeleteAtBegin.addNode(40);
        DLLDeleteAtBegin.addNode(50);
        DLLDeleteAtBegin.println(head);
        DLLDeleteAtBegin.deleteAtBegin();
        DLLDeleteAtBegin.println(head);
//        DLLDeleteAtBegin.deleteAtBegin();
//        DLLDeleteAtBegin.deleteAtBegin();
//        DLLDeleteAtBegin.println(head);
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

    public static void deleteAtBegin() {
        if (head.next == null)
            head = tail = null;
        else {
            DoubleLinkedListNode temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
            temp = null;
        }

    }
}
