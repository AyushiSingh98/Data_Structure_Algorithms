package LinkedList.CircularLinkedList;

public class CLDeleteFromMiddle {
      static  CircularLinkedListNode head;
      static  CircularLinkedListNode last;

    public static void main(String[] args) {
        CLDeleteFromMiddle.addNode(10);
        CLDeleteFromMiddle.addNode(20);
        CLDeleteFromMiddle.addNode(30);
        CLDeleteFromMiddle.addNode(40);
//        CLDeleteFromMiddle.addNode(50);
//        CLDeleteFromMiddle.addNode(60);
//        CLDeleteFromMiddle.addNode(70);
        CLDeleteFromMiddle.println();
        CLDeleteFromMiddle.deleteFromMid();
        CLDeleteFromMiddle.println();
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

    public static void deleteFromMid(){
        if(head==null)
            return;
        CircularLinkedListNode temp=last.next;
        if(last.next==last) {
            head=last=temp = null;
            return;
        }
        CircularLinkedListNode s_ptr=head;
        CircularLinkedListNode f_ptr=head;
        while(f_ptr!=last && f_ptr.next!=last){
            s_ptr=s_ptr.next;
            f_ptr=f_ptr.next.next;
        }
        System.out.println("The node to be deleted:"+s_ptr.data);
        while(temp.next!=s_ptr){
            temp=temp.next;
        }
        temp.next=s_ptr.next;
        s_ptr.next=null;
        s_ptr=null;
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
