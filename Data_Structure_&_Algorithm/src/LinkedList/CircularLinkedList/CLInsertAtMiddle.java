package LinkedList.CircularLinkedList;

public class CLInsertAtMiddle {
    static CircularLinkedListNode last;
    static CircularLinkedListNode head;

    public static void main(String[] args) {
        CLInsertAtMiddle.addNode(10);
        CLInsertAtMiddle.addNode(20);
        CLInsertAtMiddle.addNode(30);
        CLInsertAtMiddle.addNode(40);
        CLInsertAtMiddle.addNode(50);
        // CLInsertAtMiddle.addNode(70);
        CLInsertAtMiddle.println();
        CLInsertAtMiddle.insertAtMid(60);
        CLInsertAtMiddle.println();
    }


    public static void addNode(int data) {
        CircularLinkedListNode temp = new CircularLinkedListNode(data);
        if (head == null) {
            head = last = temp;
            last.next = temp;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = last.next;
        }
    }

    public static void insertAtMid(int data) {
        CircularLinkedListNode temp = new CircularLinkedListNode(data);
        if (head == null) {
            head = last = temp;
            return;
        }
        CircularLinkedListNode s_ptr = head;
        CircularLinkedListNode f_ptr = head;
        while (f_ptr != last && f_ptr.next != last) {
            s_ptr = s_ptr.next;
            f_ptr = f_ptr.next.next;
        }
        temp.next = s_ptr.next;
        s_ptr.next = temp;
    }

    public static void println() {
        CircularLinkedListNode temp = head;
        if (last == null)
            return;
        while (temp != last) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
        //  System.out.print(temp.next.data);
    }
}
