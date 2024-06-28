package LinkedList.CircularLinkedList;

import static LinkedList.CircularLinkedList.CLInsertAtMiddle.head;

public class CLInsertAtBegin {
    static CircularLinkedListNode last;
   // static CircularLinkedListNode head;
    public static void main(String[] args) {
        CLInsertAtBegin.insertAtBegin(10);
       CLInsertAtBegin.insertAtBegin(20);
       CLInsertAtBegin.insertAtBegin(30);
       CLInsertAtBegin.insertAtBegin(40);
       CLInsertAtBegin.insertAtBegin(50);
       CLInsertAtBegin.println();
    }

    public static void insertAtBegin(int data){
        CircularLinkedListNode temp=new CircularLinkedListNode(data);
        if(last==null)
           last = temp;
        else
            temp.next=last.next;

        last.next=temp;
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
    }
}
