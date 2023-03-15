package easyQs;

public class qs_125 {
    public static void main(String[] args) {
        String s = "abba";
        String op = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                op += Character.toLowerCase(s.charAt(i));
            }else if(Character.isLowerCase(s.charAt(i))){
                op += s.charAt(i);
            } else{
                continue;
            }
        }
        System.out.println(op);
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String op = ""; boolean ans = true;
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                op += Character.toLowerCase(s.charAt(i));
            }else if(Character.isLowerCase(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                op += s.charAt(i);
            } else{
                continue;
            }
        }
        if(op.length() == 0) return true;
        int start = 0;
        int end = op.length()-1;
        while(start <= end){
            char curFirst = op.charAt(start);
            char curLast = op.charAt(end);
            if(curFirst != curLast){
                return  false;
            }
            start++;
            end--;
        }
        return  ans;
    }

    // A little bit optimised approach
    public static boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
