package conProblems_variableWin;

import java.util.*;

public class longestSubstringWithKUniqueChar {
    public static void main(String[] args) {
        String str = "aabacbebebe";
        System.out.println(largest_Subarray_of_Unique_Characters(str, 3));
    }

    // This function returns the maximum size of the substring with k unique characters
    public static int largest_Subarray_of_Unique_Characters(String s, int k){
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

}
