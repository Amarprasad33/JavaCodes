package easyQs;

public class qs_409 {

    public static void main(String[] args) {
        String s = "abccccdd";
        int ans = longestPalindrome(s);
        System.out.println(ans);
    }

    // Own solution but satisfies the default cases
    public static int longestPalindrome(String s) {
        if(s.length() <= 1) return 1;
        int[] arr = new int[26];
        int palin = 0;
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i< arr.length; i++){
            if(arr[i] %2 == 0){
                palin += arr[i];
            }
        }
        if(palin%2 == 0) {
            palin = palin;
        }else palin += 1;
        return palin;
    }

    //correct solution
    public int longestPalindrome2(String s) {
        int[] count = new int[128];
        for(char c : s.toCharArray()){
            count[c]++;
        }
        int result = 0;
        for(Integer char_count : count){
            result += char_count/2 * 2;
            if(result % 2 == 0 && char_count%2 == 1){
                result += 1;
            }
        }
        return result;
    }

}
