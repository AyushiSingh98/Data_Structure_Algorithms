// Program to print Binary Tree & Preorder & Inorder & PostOrder
package Tree.BT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeNode {
    static  int result=0;
    int data;
    BinaryTreeNode left, right;
    static BinaryTreeNode root;

    BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        root = new BinaryTreeNode(10);
        BinaryTreeNode n1= root.left = new BinaryTreeNode(20);
        root.right = new BinaryTreeNode(30);
       root.left.left = new BinaryTreeNode(40);
        root.left.right = new BinaryTreeNode(50);
        root.right.left = new BinaryTreeNode(60);
        BinaryTreeNode n2=root.right.right = new BinaryTreeNode(70);
        System.out.println(root.data + " " + root.left.data + " " + root.right.data + " " + root.left.left.data + " " + root.left.right.data + " " + root.right.left.data + " " + root.right.right.data);
        System.out.println("PreOrder Traversal of Tree");
        preOrder(root);
        System.out.println();

        System.out.println("InOrder Traversal of Tree");
        inOrder(root);
        System.out.println();

        System.out.println("PostOrder Traversal of Tree");
        postOrder(root);
        System.out.println();

        System.out.println("Maximum element of Binary Tree " + findMax(root));
        System.out.println();

        System.out.println("Maximum element of Binary Tree Usind LOT " + findMaxQueue(root));
        System.out.println();

        int value = 80;
        if (searchElement(root, value))
            System.out.println("Searching element " + value + " is found in binary tree");
        else
            System.out.println("Searching element " + value + " is not found in binary tree");
        System.out.println();

        int val = 10;
        if (searchElementQueue(root, val))
            System.out.println("Searching element " + val + " is found in binary tree");
        else
            System.out.println("Searching element " + val + " is not found in binary tree");
        System.out.println();

//        insertElement(root,80);
//        System.out.println(root.left.left.left.data);
        System.out.println();

        System.out.println("Height of BT " + findHeight(root));
        System.out.println();

        findHeightQueue(root);
        System.out.println();

        System.out.println("Level order traversal");
        levelOrderTraversal(root);
        System.out.println();

        System.out.println("Level order traversal Using queue");
        levelOrderTraversalQueue(root);
        System.out.println();

        System.out.println("Level order traversal in reverse Order");
        levelOrderReverse(root);
        System.out.println();

        System.out.print("Level Order Traversal in reverse order using Queue");
        System.out.println();
        levelOrderReverseQueue(root);
        System.out.println();

        System.out.println("Minimum depth of Binary Tree  " + minimumDepth(root));
        System.out.println();

        int level=findHeight(root);
        deepestNode(root,level);
        System.out.println("Deepest Node in BT "+result);
        System.out.println();

        BinaryTreeNode deep=deepestNodeQueue(root);
        System.out.println("Deepest node in BT using Queue "+deep.data);
        System.out.println();

        System.out.println("Sum of binary Tree: "+sumBinaryTree(root));
        System.out.println();

        sumBinaryTreeQueue(root);
        System.out.println();

      System.out.println("Ancestors of given node :");
        BinaryTreeNode.printAncestors(root,70);
        System.out.println();


        System.out.println("Least Common Ancestor of ("+n1.data+","+n2.data+") is::"+(leastCommonAncestor(root,n1,n2).data));
    }

    public static void preOrder(BinaryTreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(BinaryTreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(BinaryTreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static int findMax(BinaryTreeNode root) {
        if (root == null)
            return 0;
        int temp = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if (left > temp)
            temp = left;
        if (right > temp)
            temp = right;
        return temp;
    }

    public static int findMaxQueue(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max = 0;
        while (!queue.isEmpty()) {
            if (root == null)
                return 0;
            BinaryTreeNode temp = queue.poll();
            if (temp.data > max)
                max = temp.data;
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        return max;
    }

    public static boolean searchElement(BinaryTreeNode root, int data) {
        if (root == null)
            return false;
        if (root.data == data)
            return true;
        boolean left = searchElement(root.left, data);
        boolean right = searchElement(root.right, data);
        return left || right;
    }

    public static boolean searchElementQueue(BinaryTreeNode root, int data) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            if (root == null)
                return false;
            BinaryTreeNode temp = queue.poll();
            if (temp.data == data)
                return true;
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        return false;
    }

    public static BinaryTreeNode insertElement(BinaryTreeNode root, int data) { //we need to make it right some doubts are here
        if (root == null) {
            root = new BinaryTreeNode(data);
            return root;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode temp = queue.poll();
            if (temp.left != null)
                queue.add(temp.left);
            else {
                temp.left = new BinaryTreeNode(data);
                return root;
            }
            if (temp.right != null)
                queue.add(temp.right);
            else {
                temp.right = new BinaryTreeNode(data);
                return root;
            }
        }
        return root;

    }

//    public static BinaryTreeNode deleteBinaryTree(BinaryTreeNode root){
//        if(root==null)
//            return null;
//        deleteBinaryTree(root.left);
//        deleteBinaryTree(root.right);
//        System.out.println("Delete node"+root.data);
//        root=null;
//        return root;
//    }

    public static int findHeight(BinaryTreeNode root) {
        if (root == null)
            return 0;
        int left = findHeight(root.left);
        int right = findHeight(root.right);
        if (left > right)
            return left + 1;
        else
            return right + 1;
    }

    public static void findHeightQueue(BinaryTreeNode root) {
        if (root == null)
            return;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int count = 1;
        while (!queue.isEmpty()) {
            BinaryTreeNode temp = queue.poll();
            if (temp != null) {
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            } else if (!queue.isEmpty()) {
                queue.add(null);
                count++;
            }
        }
        System.out.println("Height of Binary Tree using Queue: " + count);
    }


    //---------------------------------------------------------------------------------------------

    public static void levelOrderTraversal(BinaryTreeNode root) {
        int h = findHeight(root);
        for (int i = 1; i <= h; i++) {
            printLevel(root, i);
        }
    }

    public static void printLevel(BinaryTreeNode root, int level) {
        if (level == 1) {
            System.out.print(root.data + " ");
            return;
        } else {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }

    //------------------------------------------------------------------------------------------

    public static void levelOrderTraversalQueue(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    //----------------------------------------------------------------------------------------

    public static void levelOrderReverse(BinaryTreeNode root) {
        int h = findHeight(root);
        for (int i = h; i >= 1; i--) {
            printLevel1(root, i);
        }
    }

    public static void printLevel1(BinaryTreeNode root, int level) {
        if (level == 1)
            System.out.print(root.data + " ");

        else if (level > 1) {
            printLevel1(root.left, level - 1);
            printLevel1(root.right, level - 1);
        }
    }

    //----------------------------------------------------------------------------------------

    public static void levelOrderReverseQueue(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode temp = queue.poll();
            if (temp.right != null)
                queue.add(temp.right);
            if (temp.left != null)
                queue.add(temp.left);
            stack.push(temp);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + " ");
        }
    }

    public static int minimumDepth(BinaryTreeNode root) {
        if (root == null)
            return 0;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int count = 1;
        while (!queue.isEmpty()) {
            BinaryTreeNode temp = queue.poll();
            if (temp != null) {
                if (temp.left == null && temp.right == null)
                    return count;
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            } else if (!queue.isEmpty()) {
                count++;
                queue.add(null);
            }
        }
        return count;
    }

    public static void deepestNode(BinaryTreeNode root,int level){
        if(root==null)
            return;
        if(level==1)
        result=root.data;
        else if(level>1){
            deepestNode(root.left,level-1);
            deepestNode(root.right,level-1);
        }
    }

    public static BinaryTreeNode deepestNodeQueue(BinaryTreeNode root){
        if(root==null)
            return null;
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        queue.add(root);
        BinaryTreeNode temp=null;
        while(!queue.isEmpty()){
            temp=queue.poll();
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
        }
        return temp;
    }

    public static int sumBinaryTree(BinaryTreeNode root){
        if(root==null)
            return 0;
        else
            return (root.data+sumBinaryTree(root.left)+sumBinaryTree(root.right));
    }

     public static void sumBinaryTreeQueue(BinaryTreeNode root){
        if(root==null)
            return;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        int sum=0;
        queue.add(root);
        while(!queue.isEmpty()){
           BinaryTreeNode  temp=queue.poll();
           sum+=temp.data;
             if(temp.left!=null)
                 queue.add(temp.left);
             if(temp.right != null)
                 queue.add(temp.right);
         }
         System.out.println("Sum of binary Tree Using Queue: "+sum);
     }

     public static boolean printAncestors(BinaryTreeNode root, int temp) {
        if(root==null)
            return false;
        if(root.data==temp)
            return true;
        if(printAncestors(root.left, temp) || printAncestors(root.right,temp)){
            System.out.print(root.data+" ");
            return true;
        }
        return false;
     }

    public static BinaryTreeNode leastCommonAncestor(BinaryTreeNode root,BinaryTreeNode n1,BinaryTreeNode n2){
        if(root==null || root==n1 || root==n2)
            return root;
        BinaryTreeNode left=leastCommonAncestor(root.left,n1,n2);
        BinaryTreeNode right=leastCommonAncestor(root.right,n1,n2);
        if(left==null)
            return right;
        else if(right==null)
            return left;
        else
            return root;
    }
}
