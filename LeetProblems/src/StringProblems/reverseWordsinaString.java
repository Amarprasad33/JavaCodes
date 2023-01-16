package StringProblems;
import java.util.*;
public class reverseWordsinaString {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }



    public static String reverseWords(String s) {
        String[] arrStr = s.split(" ");
        StringBuilder sb  = new StringBuilder();

        String space = "";
        sb.append(space);
        for(int i = 0; i< arrStr.length; i++){
            sb.append(space);
            sb.append(rev(arrStr[i]));
            space = " ";
        }
        String ans  = sb.toString();

        return ans;
    }

    public static String rev(String str){
        char[] curr = str.toCharArray();
        for(int j = 0; j < curr.length/2; j++){
            char temp = curr[j];
            curr[j] = curr[curr.length-1 - j];
            curr[curr.length-1 - j] = temp;
        }
        return new String(curr);
    }
}
