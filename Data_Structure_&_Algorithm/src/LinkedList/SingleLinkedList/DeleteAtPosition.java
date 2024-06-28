package LinkedList.SingleLinkedList;

public class DeleteAtPosition {
        static LinkedListNode head;
    public static void main(String args[]){
        head=new LinkedListNode(10);
        DeleteAtPosition.addNode(20,head);
        DeleteAtPosition.addNode(30,head);
        DeleteAtPosition.addNode(40,head);
        DeleteAtPosition.addNode(50,head);
        DeleteAtPosition.printlist(head);
        DeleteAtPosition.delatpos(3);
        DeleteAtPosition.printlist(head);
        DeleteAtPosition.delatpos(4);
        DeleteAtPosition.printlist(head);

    //    DeleteAtPosition.printlist(head);


    }

    public static void addNode(int data,LinkedListNode temp)
    {
        if(temp==null)
            return;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new LinkedListNode(data);

    }
    public static void printlist(LinkedListNode temp){
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public static void delatpos(int pos){
        if(pos <= 0) {
            System.out.println("invalid position");
            return;
        }
        if(pos==1)
        {
            LinkedListNode temp=head;
            head=head.next;
            temp.next=null;
            temp=null;
        }
        else
        {
            LinkedListNode temp = head;
            for(int i=1;i<(pos-1);i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;


        }

    }
}
