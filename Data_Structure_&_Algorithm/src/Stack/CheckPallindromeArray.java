package Stack;

import java.util.Stack;

public class CheckPallindromeArray {
    public static void main(String[] args) {
        String str="aXa";
        System.out.println("String is:"+str);
      //  System.out.println("String is pallindrome : "+CheckPallindromeArray.checkPallindrome(str));
        System.out.println("String is pallindrome : "+CheckPallindromeArray.checkPallindromeStack(str));

    }

    //----this is for check pallindrome using array

//    public static boolean checkPallindrome(String str){
//        int i=0;
//        int j=str.length()-1;
//
//        while(i<j){
//            if(str.charAt(i)!=str.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
//        return true;
//    }

    //--- this is for check pallindrome using stack

//    public static boolean checkPallindromeStack(String str) {
//        Stack st=new Stack();
//        int i=0;
//        char ch[]=str.toCharArray();
//        while(ch[i]!='X'){
//            st.push(ch[i]);
//            i++;
//        }
//        i++;
//        while(i<str.length()){
//            if(st.isEmpty())
//                  return false;
//            if(ch[i]!=((Character)st.pop()).charValue())
//                return false;
//            i++;
//        }
//        return true;
//    }

    public static boolean checkPallindromeStack(String str) {
        Stack<Character> st=new Stack();
        int i=0;

        while(str.charAt(i)!='X'){
            st.push(str.charAt(i));
            i++;
        }
        i++;

        while(i<str.length()){
            if(st.isEmpty())
                return false;
            if(str.charAt(i)!=st.pop())
                return false;
            i++;
        }
        return true;
    }
}
