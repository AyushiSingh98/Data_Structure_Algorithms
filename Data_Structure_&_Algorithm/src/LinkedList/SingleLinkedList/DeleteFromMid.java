package LinkedList.SingleLinkedList;

public class DeleteFromMid {
    static LinkedListNode head;

    public static void main(String[] args) {
        DeleteFromMid.addNode(10);
        DeleteFromMid.addNode(20);
        DeleteFromMid.addNode(30);
        DeleteFromMid.addNode(40);
        DeleteFromMid.addNode(50);
       DeleteFromMid.addNode(60);
//        DeleteFromMid.addNode(70);
        DeleteFromMid.println();
        DeleteFromMid.deleteFromMid();
        DeleteFromMid.println();
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

    public static void deleteFromMid(){
        if(head==null)
            return;
        LinkedListNode temp=new LinkedListNode(0);
        temp.next=head;
        LinkedListNode s_ptr=head;
        LinkedListNode f_ptr=head.next;
        while(f_ptr!=null && f_ptr.next!=null){
            s_ptr=s_ptr.next;
            f_ptr=f_ptr.next.next;
            temp=temp.next;
        }
        System.out.println("delete node "+s_ptr.data);
        temp.next=s_ptr.next;
        s_ptr.next=null;
        s_ptr=null;
    }
}
