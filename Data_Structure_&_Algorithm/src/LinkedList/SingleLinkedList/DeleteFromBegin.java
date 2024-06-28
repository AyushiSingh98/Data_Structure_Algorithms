package LinkedList.SingleLinkedList;

public class DeleteFromBegin {
    static LinkedListNode head;

    public static void main(String[] args) {
        DeleteFromBegin.addNode(10);
        DeleteFromBegin.addNode(20);
        DeleteFromBegin.addNode(30);
        DeleteFromBegin.addNode(40);
        DeleteFromBegin.addNode(50);
        DeleteFromBegin.println();
        DeleteFromBegin.deleteFromBegin();
        DeleteFromBegin.println();
    }

    public static void addNode(int data){
        LinkedListNode temp=new LinkedListNode(data);
        if(head==null) {
            head = temp;
            return;
        }
        LinkedListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
    }

    public static void deleteFromBegin(){
        if(head==null)
        return;
        LinkedListNode temp=head;
        head=head.next;
        temp.next=null;
        temp=null;
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
}
