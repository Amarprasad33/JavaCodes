package String;
import java.util.*;
public class parenthesis {

    public static void main(String[] args) {
        String str = ")(){}";

        System.out.println(isValid(str));

    }

    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();

        int n = arr.length;
        Stack<Character> stk = new Stack();

        for(int i = 0; i< n ; i++){
//            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '[' ){
//
//            }
            stk.push(arr[i]);

            switch(arr[i]){
                case ')':
                    if(!stk.isEmpty() && stk.pop() != '('  ) {
                        return false;
                    }
                    break;

                case ']':
                    if(  !stk.isEmpty() && stk.pop() != '[') {
                        return false;
                    }
                    break;

                case '}':
                    if(!stk.isEmpty()   && stk.pop() != '{' ) {
                        return false;
                    }
                    break;
            }
        }

        return stk.isEmpty();
    }
}
