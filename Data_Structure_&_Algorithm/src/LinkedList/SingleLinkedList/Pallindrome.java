package LinkedList.SingleLinkedList;

public class Pallindrome {
   static LinkedListNode head;

    public static void main(String[] args) {
        Pallindrome.addNode(10);
       // Pallindrome.addNode(10);
        Pallindrome.addNode(20);
        Pallindrome.addNode(30);
        Pallindrome.addNode(20);
        Pallindrome.addNode(10);
//        Pallindrome.addNode(20);
//        Pallindrome.addNode(10);
//        Pallindrome.addNode(10);
        Pallindrome.display();
        if(checkPallindrome(head))
            System.out.println("Linked List is pallindrome");
        else
            System.out.println("Linked List is not pallindrome");


    }

    public static void addNode(int data) {
        LinkedListNode temp = new LinkedListNode(data);
        if (head == null) {
            head = temp;
            return;
        }
        LinkedListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
    }

    public static void display() {
        LinkedListNode temp = head;
        if (head == null)
            System.out.println("list is empty");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean checkPallindrome(LinkedListNode head){
        LinkedListNode s_ptr=head;
        LinkedListNode f_ptr=head;

        while(f_ptr!=null && f_ptr.next!=null){
            s_ptr=s_ptr.next;
            f_ptr=f_ptr.next.next;
        }
        s_ptr=reverse(s_ptr);
        f_ptr=head;

        while(s_ptr!=null){
            if(s_ptr.data!= f_ptr.data)
                return false;
            s_ptr=s_ptr.next;
            f_ptr=f_ptr.next;
        }
        return true;
    }

    public static LinkedListNode reverse(LinkedListNode head){
        LinkedListNode prev=null;
        while(head!=null){
            LinkedListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }



}
