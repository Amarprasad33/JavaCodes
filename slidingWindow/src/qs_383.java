import java.util.HashMap;
public class qs_383 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "aa";
        String t = "ab";
        System.out.println(canConstruct(s, t));

    }

    // Brute force approach
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

    // Lil bit optimized approach
    public boolean canConstruct2(String ransomNote, String magazine) {
        int mag_l = magazine.length();
        int countCh[] = new int[26];

        for(int i = 0; i < mag_l; i++){
            countCh[magazine.charAt(i)-97] += 1;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            if(countCh[ (int) (ransomNote.charAt(i)) - 97 ] == 0){
                return false;
            }
            countCh[ (int) (ransomNote.charAt(i)) - 97 ]--;
        }
        return true;
    }
}