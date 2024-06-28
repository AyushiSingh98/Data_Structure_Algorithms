package LinkedList.DoublyLinkedList;

public class DLLCountNode {
    static DoubleLinkedListNode head;
    static DoubleLinkedListNode tail;

    public static void main(String[] args) {
      DLLCountNode.addNode(10);
      DLLCountNode.addNode(20);
      DLLCountNode.addNode(30);
      DLLCountNode.addNode(40);
      DLLCountNode.addNode(50);
      DLLCountNode.addNode(60);
      DLLCountNode.countNode(head);
    }

    public static void addNode(int data){
        DoubleLinkedListNode temp=new DoubleLinkedListNode(data);
        if(head==null)
            head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
        }
        tail=temp;
    }

    public static void countNode(DoubleLinkedListNode temp){

        int count=0;
        if(head==null)
            System.out.println("The number of node="+count);
        while(temp!=null)
        {
            count++;
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println("The number of node="+count);
    }
}
