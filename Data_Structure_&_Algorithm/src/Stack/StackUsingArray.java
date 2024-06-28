package Stack;

import java.util.Stack;

public class StackUsingArray {

    static int size;
    static int arr[];
    static int top;
//    static int count=0;
    StackUsingArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    public static void main(String[] args) {
        StackUsingArray st=new StackUsingArray(5);
        st.push(10);
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.push(50);
//        st.push(60);
        System.out.println("Top element of stack:"+st.peek());
        st.pop();
        System.out.println("Top element of stack:"+st.peek());

    }

    public static void push(int data){
        if(top==arr.length-1){
            System.out.println("Stack is overflow");
            return;
        }
        else{
            arr[++top]=data;
            System.out.println(data);
        }
    }

    public static int peek(){
      if(top<0) {
          System.out.println("Stack is empty");
          return -1;
      }
      else
          return arr[top];
    }

    public static int pop(){
        if(top<0) {
            System.out.println("Stack is underflow");
            return -1;
        }
        else {
            return arr[top--];
        }
    }
}
