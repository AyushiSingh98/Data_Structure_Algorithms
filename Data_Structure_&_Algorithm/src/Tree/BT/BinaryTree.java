// In this from problem 16 means all leaves related
package Tree.BT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static int result = 0;
    int data;
    BinaryTree left, right;
    static BinaryTree root1,root2;

    BinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        root1 = new BinaryTree(10);
        root1.left = new BinaryTree(20);
        root1.right = new BinaryTree(30);
        root1.left.right = new BinaryTree(40);
        root1.left.right.left = new BinaryTree(50);
        root1.left.right.right = new BinaryTree(60);
        root1.right.right = new BinaryTree(70);
        root1.right.right.left = new BinaryTree(80);
        System.out.println(root1.data + " " + root1.left.data + " " + root1.right.data + " " + root1.left.right.data + " " + root1.left.right.left.data + " " + root1.left.right.right.data + " " + root1.right.right.data + " " + root1.right.right.left.data);

        System.out.println("Number of leaf nodes in BT " + countLeafNode(root1));
        System.out.println();

        System.out.println("Number of leaf nodes in BT using Queue " + countLeafNodeQueue(root1));
        System.out.println();

        System.out.println("Number of full leaf nodes in BT "+countFullLeafNode(root1));
        System.out.println();

        System.out.println("Number of full leaf nodes in BT Using Queue "+countFullLeafNodeQueue(root1));
        System.out.println();

        System.out.println("Number of Half leaf nodes in BT "+countHalfLeafNode(root1));
        System.out.println();

        System.out.println("Number of half leaf nodes in BT Using Queue "+countHalfLeafNodeQueue(root1));
        System.out.println();

        root2 = new BinaryTree(10);
        root2.left = new BinaryTree(20);
        root2.right = new BinaryTree(30);
        root2.left.right = new BinaryTree(40);
        root2.left.right.left = new BinaryTree(50);
        root2.left.right.right = new BinaryTree(60);
        root2.right.right = new BinaryTree(70);
        root2.right.right.left = new BinaryTree(80);
        System.out.println(root2.data + " " + root2.left.data + " " + root2.right.data + " " + root2.left.right.data + " " + root2.left.right.left.data + " " + root2.left.right.right.data + " " + root2.right.right.data + " " + root2.right.right.left.data);

        System.out.println("Is tree Structurally Identical or Same Tree: "+ isSameTree(root1,root2));
        System.out.println();


    }

    public static int countLeafNode(BinaryTree root1) {
        if (root1 == null)
            return 0;
        if ((root1.left == null) && (root1.right == null))
            return 1;
        else
            return countLeafNode(root1.left) + countLeafNode(root1.right);
    }

    public static int countLeafNodeQueue(BinaryTree root1) {
        int count = 0;
        if (root1 == null)
            return 0;
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root1);
        while (!queue.isEmpty()) {
            BinaryTree temp = queue.poll();
            if (temp.left == null && temp.right == null)
                count++;
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        return count;
    }


    public static int countFullLeafNode(BinaryTree root1){
        int count=0;
        if(root1==null)
            return 0;
        if(root1.left!=null && root1.right!=null)
            count++;
        count+=(countFullLeafNode(root1.left)+countFullLeafNode(root1.right));
        return count;
    }


    public static int countFullLeafNodeQueue(BinaryTree root1) {
        int count = 0;
        if (root1 == null)
            return 0;
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root1);
        while (!queue.isEmpty()) {
            BinaryTree temp = queue.poll();
            if (temp.left != null && temp.right != null)
                count++;
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        return count;
    }

    public static int countHalfLeafNode(BinaryTree root1){
        int count=0;
        if(root1==null)
            return 0;
        if((root1.left!=null && root1.right==null) || (root1.left==null && root1.right!=null))
            count++;
        count+=(countHalfLeafNode(root1.left)+countHalfLeafNode(root1.right));
        return count;
    }

    public static int countHalfLeafNodeQueue(BinaryTree root1) {
        int count = 0;
        if (root1 == null)
            return 0;
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root1);
        while (!queue.isEmpty()) {
            BinaryTree temp = queue.poll();
            if (temp.left!=null && temp.right==null || temp.left==null && temp.right!=null)
                count++;
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        return count;
    }

    public static boolean isSameTree(BinaryTree root1,BinaryTree root2){
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null || root1.data!=root2.data)
            return false;
        else
            return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }


}
