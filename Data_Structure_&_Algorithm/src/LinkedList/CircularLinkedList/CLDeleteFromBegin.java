package LinkedList.CircularLinkedList;

public class CLDeleteFromBegin {
    static CircularLinkedListNode head;
    static CircularLinkedListNode last;

    public static void main(String[] args) {
    CLDeleteFromBegin.addNode(10);
     CLDeleteFromBegin.addNode(20);
     CLDeleteFromBegin.addNode(30);
     CLDeleteFromBegin.addNode(40);
     CLDeleteFromBegin.addNode(50);
     CLDeleteFromBegin.println();
     CLDeleteFromBegin.deleteFromBegin();
     CLDeleteFromBegin.deleteFromBegin();
     CLDeleteFromBegin.println();
    }

    public static void addNode(int data){
        CircularLinkedListNode temp=new CircularLinkedListNode(data);
        if(head==null) {
            head = last = temp;
            last.next = temp;
        }
        else{
            temp.next=last.next;
            last.next=temp;
            last=last.next;
        }
    }

    public static void deleteFromBegin(){

        if(head==null)
            return;
        CircularLinkedListNode temp=last.next;
        if(last.next==last)
            last=null;
        else
            last.next=temp.next;
         temp.next=null;
    }

    public static void println(){
        CircularLinkedListNode temp=last.next;
        while(temp!=last){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}
