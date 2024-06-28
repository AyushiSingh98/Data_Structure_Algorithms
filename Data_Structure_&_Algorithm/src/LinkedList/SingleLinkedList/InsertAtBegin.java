package LinkedList.SingleLinkedList;

import java.util.LinkedList;

public class InsertAtBegin {
    static LinkedListNode head;

    public static void main(String[] args) {
        InsertAtBegin.insertAtBegin(10);
        InsertAtBegin.insertAtBegin(20);
        InsertAtBegin.insertAtBegin(30);
        InsertAtBegin.insertAtBegin(40);
        InsertAtBegin.insertAtBegin(50);
        InsertAtBegin.println();

    }

    public static void insertAtBegin(int data){
        LinkedListNode temp=new LinkedListNode(data);
        if(head==null){
            head=temp;
         //   return;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }

    public static void println(){
        LinkedListNode temp=head;
        if(head==null)
            System.out.println("list is empty");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
