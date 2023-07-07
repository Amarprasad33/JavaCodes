package conProblems;

import java.util.*;

public class countOccurencesAnagrams {
    public static void main(String[] args) {
        String st = "ofrlabtfrobakrof";
        String ptr = "orf";
        System.out.println(countAnagrams(st,ptr));
    }

    public static int countAnagrams(String str, String ptr){
        int i = 0, j = 0, ans = 0;
        int size = str.length();
        int k = ptr.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int c = 0; c < ptr.length(); c++){
            if(!map.containsKey(ptr.charAt(c)))
                map.put(ptr.charAt(c), 1);
            else
                map.put(ptr.charAt(c), (map.get(ptr.charAt(c)) + 1));
        }
        int count = map.size();
        System.out.println(map);
//        System.out.println(count);


        while (j < size){

            if(map.containsKey(str.charAt(j)))
                map.put(str.charAt(j), map.get(str.charAt(j))-1);

            if(map.containsKey(str.charAt(j)) && map.get(str.charAt(j)) == 0)
                count--;

            if(j - i + 1 < k)
                j++;
            else if (j-i+1 == k){
                if(count == 0)
                    ans++;
                if(map.containsKey(str.charAt(i)))
                    map.put(str.charAt(i),  map.get(str.charAt(i))+1);
                if (map.containsKey(str.charAt(i)) && map.get(str.charAt(i)) == 1)
                    count++;
                j++;
                i++;
            }
        }
        return ans;
    }
}
