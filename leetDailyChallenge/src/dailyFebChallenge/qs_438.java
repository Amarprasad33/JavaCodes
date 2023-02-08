package dailyFebChallenge;
import java.util.*;
public class qs_438 {
    public static void main(String[] args) {
        String s = "abacbabc";
        String p = "abc";

        System.out.println(findAnagrams(s, p));

    }

    // This passes the basic 18 test cases out of 65 will improve the solution in future
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int pre = 0, k= 0;
        for (int i = 0; i <p.length() ; i++) {
            set.add(p.charAt(i));
            pre += (int)p.charAt(i) ;
        }
        int count = 0, cur = 0;
        for (int j = 0; j <= arr.length-p.length(); j++) {
            for (int i = j; i < arr.length; i++) {
                if(set.contains(arr[i])){
                    ++count; cur += (int)s.charAt(i);
                    if (count == p.length() && (cur == pre)) {
                        if (!ans.contains((i - (p.length() -1))))
                            ans.add(i - (p.length() -1));
                        count = 0; cur = 0;
                    }
                    if (count == p.length() && (cur != pre)) {
                        count = 0; cur = 0;
                    }
                } else {
                    if (!set.contains(arr[i]) && count < p.length()){
                        count = 0; cur = 0;
                    }
                }
            }
            cur = 0;
        }
        Collections.sort(ans);
        return ans;
    }
}
