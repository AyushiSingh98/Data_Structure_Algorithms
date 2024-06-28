package LinkedList.SingleLinkedList;

import java.util.LinkedList;

public class InsertAtEnd {
    static LinkedListNode head;

    public static void main(String[] args) {
        InsertAtEnd.insertAtEnd(10);
        InsertAtEnd.insertAtEnd(20);
        InsertAtEnd.insertAtEnd(30);
        InsertAtEnd.insertAtEnd(40);
        InsertAtEnd.insertAtEnd(50);
        InsertAtEnd.println();


    }

    public static void insertAtEnd(int data){
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
