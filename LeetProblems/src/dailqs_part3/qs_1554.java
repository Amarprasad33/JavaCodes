package dailqs_part3;

public class qs_1554 {

    public static void main(String[] args) {
        String str = "abBAcC";
        System.out.println(makeGood1(str));
    }

    public static String makeGood(String s) {


        for (int i = 0; i < s.length() - 1; i++) {
            //Now we check if the either the present or the next character is capital
            if (Math.abs(s.charAt(i) - s.charAt(i+1)) == 32) {
                //recursive call for the rest of the string
                return makeGood(s.substring(0, i) + s.substring(i+2));
            }
        }
        return s;
    }

    public static String makeGood1(String s) {
        StringBuilder sb = new StringBuilder();
        int pt2 = 0;
        for(int i = 0; i<s.length(); i++){
            if(pt2>0 && Math.abs(sb.charAt(pt2-1) - s.charAt(i)) == 32){
                pt2--;
                sb.deleteCharAt(pt2);
            }
            else{
                sb.append(s.charAt(i));
                pt2++;
            }
        }
        return sb.toString();
    }
}
