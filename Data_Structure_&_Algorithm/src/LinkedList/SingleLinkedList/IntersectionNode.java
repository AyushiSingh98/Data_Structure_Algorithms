package LinkedList.SingleLinkedList;


import java.util.HashSet;
import java.util.Stack;

public class IntersectionNode {
    static LinkedListNode headA;
    static LinkedListNode headB;

    public static void main(String[] args) {
        LinkedListNode l1 = new LinkedListNode(10);
        l1.next = new LinkedListNode(20);
        l1.next.next = new LinkedListNode(30);
        l1.next.next.next = new LinkedListNode(40);

        LinkedListNode temp = l1.next.next.next;

        l1.next.next.next.next = new LinkedListNode(50);

        System.out.println(l1.data + "->" + l1.next.data + "->" + l1.next.next.data + "->" + l1.next.next.next.data + "->" + l1.next.next.next.next.data);

        LinkedListNode l2 = new LinkedListNode(70);
        l2.next = new LinkedListNode(80);
        l2.next.next = temp;

        System.out.println(l2.data + "->" + l2.next.data + "->" + temp.data);
        // System.out.println("The node of intersection: " + getIntersectionNodeBruteForceApproch(l1, l2).data);
        System.out.println("The node of intersection: " + getIntersectionNodeHashSet(l1, l2).data);
       // IntersectionNode.getIntersectionNodeUsingStack(l1, l2);
       // IntersectionNode.getIntersectionNodeDifference(l1,l2);
    }

//    public static LinkedListNode getIntersectionNodeBruteForceApproch(LinkedListNode headA, LinkedListNode headB) {
//        if (headA == null)
//            return headB;
//
//        if (headB == null)
//            return headA;
//
//        LinkedListNode tempA = headA;
//        while (tempA != null) {
//            LinkedListNode tempB = headB;
//            while (tempB != null) {
//                if (tempA == tempB)
//                    return tempA;
//                tempB = tempB.next;
//            }
//            tempA = tempA.next;
//        }
//        return null;
//    }
//------------------------By hashing------------------------------------------

    public static LinkedListNode getIntersectionNodeHashSet(LinkedListNode headA, LinkedListNode headB) {
        HashSet<LinkedListNode> set = new HashSet<LinkedListNode>();

        while (headA != null) {
            set.add(headA.next);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB.next))
                return headB.next;
            headB = headB.next;
        }
        return null;
    }

    //--------------------------By using two stack---------------------------------------

//    public static void getIntersectionNodeUsingStack(LinkedListNode headA, LinkedListNode headB) {
//        LinkedListNode temp1 = null;
//
//        Stack<LinkedListNode> st1 = new Stack<>();
//        Stack<LinkedListNode> st2 = new Stack<>();
//
//        while (headA != null) {
//            st1.push(headA.next);
//            headA = headA.next;
//        }
//
//        while (headB != null) {
//            st2.push(headB.next);
//            headB = headB.next;
//        }
//
//        while (!st1.isEmpty() && !st2.isEmpty()) {
//            if (st1.peek() == st2.peek()) {
//                temp1 = st1.peek();
//                st1.pop();
//                st2.pop();
//            } else {
//                break;
//            }
//        }
//        System.out.println(temp1.data);
//
//    }

    //-----------------------------Efficient approach by difference-----------------------------
//    public static void getIntersectionNodeDifference(LinkedListNode headA, LinkedListNode headB){
//
//        LinkedListNode tempA=headA;
//        LinkedListNode tempB=headB;
//        int len1=0,len2=0,diff=0;
//
//        while(tempA!=null){
//            len1++;
//            tempA=tempA.next;
//        }
//
//        while(tempB!=null){
//            len2++;
//            tempB=tempB.next;
//        }
//
//        if(len1>len2){
//            diff=len1-len2;
//              tempA=headA;
//              tempB=headB;
//            }
//        else{
//            diff=len2-len1;
//            tempA=headB;
//            tempB=headA;
//        }
//
//        for(int i=0;i<diff;i++)
//            tempA=tempA.next;
//
//        while(tempA!=null && tempB!=null){
//            if(tempA==tempB){
//                System.out.println(tempA.data);
//                break;
//            }
//            tempA=tempA.next;
//            tempB=tempB.next;
//        }
//    }
}

