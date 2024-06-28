package LinkedList.SingleLinkedList;

public class SwapNodeInPairs {
    static LinkedListNode head;

    public static void main(String[] args) {
        SwapNodeInPairs.addNode(10);
        SwapNodeInPairs.addNode(20);
        SwapNodeInPairs.addNode(30);
        SwapNodeInPairs.addNode(40);
        SwapNodeInPairs.addNode(50);
        SwapNodeInPairs.addNode(60);
        SwapNodeInPairs.display();
       LinkedListNode new_Head= SwapNodeInPairs.swapNodeInPairs(head);
        System.out.println("Reverse Node in pairs:");
        while(new_Head!=null){
            System.out.print(new_Head.data+"->");
            new_Head = new_Head.next;
        }
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

    public static LinkedListNode swapNodeInPairs(LinkedListNode head){
        if(head==null && head.next==null)
            return head;

        LinkedListNode curr=head;
        LinkedListNode temp=null;
        LinkedListNode newHead=null;
        while(curr!=null && curr.next!=null){
            if(temp!=null)
                temp.next.next=curr.next;

            temp=curr.next;
            curr.next=temp.next;
            temp.next=curr;
            curr=curr.next;

            if(newHead==null)
                newHead=temp;
        }
        return newHead;
    }
}
