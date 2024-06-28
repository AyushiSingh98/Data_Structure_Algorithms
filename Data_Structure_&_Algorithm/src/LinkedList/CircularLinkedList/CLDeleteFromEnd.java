package LinkedList.CircularLinkedList;

public class CLDeleteFromEnd {
    static CircularLinkedListNode head;
    static CircularLinkedListNode last;

    public static void main(String[] args) {
        CLDeleteFromEnd.addNode(10);
        CLDeleteFromEnd.addNode(20);
        CLDeleteFromEnd.addNode(30);
        CLDeleteFromEnd.addNode(40);

        CLDeleteFromEnd.println();
        CLDeleteFromEnd.deleteFromEnd();
        CLDeleteFromEnd.deleteFromEnd();
        CLDeleteFromEnd.println();
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

    public static void deleteFromEnd(){
        if(head==null)
            return;
        CircularLinkedListNode temp=last.next;
        if(last.next==last) {
            head=last=temp = null;
            return;
        }
       while(temp.next!=last){
           temp=temp.next;
       }
       temp.next=last.next;
       last.next=null;
       last=temp;

    }

    public static void println(){
        if(head==null)
            return;
        CircularLinkedListNode temp=last.next;
        while(temp!=last){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);

    }
}

