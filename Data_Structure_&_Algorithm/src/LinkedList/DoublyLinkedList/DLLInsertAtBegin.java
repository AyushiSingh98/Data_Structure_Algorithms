package LinkedList.DoublyLinkedList;//Time Complexity O(1) bcoz we insert node at begin there is no need to traverse the list

public class DLLInsertAtBegin {
    static DoubleLinkedListNode head;

    public static void main(String[] args) {
        DLLInsertAtBegin.insertAtBegin(10);
        DLLInsertAtBegin.insertAtBegin(20);
        DLLInsertAtBegin.insertAtBegin(30);
        DLLInsertAtBegin.println(head);


    }

    public static void insertAtBegin(int data) {
        DoubleLinkedListNode temp = new DoubleLinkedListNode(data);
        if (head == null)
            head = temp;
        else {
            head.prev = temp;
            temp.next = head;
        }
        head = temp;
    }

    public static void println(DoubleLinkedListNode temp) {
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
