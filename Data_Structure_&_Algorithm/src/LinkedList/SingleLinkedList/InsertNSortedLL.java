package LinkedList.SingleLinkedList;


public class InsertNSortedLL {
    static LinkedListNode head;

    public static void main(String[] args) {
        InsertNSortedLL.addNode(10);
        InsertNSortedLL.addNode(20);
        InsertNSortedLL.addNode(30);
        InsertNSortedLL.addNode(40);
        InsertNSortedLL.addNode(50);
        InsertNSortedLL.display();
//        InsertNSortedLL.insertNodeSorted(head,new LinkedListNode(45));
//        InsertNSortedLL.insertNodeSorted(head,new LinkedListNode(55));
//        InsertNSortedLL.insertNodeSorted(head,new LinkedListNode(60));
//        InsertNSortedLL.insertNodeSorted(head,new LinkedListNode(33));
//        InsertNSortedLL.insertNodeSorted(head,new LinkedListNode(15));
//        InsertNSortedLL.display();
        LinkedListNode new_Head = InsertNSortedLL.reverse(head);

        System.out.println("Reverse Linked List:");
        while(new_Head!=null){
            System.out.print(new_Head.data+"->");
            new_Head = new_Head.next;
        }
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

    public static void display() {
        LinkedListNode temp = head;
        if (head == null)
            System.out.println("list is empty");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
//----insert node in sorted linked list--------------------

//    public static LinkedListNode insertNodeSorted(LinkedListNode temp,LinkedListNode newNode){
//        LinkedListNode prev=null;
//        if(head==null)
//            return newNode;
//        while(temp!=null && temp.data< newNode.data){
//            prev=temp;
//            temp=temp.next;
//        }
//        newNode.next=temp;
//        prev.next=newNode;
//        return head;
//    }
    //--------------------end----------------------------------------------------

    //------------------Reverse a linked list----------------------------------------------------------------
    public static LinkedListNode reverse(LinkedListNode head) {
        LinkedListNode curr = head;
        LinkedListNode prev = null;
        LinkedListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
