package leetcodePractice;

public class longestRepeatingCharReplacement {

    public int characterReplacement(String s, int k) {
        int N = s.length();
        int[] char_counts = new int[26];

        int win_start = 0;
        int max_length = 0;
        int max_count = 0;

        for (int win_end = 0; win_end < N; win_end++){
            char_counts[s.charAt(win_end) - 'A']++;
            int curr_char_count = char_counts[s.charAt(win_end) - 'A'];
            max_count = Math.max(max_count, curr_char_count);

            while (win_end - win_start  - max_count + 1 > k){
                char_counts[s.charAt(win_start) - 'A']--;
                win_start++;
            }

            max_length = Math.max(max_length, win_end-win_start+1);
        }
        return max_length;
    }
}
