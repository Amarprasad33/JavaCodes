package dailyMarChallenge;

public class qs_1539 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(findKthPositive(arr, 1));
    }

    public static int findKthPositive(int[] arr, int k) {
        int i = 0, count = 0, num = 1;
        int temp = 0;

        while(i < arr.length){
            if(num == arr[i]){
                i++;
                num++;
            } else {
                temp = num;
                num++;
                count++;
            }

            if(count == k){
                return temp;
            }
        }

        if(count < k){
            while(count < k){
                temp = num;
                count++;
                num++;
            }
        }
        return temp;
    }
}
