package dailyFebChallenge;
import java.util.*;
public class qs_2306 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(replaceFirst("cofee", "donuts")));
        String[] ideas = {"coffee","donuts","time","toffee"};
        System.out.println(distinctNames(ideas));
    }

    // 78/89 Test cases passed (Hard Question)
    public static long distinctNames(String[] ideas) {
        HashSet<String> base = new HashSet<>();
        HashSet<String> ans = new HashSet<>();
        int n = ideas.length;
        long count = 0;
        String name = "";
        for(int i = 0; i< n;i++){
            base.add(ideas[i]);
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i != j){
                    String[] twist = replaceFirst(ideas[i], ideas[j]);
                    name = twist[0] + " " + twist[1];
                    if(!base.contains(twist[0]) && !base.contains(twist[1])){
                        if(!ans.contains(name)){
                            count++;
                            ans.add(name);
                        }
                    }
                }
            }
        }
        return count;
    }

    private static String[] replaceFirst(String first, String last){
        char ch1 = first.charAt(0), ch2 = last.charAt(0);
        String s1 = ch2 + first.substring(1);
        String s2 = ch1 + last.substring(1);
        String[] ans = {s1, s2};
        return ans;
    }
}
