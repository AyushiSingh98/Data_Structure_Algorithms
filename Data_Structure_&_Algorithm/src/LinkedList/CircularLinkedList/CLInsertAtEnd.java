package LinkedList.CircularLinkedList;

public class CLInsertAtEnd {
   static CircularLinkedListNode last;
   //static CircularLinkedListNode head;

    public static void main(String[] args) {
     CLInsertAtEnd.insertAtEnd(10);
     CLInsertAtEnd.insertAtEnd(20);
     CLInsertAtEnd.insertAtEnd(30);
     CLInsertAtEnd.insertAtEnd(40);
     CLInsertAtEnd.insertAtEnd(50);
     CLInsertAtEnd.println();
    }

    public static void insertAtEnd(int data){
        CircularLinkedListNode temp=new CircularLinkedListNode(data);
        if(last == null) {
            last = temp;
            last.next = temp;
        }
        else{
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
    }

    public static void println(){
        if(last == null)
            return;
        CircularLinkedListNode temp=last.next;
        while(temp!=last){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data);
      //  System.out.print(temp.next.data);
    }
}
