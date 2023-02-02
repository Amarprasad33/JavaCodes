package dailyQs;

import java.util.*;

public class qs_953 {
    public static void main(String[] args) {
        String[] words = {"apple","apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(isAlienSortedexp(words, order));
    }

    public static boolean isAlienSortedexp(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean ans = false;
        int count = 0;
        for (int i = 0; i < order.length() ; i++) {
            map.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length-1 ; i++) {
            if (map.get(words[i].charAt(0)) > map.get(words[i+1].charAt(0))) {
                return false;
            } else if(map.get(words[i].charAt(0)) == map.get(words[i+1].charAt(0))){
                while(true){
                    if (count < words[i].length() && count < words[i+1].length()){
                        if (words[i].charAt(count) == words[i+1].charAt(count)){
                            count++;
                        }else {
                            break;
                        }
                    }else break;

                }
                if (count == words[i].length()) count -=1;
                if(count == words[i+1].length() && count != words[i].length()){
                    return false;
                }
                if(count == words[i+1].length() && count == words[i].length()){
                    ans = true;
                }
                if(count == words[i].length() && count != words[i+1].length()){
                    return true;
                }
                if (map.get(words[i].charAt(count)) > map.get(words[i+1].charAt(count))){
                    return false;
                }
                count = 0;
            }
        }
        return ans;
    }
}
