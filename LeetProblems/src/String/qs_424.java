package String;

public class qs_424 {
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s, 1));
    }

    // Not working properly
    public static int characterReplacement(String s, int k) {
        int count = 0, max = 0, j;
        char comp = ' ';

        for(int i = 0; i < s.length(); i++){
            j = 0;
            comp = s.charAt(i);
            count = 0;
            while(j < s.length() && k >= 0){
                if(s.charAt(j) == comp  ){
                    count++;
                }else if(k > 0 && s.charAt(j) != comp){
                    k--;
                    count++;
                }
                else if(k <= 0 && s.charAt(j) != comp){
                    break;
                }
                j++;
            }
            max = Math.max(count, max);
            count = 0;
        }
        return max;
    }
}
