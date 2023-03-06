package dailyMarChallenge;

public class qs_28 {

    public static void main(String[] args) {

    }

    // Solving 74/79 testcases need improvement on the part like
    // haystack: missipppi needle: pi
    public static int strStr(String haystack, String needle) {
        int len = needle.length();
        int n = haystack.length();
        if(n <= 1){
            return 0;
        }
        if(haystack.equals(needle)){
            return 0;
        }

        for(int i = 0; i < n; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if((i+len <n )&&  haystack.substring(i, i+len).equals(needle) ){
                    return i;
                }
                if(len ==1){
                    return i;
                }
            }

        }
        return -1;
    }

    // for a better solution:
    // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/solutions/3250360/think-as-a-sliding-window-code-like-a-pro-beats-100/
    public int strStr2(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        int nIndex = 0;
        for(int i=0; i<hLen; i++){
            // as long as the characters are equal, increment needleIndex
            if(haystack.charAt(i)==needle.charAt(nIndex)){
                nIndex++;
            }
            else{
                // start from the next index of previous start index
                i=i-nIndex;
                // needle should start from index 0
                nIndex=0;
            }
            // check if needleIndex reached needle length
            if(nIndex==nLen){
                // return the first index
                return i-nLen+1;
            }
        }
        return -1;
    }
}
