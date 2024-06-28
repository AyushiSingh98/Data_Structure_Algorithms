package LinkedList.SingleLinkedList;

public class InsertAtPosition {

    static LinkedListNode head;
    public static void main(String args[]){
        head=new LinkedListNode(10);
        InsertAtPosition.addNode(20,head);
        InsertAtPosition.addNode(30,head);
        InsertAtPosition.addNode(40,head);
        InsertAtPosition.addNode(50,head);
        InsertAtPosition.printlist(head);
        System.out.println("Insert 100 at position 3");
        InsertAtPosition.atpos(100,3);
        InsertAtPosition.printlist(head);
        System.out.println("Insert 90 at position 6");
        InsertAtPosition.atpos(90,6);
        InsertAtPosition.printlist(head);

        System.out.println("Insert 90 at position 1");
        InsertAtPosition.atpos(90,1);
        InsertAtPosition.printlist(head);

        System.out.println("Insert 66 at position 9");
        InsertAtPosition.atpos(66,9);
        InsertAtPosition.printlist(head);


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
    public static void atpos(int data,int pos){
        LinkedListNode temp=new LinkedListNode(data);
        temp.data=data;
        temp.next=null;
        if(head==null)
        {
          //  temp.next=head;
            head=temp;
        }
        if(pos == 1){
            temp.next=head;
            head=temp;
        }
        else
        {
            LinkedListNode dummy = head;
            for(int i=1;i<pos-1;i++)
            {
                dummy=dummy.next;
            }
            temp.next=dummy.next;
            dummy.next=temp;

        }

    }
}
