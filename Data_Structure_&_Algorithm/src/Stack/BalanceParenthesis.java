package Stack;

import java.util.Stack;

public class BalanceParenthesis {

    public static void main(String[] args) {
     String str="[()]";
        System.out.println("String is:"+str);
     if(balanceParenthesis(str))
         System.out.println("Balanced");
     else
         System.out.println("Unbalanced");
    }

    public static boolean balanceParenthesis(String str){
        Stack<Character> st=new Stack<>();
        if(str==null || str.length()==0)
            return true;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                if(st.peek()=='(')
                    st.pop();
                else
                    return false;
            }
            else if(str.charAt(i)==']'){
                if(st.peek()=='[')
                    st.pop();
                else
                    return false;
            }

            else if(str.charAt(i)=='}'){
                if(st.peek()=='{')
                    st.pop();
                else
                    return false;
            }
            else
                st.push(str.charAt(i));

        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }

}
