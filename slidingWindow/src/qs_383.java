import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "aa";
        String t = "ab";
        System.out.println(canConstruct(s, t));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() == 0) return true;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            if(!map.containsKey(magazine.charAt(i)))
                map.put(magazine.charAt(i), 1);
            else
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            if(!map.containsKey(ransomNote.charAt(i)))
                return false;
            if(map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) == 0){
                return false;
            } else if(map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) >= 0){
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
            }
        }
        return true;
    }
}