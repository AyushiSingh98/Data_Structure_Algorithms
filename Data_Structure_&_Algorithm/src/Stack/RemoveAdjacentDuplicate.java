package Stack;

import java.util.Stack;

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {
        String str="adcbcccbcda";
        System.out.println("String :"+str);
        System.out.println("String after removing adjacent elements :"+removeAdjacentDuplicate(str));
    }

    public static String removeAdjacentDuplicate(String str){
        Stack<Character> stack=new Stack();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!stack.isEmpty() && stack.peek()==str.charAt(i))
                stack.pop();
            else
                stack.add(str.charAt(i));
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
