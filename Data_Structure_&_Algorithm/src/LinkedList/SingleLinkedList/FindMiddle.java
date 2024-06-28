package LinkedList.SingleLinkedList;

public class FindMiddle {
    static LinkedListNode head;

    public static void main(String[] args) {
        FindMiddle.addNode(10);
        FindMiddle.addNode(20);
        FindMiddle.addNode(30);
        FindMiddle.addNode(40);
//        FindMiddle.addNode(50);
//        FindMiddle.addNode(60);
        FindMiddle.display();
        FindMiddle.findMid();
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

    public static void display(){
        LinkedListNode temp=head;
        if(head==null)
            System.out.println("list is empty");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void findMid(){
        LinkedListNode s_ptr=head;
        LinkedListNode f_ptr=head;

        while(f_ptr!=null && f_ptr.next!=null){
            s_ptr=s_ptr.next;
            f_ptr=f_ptr.next.next;
        }
        System.out.println("The middle of linked list:"+s_ptr.data);
    }
}
