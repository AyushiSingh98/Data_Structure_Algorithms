package LinkedList.SingleLinkedList;

public class DeleteFromEnd {
    static LinkedListNode head;

    public static void main(String[] args) {
        DeleteFromEnd.addNode(10);
        DeleteFromEnd.addNode(20);
        DeleteFromEnd.addNode(50);
        DeleteFromEnd.addNode(30);
        DeleteFromEnd.addNode(40);
        DeleteFromEnd.println();
        DeleteFromEnd.deleteFromEnd();
        DeleteFromEnd.println();
        DeleteFromEnd.deleteFromEnd();
        DeleteFromEnd.println();
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

    public static void deleteFromEnd(){
        if(head==null || head.next==null)
            return;
        LinkedListNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }
}
