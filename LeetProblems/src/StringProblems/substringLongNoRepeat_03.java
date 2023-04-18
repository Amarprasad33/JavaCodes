package StringProblems;
import java.util.*;
public class substringLongNoRepeat_03 {
    public static void main(String[] args) {
        String s = "abcabcdbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    //  https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, j=0, maxCount = 0;

        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxCount = Math.max(set.size(), maxCount);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxCount;
    }

}
