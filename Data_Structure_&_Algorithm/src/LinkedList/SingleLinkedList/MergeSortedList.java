package LinkedList.SingleLinkedList;

public class MergeSortedList {
    static LinkedListNode head;

    public static void main(String[] args) {
        LinkedListNode l1 = new LinkedListNode(10);
        l1.next = new LinkedListNode(20);
        l1.next.next = new LinkedListNode(50);
        l1.next.next.next = new LinkedListNode(70);
        l1.next.next.next.next = new LinkedListNode(90);

        System.out.println(l1.data + "->" + l1.next.data + "->" + l1.next.next.data + "->" + l1.next.next.next.data + "->" + l1.next.next.next.next.data);

        LinkedListNode l2 = new LinkedListNode(20);
        l2.next = new LinkedListNode(40);
        l2.next.next = new LinkedListNode(60);
        l2.next.next.next = new LinkedListNode(80);
        System.out.println(l2.data + "->" + l2.next.data + "->" + l2.next.next.data + "->" + l2.next.next.next.data);

//        LinkedListNode newHead = mergeTwoList(l1, l2);
//        while (newHead != null) {
//            System.out.print( newHead.data + "->");
//            newHead = newHead.next;
//        }
//        System.out.println("null");

        LinkedListNode newHead = mergeTwoListRecursion(l1, l2);
        while (newHead != null) {
            System.out.print(newHead.data + "->");
            newHead = newHead.next;
        }
        System.out.println("null");
    }


//    public static LinkedListNode mergeTwoList(LinkedListNode headA, LinkedListNode headB) {
//        LinkedListNode temp = new LinkedListNode(0);
//        LinkedListNode head = null;
//        while (headA != null && headB != null) {
//            if (headA.data < headB.data) {
//                temp.next = headA;
//                headA = headA.next;
//            } else {
//                temp.next = headB;
//                headB = headB.next;
//            }
//            temp = temp.next;
//
//            if (head == null)
//                head = temp;
//
//        }
//
//        if (headA == null)
//            temp.next = headB;
//        if (headB == null)
//            temp.next = headA;
//        return head;
//    }

    public static LinkedListNode mergeTwoListRecursion(LinkedListNode headA, LinkedListNode headB) {
        if (headA == null)
            return headB;
        if (headB == null)
            return headA;

        LinkedListNode temp;
        if (headA.data < headB.data) {
            temp = headA;
            temp.next = mergeTwoListRecursion(headA.next, headB);
        } else {
            temp = headB;
            temp.next = mergeTwoListRecursion(headA, headB.next);
        }
        return temp;
    }

}
