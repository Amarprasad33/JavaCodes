package dailyMarChallenge;
import java.util.Arrays;
import java.util.HashSet;
public class qs_443 {
    public static void main(String[] args) {
        char[] arr = {'a','a','b','b','c','c','c'};
        System.out.println(compress1(arr));
        System.out.println(Arrays.toString(arr));
    }

    // All the default cases solved but the solution acts weirdly in leetcode
    public static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        String ans = "";
        int curCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (!set.contains(chars[i]) && curCount == 0) {
                ans += chars[i];
                set.add(chars[i]);
            }
            if (set.contains(chars[i])) {
                curCount++;
            } else {
                if (curCount != 0) ans += curCount;
                curCount = 0;
                set.add(chars[i]);
                ans += chars[i];
                curCount += 1;

            }
        }
        if (curCount != 0) ans += curCount;
        return ans.length();
    }

        // correct solution
        public static int compress1(char[] chars) {
            int n = chars.length;
            if (n == 1) {
                return 1;
            }

            int i = 0, j = 0;
            while (i < n) {
                int count = 1;
                while (i < n - 1 && chars[i] == chars[i + 1]) {
                    count++;
                    i++;
                }

                chars[j++] = chars[i++];
                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (int k = 0; k < countStr.length(); k++) {
                        chars[j++] = countStr.charAt(k);
                    }
                }
            }

            return j;
        }
}
