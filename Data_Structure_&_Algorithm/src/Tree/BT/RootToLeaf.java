//program for print root to leaf nodes

package Tree.BT;

import java.util.ArrayList;

public class RootToLeaf {
    int data;
    RootToLeaf left, right;
    static RootToLeaf root;

    RootToLeaf(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        root = new RootToLeaf(10);
        root.left = new RootToLeaf(20);
        root.right = new RootToLeaf(30);
        root.left.left = new RootToLeaf(40);
        root.left.right = new RootToLeaf(50);
        root.right.left = new RootToLeaf(60);
        root.right.right = new RootToLeaf(70);
        System.out.println(root.data + " " + root.left.data + " " + root.right.data + " " + root.left.left.data + " " + root.left.right.data + " " + root.right.left.data + " " + root.right.right.data);

        System.out.println("Root to Leaf Nodes:");
        rootToLeaf();

        System.out.println("Is there path from root to leaf with given sum:"+checkGivenSum(root,100));

    }

    public static void rootToLeaf(){
        if(root==null)
            return;
        ArrayList<Integer> list = new ArrayList<Integer>();
        printRootToLeaf(root,list);
    }
    public static void printRootToLeaf(RootToLeaf root, ArrayList<Integer> list){
        list.add(root.data);
        if(root.left==null && root.right==null){
            printList(list);
            return;
        }
        printRootToLeaf(root.left,list);
        list.remove(list.size()-1);
        printRootToLeaf(root.right,list);
        list.remove(list.size()-1);
    }

    public static void printList(ArrayList<Integer> list){
        for(Integer i:list){
            System.out.println(i+" ");
        }
        System.out.println();
    }

    public static boolean checkGivenSum(RootToLeaf root,int sum){
        if(root==null)
            return false;
        if(root.left==null && root.right==null && root.data==sum)
            return true;
        else
            return checkGivenSum(root.left,sum- root.data) || checkGivenSum(root.right,sum- root.data);
    }

}
