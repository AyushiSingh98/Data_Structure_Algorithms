package Stack;

import java.util.Stack;

public class GetMinimumElement {
    static Stack<Integer> mainStack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {
        GetMinimumElement.push(2);
        GetMinimumElement.push(6);
        GetMinimumElement.push(3);
        GetMinimumElement.push(1);
        GetMinimumElement.push(5);
        //GetMinimumElement.pop();
       // GetMinimumElement.pop();
       // GetMinimumElement.pop();


        for (int x : mainStack)
            System.out.println(x);
        System.out.println();
        for (int y : minStack)
            System.out.println(y);
        System.out.println("Minimum element is:" + getMinimumElement());
    }
//------This takes space complexity O(n) so we need to improve it----

//    public static void push(int data){
//        int min=data;
//        if(!mainStack.isEmpty() && min>minStack.peek())
//            min=minStack.peek();
//        mainStack.push(data);
//        minStack.push(min);
//    }
//
//    public static int pop(){
//        if(mainStack.isEmpty())
//            return 0;
//        minStack.pop();
//        return mainStack.pop();
//    }
    //   ---This reduces space complexity O(1)

    public static void push(int data) {
        mainStack.push(data);
        if (minStack.isEmpty())
            minStack.push(data);
        else {
            if (minStack.peek() >= data)
                minStack.push(data);
        }
    }

    public static int pop() {
        if (mainStack.isEmpty())
            return 0;
        if (mainStack.peek() == minStack.peek())
            minStack.pop();
        return mainStack.pop();
    }
//--- common for both cases----
    public static int getMinimumElement() {
        return minStack.peek();
    }

}
