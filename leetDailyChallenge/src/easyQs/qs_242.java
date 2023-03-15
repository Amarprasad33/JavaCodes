package easyQs;
import  java.util.*;
public class qs_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }


    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int curVal = map.get(s.charAt(i));
                curVal += 1;
                map.put(s.charAt(i), curVal);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(t.charAt(i))){
                int curVal = map.get(s.charAt(i));
                curVal -= 1;
                map.put(t.charAt(i), curVal);
            }else return false;
        }

        return true;
    }
}
