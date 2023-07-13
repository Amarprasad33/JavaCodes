package conProblems_variableWin;

import java.util.*;

public class longest_substring_without_repeating_chars {
    public static void main(String[] args) {
        String s = "abcdabcbb";
        System.out.println(largest_Substring_without_repeating_Characters(s));
    }

    public static int largest_Substring_without_repeating_Characters(String s){
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        int size = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < size){
            // Initial Calculation
            if(!map.containsKey(s.charAt(j)))
                map.put(s.charAt(j), 1);
            else
                map.put(s.charAt(j), (map.get(s.charAt(j)))+1);
            // Condition check
            if(map.size() > j-i+1)                        // This condN will rarely hit  -- Can be omitted
                j++;
            else if (map.size() == j-i+1){
                max = Math.max(max, j-i+1);

                j++;
            }else if (map.size() < j-i+1){
                while(map.size() < j-i+1){
                    map.put(s.charAt(i), (map.get(s.charAt(i)))-1);
                    if(map.get(s.charAt(i)) == 0)
                        map.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }


    // Another small Solution to the same question
    // Longest Substring without repeating characters [ number of unique characters not given ]
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
