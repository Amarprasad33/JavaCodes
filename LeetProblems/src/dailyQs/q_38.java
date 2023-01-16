package dailyQs;

public class q_38 {

    public static void main(String[] args) {
        int n =4;
        System.out.println(countAndSay(n));
    }

    // Still incomplete.....
    public static String countAndSay(int n) {
        if(n == 1){
            return new String("1");
        }

        String s = "";
        for(int i = 1; i<= n; i++){
            s = helper(i, s);
        }
        return s;
    }


    public static String helper(int n, String str){
        if(n == 1 && str == ""){
            return new String("1");
        }

        int count = 0;
        char[] arr = str.toCharArray();
        String ans = "";
        if (arr.length == 2 && arr[0] == arr[arr.length-1]){
            count += 2;
            ans += count;
            ans += arr[0];
            count = 0;
            return ans;
        }
        for(int i = 0; i< arr.length;i++){
            int k = arr[i] - '0';
            if(i != 0 && arr[i] == arr[i-1]){
                count += 2;
                ans += count;
                ans += arr[i];
                count = 0;
            } else {
                count += 1;
                ans += count;
                ans += arr[i];
                count = 0;
            }
        }
        return ans;
    }
}
