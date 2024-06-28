package LinkedList.SingleLinkedList;

public class AdjacentElements {
    static LinkedListNode head;

    public static void main(String[] args) {
        AdjacentElements.addNode(10);
        AdjacentElements.addNode(20);
        AdjacentElements.addNode(30);
        AdjacentElements.addNode(40);
        AdjacentElements.addNode(50);
        AdjacentElements.addNode(60);
        AdjacentElements.display();
        System.out.println("Adjacent elements in a linked list:");
        AdjacentElements.adjacentElements(head);
        AdjacentElements.display();

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

    public static void adjacentElements(LinkedListNode temp){
        while(temp!=null && temp.next!=null){
            int i=temp.data;
            temp.data=temp.next.data;
            temp.next.data=i;
            temp=temp.next.next;
        }
    }
}
