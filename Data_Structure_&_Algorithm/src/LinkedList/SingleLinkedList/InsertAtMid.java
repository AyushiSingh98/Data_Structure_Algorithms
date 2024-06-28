package LinkedList.SingleLinkedList;

public class InsertAtMid {
    static LinkedListNode head;

    public static void main(String[] args) {
        InsertAtMid.addNode(10);
        InsertAtMid.addNode(20);
        InsertAtMid.addNode(30);
        InsertAtMid.addNode(40);
        //InsertAtMid.addNode(60);
        InsertAtMid.println();
        InsertAtMid.insertAtMid(50);
        InsertAtMid.println();
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

    public static void insertAtMid(int data){
        if(head==null)
            head=new LinkedListNode(data);
        else{
            LinkedListNode temp=new LinkedListNode(data);
            LinkedListNode s_ptr=head;
            LinkedListNode f_ptr=head.next;
            while(f_ptr!=null && f_ptr.next!=null){
                s_ptr=s_ptr.next;
                f_ptr=f_ptr.next.next;
            }
            temp.next=s_ptr.next;
            s_ptr.next=temp;
        }

    }
}
