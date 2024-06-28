package LinkedList.DoublyLinkedList;

// Its time complexity would be O(n) bcoz we are inserting node at end and for that we traverse all the list
public class DLLInsertAtEnd {
    static DoubleLinkedListNode head;
    static DoubleLinkedListNode tail;

    public static void main(String[] args) {
        DLLInsertAtEnd.insertAtEnd(10);
        DLLInsertAtEnd.insertAtEnd(20);
        DLLInsertAtEnd.insertAtEnd(30);
        DLLInsertAtEnd.insertAtEnd(40);
        DLLInsertAtEnd.insertAtEnd(50);
        DLLInsertAtEnd.println(head);
    }


    public static void insertAtEnd(int data) {
        DoubleLinkedListNode temp = new DoubleLinkedListNode(data);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }

    }

    public static void println(DoubleLinkedListNode temp) {
        if (head == null)
            System.out.println("This list is empty");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
