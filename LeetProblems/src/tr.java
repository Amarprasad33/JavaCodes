import java.util.Arrays;
import java.util.*;
public class tr {
    public static void main(String[] args) {

//        System.out.println(a);
//        String q = "RR.L";
//        System.out.println(pushDominoes(q));
//        String str = "a good   example";
//        System.out.println(reverseWords(str));

        String s1 = "abcd";
        String s2 = "pq";

        System.out.println(s1);
        System.out.println(mergeAlternately(s1, s2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while(i < word1.length() && j < word2.length()){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        while(i < word1.length())
            sb.append(word1.charAt(i++));
        while(j < word2.length())
            sb.append(word2.charAt(j++));

        return sb.toString();
    }


    // Wrong solution
    public static String pushDominoes(String dominoes) {
        char[] arr = dominoes.toCharArray();
        String ans = "";
        for(int i = 0; i < arr.length; i++){
            if(i != 0 && i != arr.length -1){
                if(arr[i] == '.' && ((arr[i-1] == 'L' && arr[i+1] == 'R') || arr[i-1] == 'R' && arr[i+1] == 'L')){
                    ans += '.';
                }
            }
            if(i< arr.length - 1 && (arr[i+1] == 'L' && arr[i] == '.')){
                ans += 'L';
            } else if (i > 0 && (arr[i-1] == 'R' && arr[i] == '.')){
                ans += 'R';
            }

        }
        return ans;
    }

    //Correct solution

    public static String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder("");
        StringBuilder temp = new StringBuilder("");

        for( int i=n-1; i>=0; i-- ) {
            char ch = s.charAt(i);

            if( ch!=' ' ){
                temp.append(ch);
            }

            if( (ch==' ' || i==0 ) && temp.length()>0 ) {
                if( ans.length()>0 ) ans.append(" ");
                temp.reverse();
                ans.append(temp);
                temp.setLength(0);
            }
        }

        return ans.toString();
    }
}
