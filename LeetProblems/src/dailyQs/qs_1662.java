package dailyQs;

import javax.management.StringValueExp;

public class qs_1662 {

    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1,word2));




    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";

        for(int i =0; i < word1.length; i++){
            s1 += word1[i];
        }

        for(int i =0; i < word2.length; i++){
            s2 += word2[i];
        }

        return s1.equals(s2);

    }
}
