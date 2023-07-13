package conProblems_variableWin;

import java.util.*;

public class longestSubstringWithKUniqueChar {
    public static void main(String[] args) {
        String str = "aabacbebgebe";
//      System.out.println(largest_Substring_of_Unique_Characters(str, 3));
        System.out.println(largestSubstringUniqueChars(str, 3));
    }


    // This function returns the maximum size of the substring with k unique characters
    public static int largest_Substring_of_Unique_Characters(String s, int k){
        int sum = 0, i = 0, j = 0, max = Integer.MIN_VALUE;
        int size = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        while (j < size){
            // Initial Calculation
            if(!map.containsKey(s.charAt(j)))
                map.put(s.charAt(j), 1);
            else
                map.put(s.charAt(j), (map.get(s.charAt(j)))+1);
            // Condition check
            if(map.size() < k)
                j++;
            else if (map.size() == k){
                max = Math.max(max, j-i+1);

                j++;
            }else if (map.size() > k){
                while(map.size() > k){
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


    ///
    public static int largestSubstringUniqueChars(String s, int k) {
        Set<Character> set = new HashSet<>();
        int i = 0, j=0, maxCount = 0;
        while(j < s.length()){
            if(!set.contains(s.charAt(j)) && set.size() < k){
                set.add(s.charAt(j));
                j++;
            } else if (set.size() == k){
                set.add(s.charAt(j));
                maxCount = Math.max(j-i+1, maxCount);
                j++;
            } else {
                while (set.size() > k){
                    set.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }

        return maxCount;
    }

}
