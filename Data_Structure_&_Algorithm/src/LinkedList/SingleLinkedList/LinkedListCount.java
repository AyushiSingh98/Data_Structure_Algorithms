package LinkedList.SingleLinkedList;

public class LinkedListCount {
    static LinkedListNode head;

    public static void main(String[] args) {
        LinkedListCount.addNode(10);
        LinkedListCount.addNode(20);
        LinkedListCount.addNode(30);
        LinkedListCount.addNode(40);
        LinkedListCount.addNode(50);
        LinkedListCount.println();
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
        int count=0;
        if(head==null)
            System.out.println("list is empty");
        while(temp!=null){
            System.out.print(temp.data+"->");
            count+=1;
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println("Number of node in linked list "+count);
    }
}
