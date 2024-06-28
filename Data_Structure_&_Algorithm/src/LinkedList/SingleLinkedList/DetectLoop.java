//check whether the given linked list is either null-terminated or ends in a cycle by using hash table

package LinkedList.SingleLinkedList;

import java.util.HashSet;

public class DetectLoop {
    static LinkedListNode head;

    public static void main(String[] args) {
        DetectLoop.addNode(10);
        DetectLoop.addNode(20);
        DetectLoop.addNode(30);
        DetectLoop.addNode(40);
        DetectLoop.addNode(50);
//        DetectLoop.addNode(60);
//        DetectLoop.addNode(70);
        DetectLoop.addLoop();
        //DetectLoop.display();
//        if (byHash(head))
//            System.out.println("Loop found");
//        else
//            System.out.println("Loop not found");
        //-------------------------method of calling byTwoPtr--------------------------------------------------------------------

//        if (byTwoPtr())
//            System.out.println("loop found");
//        else
//            System.out.println("loop not found");

        //--------------------------method of calling startNode()-------------------------------------------------------------------
        //   DetectLoop.startNode();

        //--------------------------method of calling findLengthOfNode()-------------------------------------------------------------------
        DetectLoop.findLengthOfNode();
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

    public static void addLoop() {
        LinkedListNode s_ptr = head;
        LinkedListNode f_ptr = head;
        while (f_ptr.next != null && f_ptr.next.next != null) {
            f_ptr = f_ptr.next.next;
            s_ptr = s_ptr.next;
        }
        if (f_ptr.next != null)
            f_ptr = f_ptr.next;
        f_ptr.next = s_ptr;
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

    //----Detect loop by hashing ----//
    public static boolean byHash(LinkedListNode h) {
        HashSet<LinkedListNode> set = new HashSet<LinkedListNode>();
        while (h != null) {

            if (set.contains(h.next))
                return true;
            set.add(h.next);
            h = h.next;
        }
        return false;
    }

    //-------------------------------------------------------------
//    public static boolean byTwoPtr() { // Detect loop by two pointer(Floyd Algorithm)
//        LinkedListNode s_ptr = head;
//        LinkedListNode f_ptr = head;
//
//        //--------check whether the given ll is cyclic by two pointers--------
//        while (f_ptr != null && f_ptr.next != null) {
//            s_ptr = s_ptr.next;
//            f_ptr = f_ptr.next.next;
//            if (s_ptr == f_ptr) {
//                return true;
//            }
//        }
//        return false;
//    }
    //----------------------------------------------------------------------------

    //------ if there is cycle then find the start of the node ----------
//    public static void startNode() {
//        LinkedListNode s_ptr=head;
//        LinkedListNode f_ptr=head;
//        while (f_ptr != null && f_ptr.next != null) {
//            s_ptr = s_ptr.next;
//            f_ptr = f_ptr.next.next;
//            if (s_ptr == f_ptr) {
//                System.out.println("loop found");
//                break;
//            }
//        }
//        s_ptr = head;
//        while (s_ptr != f_ptr) {
//            s_ptr = s_ptr.next;
//            f_ptr = f_ptr.next;
//        }
//        System.out.println("Start Node of cyclic list" + f_ptr.data);
//
//    }

    //------ if there is cycle then find the length of the node ----------

    public static void findLengthOfNode() {
        LinkedListNode s_ptr = head;
        LinkedListNode f_ptr = head;
        while (f_ptr != null && f_ptr.next != null) {
            s_ptr = s_ptr.next;
            f_ptr = f_ptr.next.next;
            if (s_ptr == f_ptr) {
                System.out.println("loop found"+ s_ptr.data);
                break;
            }
        }
        int count = 0;
        f_ptr = s_ptr.next;
        while (s_ptr != f_ptr) {
            count++;
            f_ptr = f_ptr.next;
        }
        System.out.println("Length of cyclic node" + count);
    }

}

