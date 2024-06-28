package Tree.BST;

public class BinarySearchTree {
    int data;
    static BinarySearchTree root;
    BinarySearchTree left, right;

    BinarySearchTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        root = insertElement(root, 10);
        root = insertElement(root, 16);
        root = insertElement(root, 9);
        root = insertElement(root, 6);
        root = insertElement(root, 4);
        root = insertElement(root, 7);
        root = insertElement(root, 13);
        System.out.println("Inserted elements are:");
        printList(root);
        System.out.println();
        root = insertElement(root, 3);
        printList(root);
        System.out.println();
        if(searchElement(root,17)!=null)
            System.out.println("Given element is found");
        else
            System.out.println("Given element is not found");
        System.out.println("Minimum element of BST "+minElement(root));
        System.out.println("Maximum element of BST "+maxElement(root));
    }

    public static BinarySearchTree insertElement(BinarySearchTree root, int data) {
        if (root == null) {
            root = new BinarySearchTree(data);
            return root;
        }
        if (data < root.data)
            root.left = insertElement(root.left, data);
        else
            root.right = insertElement(root.right, data);
        return root;
    }

    public static void printList(BinarySearchTree root) {
        if (root != null) {
            printList(root.left);
            System.out.print(root.data + " ");
            printList(root.right);

        }
    }

    public static BinarySearchTree searchElement(BinarySearchTree root,int data){
        if(root==null || root.data==data)
            return root;
        if(data<root.data)
            return searchElement(root.left,data);
        else
            return searchElement(root.right,data);
    }

    public static int minElement(BinarySearchTree root){
        if(root==null)
            return 0;
        else if(root.left==null)
            return root.data;
        return minElement(root.left);
    }

    public static int maxElement(BinarySearchTree root){
        if(root==null)
            return 0;
        else if(root.right==null)
            return root.data;
        return maxElement(root.right);
    }
}
