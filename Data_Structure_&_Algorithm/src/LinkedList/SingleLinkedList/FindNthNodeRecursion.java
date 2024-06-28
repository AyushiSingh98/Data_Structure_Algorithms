package LinkedList.SingleLinkedList;

public class FindNthNodeRecursion {
    static LinkedListNode head;

    //static int n;
    public static void main(String[] args) {
        FindNthNodeRecursion.addNode(10);
        FindNthNodeRecursion.addNode(20);
        FindNthNodeRecursion.addNode(30);
        FindNthNodeRecursion.addNode(40);
        FindNthNodeRecursion.addNode(50);
        FindNthNodeRecursion.println();
        FindNthNodeRecursion.nthNodeFromEnd(head, 2);


    }

    public static void addNode(int data) {
        LinkedListNode temp = new LinkedListNode(data);
        if (head == null) {
            head = temp;
            return;
        }
        LinkedListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
    }

    public static void println() {
        LinkedListNode temp = head;
        if (head == null)
            System.out.println("list is empty");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int nthNodeFromEnd(LinkedListNode head, int n) {
        if (head == null)
            return 0;

       int count = nthNodeFromEnd(head.next,n)+1;

        if(count==n)
            System.out.println("nth node from end"+head.data);


        return count;
    }
}
