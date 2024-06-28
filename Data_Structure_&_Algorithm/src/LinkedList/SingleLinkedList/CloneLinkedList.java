package LinkedList.SingleLinkedList;

import java.util.LinkedList;

public class CloneLinkedList {
    static LinkedListNode head;

    public static void main(String[] args) {
        LinkedListNode l1 = new LinkedListNode(10);
        l1.next = new LinkedListNode(20);
        l1.next.next = new LinkedListNode(30);
        l1.next.next.next = new LinkedListNode(40);
        l1.next.next.next.next = new LinkedListNode(50);

        l1.random = l1.next.next;
        l1.next.random = l1;
        l1.next.next.random = l1.next.next.next.next;
        l1.next.next.next.random = l1.next.next.next.next;
        l1.next.next.next.next.random = l1.next;
        CloneLinkedList.display(l1);
        System.out.println();
        cloneLinkedList(l1);
    }

    private static void cloneLinkedList(LinkedListNode oldHead) {

//        LinkedListNode newHead=null;
//        LinkedListNode newTemp = null;
//        LinkedListNode oldTemp = oldHead;


        // Step-1

        LinkedListNode newHead = new LinkedListNode(oldHead.data);
        newHead.next = new LinkedListNode(oldHead.next.data);
        newHead.next.next = new LinkedListNode(oldHead.next.next.data);
        newHead.next.next.next = new LinkedListNode(oldHead.next.next.next.data);
        newHead.next.next.next.next = new LinkedListNode(oldHead.next.next.next.next.data);

        // Step-2


        LinkedListNode oldNext = oldHead.next, oldTemp = oldHead;
        LinkedListNode newTemp = newHead;

        while (oldTemp != null) {
            oldTemp.next = newTemp;
            newTemp.random = oldTemp;

            newTemp = newTemp.next;
            oldTemp = oldNext;
            if (oldNext != null)
                oldNext = oldNext.next;
        }

        // Step 3

        newTemp = newHead;

        while(newTemp!=null){
            newTemp.random = newTemp.random.random.next;
            newTemp = newTemp.next;
        }

        CloneLinkedList.display(newHead);
    }


    public static void display(LinkedListNode head) {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.println("Data = " + temp.data + ", Random = " + temp.random.data);
            temp = temp.next;
        }
    }

//    public static LinkedListNode cloneRandomList(LinkedListNode head){
//        LinkedListNode curr = head,temp=null;
//        while(curr != null){
//            temp.next=new LinkedListNode(curr.data);
//        }
//        return curr;
//    }
}
