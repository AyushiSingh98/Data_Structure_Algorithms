// we have to work on it because it is not showing result it gives answer in address form

package String;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1="abc";
        String word2="pqr";
        System.out.println(MergeStringsAlternately.mergeStringsAlternately(word1, word2));
    }

    public static String mergeStringsAlternately(String word1, String word2) {
        int m= word1.length();
        int n= word2.length();
        SringBuilder result=new SringBuilder();
        for(int i=0;i<Math.max(m,n);i++){
            if(i<m) {
                result.append(word1.charAt(i));
            }
            if(i<n){
                result.append(word2.charAt(i));}

        }
        return result.toString();
    }
}
