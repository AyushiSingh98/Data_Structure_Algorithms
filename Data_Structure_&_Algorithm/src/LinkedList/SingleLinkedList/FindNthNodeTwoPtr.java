//find nth node from end using two pointers and it is efficient approach
package LinkedList.SingleLinkedList;

public class FindNthNodeTwoPtr {
    static  LinkedListNode head;

    public static void main(String[] args) {
        FindNthNodeTwoPtr.addNode(10);
        FindNthNodeTwoPtr.addNode(20);
        FindNthNodeTwoPtr.addNode(30);
        FindNthNodeTwoPtr.addNode(40);
        FindNthNodeTwoPtr.addNode(50);
        FindNthNodeTwoPtr.addNode(60);
        FindNthNodeTwoPtr.println();
        FindNthNodeTwoPtr.findNthNodeTwoPtr(4);
        FindNthNodeTwoPtr.println();
        FindNthNodeTwoPtr.findNthNodeTwoPtr(5);
    }

    public static void addNode(int data){
        LinkedListNode temp=new LinkedListNode(data);
        if(head==null){
            head=temp;
            return;
        }
        LinkedListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
    }

    public static void println(){
        LinkedListNode temp=head;
        if(head==null)
            System.out.println("list is empty");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void findNthNodeTwoPtr(int n){
//        LinkedListNode temp = new LinkedListNode(0);
//        temp.next = head;
        LinkedListNode main_ptr=head;
        LinkedListNode ref_ptr=head;
        int count=0;
        while(ref_ptr!=null) {
            if (count < n) {
                ref_ptr = ref_ptr.next;
                count++;
            } else {
                ref_ptr = ref_ptr.next;
                main_ptr = main_ptr.next;
                //temp = temp.next;
            }
        }
        System.out.println("Element " + n + " th node from end :" + main_ptr.data);
//        temp.next = main_ptr.next;
//        main_ptr.next = null;
//        main_ptr = null;   //for delete nth node from end


    }
}
