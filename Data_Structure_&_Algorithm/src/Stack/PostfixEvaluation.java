package Stack;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String exp="123*+5-";
        System.out.println("Expression is:"+exp);
        System.out.println("Postfix Evaluation ="+postfixEvaluation(exp));
    }

    public static int postfixEvaluation(String exp){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<exp.length();i++) {
            char c = exp.charAt(i);
            if(Character.isDigit(c))
                stack.push(c-'0');
            else{
                int val1=stack.pop();
                int val2=stack.pop();
                switch(c){
                    case '+':
                        stack.push(val2+val1);
                        break;
                    case '-':
                        stack.push(val2-val1);
                        break;
                    case '*':
                        stack.push(val2*val1);
                        break;
                    case '/':
                        stack.push(val2/val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
