package Tree.BT;

import java.util.LinkedList;
import java.util.Queue;

public class TestBT {
    int data;
    TestBT left, right;
    static TestBT root;

    TestBT(int data){
        this.data =  data;
        this. left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        root = new TestBT(10);
        root.left = new TestBT(20);
        root.right = new TestBT(30);
        root.left.left = new TestBT(40);
        root.left.right = new TestBT(50);
        root.right.left = new TestBT(60);
        root.right.right = new TestBT(70);
        System.out.println(root.data+" "+ root.left.data+" "+root.right.data+" "+root.left.left.data+" "+root.left.right.data+" "+root.right.left.data+" "+root.right.right.data);
        System.out.println("PreOrder of BT");
        preOrder(root);
        System.out.println();
        System.out.println("InOrder of BT");
        inOrder(root);
        System.out.println();
        System.out.println("postOrder of BT");
        postOrder(root);
        System.out.println();
        System.out.println("Max through recursion "+maxVal(root));

        System.out.println();
        System.out.println("Max Value through Queue "+queMax(root));

        int val = 20;
        if(searchEle(root, val))
            System.out.println("Given element is found");
        else
            System.out.println("Given element is not found");

        System.out.println();
        int val1 = 60;
        if(queueSearchEle(root, val1))
            System.out.println("Given element is found");
        else
            System.out.println("Given element is not found");

    }

    public static void preOrder(TestBT root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TestBT root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public static void postOrder(TestBT root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");

    }

    public static int maxVal(TestBT root){
        if(root == null)
            return 0 ;
        int temp =root.data;
        int left = maxVal(root.left);
        int right = maxVal(root.right);
        if(left > temp)
            temp =left;
        if(right > temp)
            temp=right;
        return temp;
    }

    public static int queMax(TestBT root){
        Queue<TestBT> q = new LinkedList<>();
        q.add(root);
        int max = 0;
        while(!q.isEmpty()){
            if(root == null)
                return 0;
            TestBT temp = q.poll();
            if(temp.data > max)
                max = temp.data;
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
        }
        return max;
    }

    public static boolean searchEle(TestBT root, int data){
       if(root == null)
           return false;
       if(root.data == data)
           return true;
       boolean left = searchEle(root.left , data);
       boolean right = searchEle(root.right , data);
       return left || right;
    }

    public static boolean queueSearchEle(TestBT root, int data){
        if(root == null)
            return false;
        Queue<TestBT> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TestBT temp =q.poll();
            if(temp.data == data)
                return true;
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);

        }
        return false;

    }
}
