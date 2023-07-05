package conProblems;

public class maxSubArraySumSizeK {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 2, 4, 1, 9, 1, 8, 2 };
        System.out.println(maxSubarraySum(arr, 3));
    }

    public static int maxSubarraySum(int[] arr, int k){
        int sum = 0, i = 0, j = 0, max = 0;
        int size = arr.length;

        while (j < size){
            sum = sum + arr[j];
            if(j - i + 1 < k)
                j++;
            else if (j-i+1 == k){
                max = Math.max(sum, max);
                sum = sum - arr[i];
                j++;
                i++;
            }
        }
        return max;
    }
}
