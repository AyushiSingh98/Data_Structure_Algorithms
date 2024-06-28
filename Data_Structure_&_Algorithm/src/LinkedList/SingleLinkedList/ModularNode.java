package LinkedList.SingleLinkedList;

public class ModularNode {
    static LinkedListNode head;

    public static void main(String[] args) {
        ModularNode.addNode(30);
        ModularNode.addNode(70);
        ModularNode.addNode(10);
        ModularNode.addNode(90);
        ModularNode.addNode(80);
        ModularNode.display();
        int k=2;
      //  LinkedListNode result=modularNode(head,k);
        LinkedListNode result=modularNodeFromEnd(head,k);
        if(result!=null)
          System.out.println("Modular node in linked list:"+result.data);
        else
            System.out.println("null");

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

//    public static LinkedListNode modularNode(LinkedListNode head,int k){
//        if(k<=0 || head==null)
//            return null;
//
//        LinkedListNode mod_Node=null;
//        int i=1;
//        for(LinkedListNode temp=head;temp!=null;temp=temp.next){
//            if(i%k==0)
//                mod_Node=temp;
//            i++;
//        }
//        return mod_Node;
//    }

    public static LinkedListNode modularNodeFromEnd(LinkedListNode head,int k){
        LinkedListNode mod_Node=head;

        int i=0;

        while(head!=null)
        {
            if(i<k)
                i++;
            else
                mod_Node=mod_Node.next;
            head=head.next;
        }
        return mod_Node;
    }
}
