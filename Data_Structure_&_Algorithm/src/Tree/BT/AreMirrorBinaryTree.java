package Tree.BT;

import javax.swing.tree.TreeNode;

public class AreMirrorBinaryTree {
    int data;
    AreMirrorBinaryTree left, right;
   // static AreMirrorBinaryTree root,root1;

    AreMirrorBinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public static void main(String args[])
    {
        AreMirrorBinaryTree root=new AreMirrorBinaryTree(10);
        root.left=new AreMirrorBinaryTree(20);
        root.right=new AreMirrorBinaryTree(30);
        root.left.left=new AreMirrorBinaryTree(40);
        root.left.right=new AreMirrorBinaryTree(50);
        root.right.left=new AreMirrorBinaryTree(60);
        root.right.right=new AreMirrorBinaryTree(70);
        System.out.print(root.data+" ");
        System.out.print(root.left.data+" ");
        System.out.print(root.right.data+" ");
        System.out.print(root.left.left.data+" ");
        System.out.print(root.left.right.data+" ");
        System.out.print(root.right.left.data+" ");
        System.out.println(root.right.right.data+" ");
        AreMirrorBinaryTree root1=new AreMirrorBinaryTree(10);
        root1.left=new AreMirrorBinaryTree(30);
        root1.right=new AreMirrorBinaryTree(20);
        root1.left.left=new AreMirrorBinaryTree(70);
        root1.left.right=new AreMirrorBinaryTree(60);
        root1.right.left=new AreMirrorBinaryTree(50);
        root1.right.right=new AreMirrorBinaryTree(40);
        System.out.print(root1.data+" ");
        System.out.print(root1.left.data+" ");
        System.out.print(root1.right.data+" ");
        System.out.print(root1.left.left.data+" ");
        System.out.print(root1.left.right.data+" ");
        System.out.print(root1.right.left.data+" ");
        System.out.println(root1.right.right.data+" ");
        System.out.println("Is both binary tree mirror of each other:"+mirror(root,root1));
    }

    public static boolean mirror(AreMirrorBinaryTree root,AreMirrorBinaryTree root1)
    {
        if(root==null && root1==null)
            return true;
        if(root==null || root1==null || root.data!=root1.data)
            return false;
        else
            return(mirror(root.left,root1.right) && mirror(root.right,root1.left));
    }
}
