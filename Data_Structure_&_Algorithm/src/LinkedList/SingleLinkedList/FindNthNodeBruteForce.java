//find nth node from end of linked list
package LinkedList.SingleLinkedList;

public class FindNthNodeBruteForce {
    static LinkedListNode head;
    public static void main(String[] args) {
        FindNthNodeBruteForce.addNode(10);
        FindNthNodeBruteForce.addNode(20);
        FindNthNodeBruteForce.addNode(30);
        FindNthNodeBruteForce.addNode(40);
        FindNthNodeBruteForce.addNode(50);
        FindNthNodeBruteForce.println();
        FindNthNodeBruteForce.findNthNodeFromEnd(head,5);

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

    public static void println(){
        LinkedListNode temp=head;
        if(head==null)
            System.out.println("list is empty");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void findNthNodeFromEnd(LinkedListNode temp,int n){
        while(head!=null){
            temp=head.next;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            if(count<n-1) {
                System.out.println("fewer number of nodes");
                return;
            }
            else if(count>n-1)
                head=head.next;
            else {
                System.out.println("Element " + n + " th node from end :" + head.data);
                head = null;
            }
        }
    }
}
