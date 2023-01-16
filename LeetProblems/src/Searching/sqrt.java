package Searching;

public class sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        int ans = 0;
        int s = 1;
        int e = x;
        while(s <= e){
            int mid = s + (e-s)/2;
          //  int sq = mid * mid;
            if(mid > x/mid){
                e = mid - 1;
            }else if(mid < x/mid){
                s = mid + 1;
            } else{
                ans = mid;
                break;
            }
        }
        if((ans*ans) == x){
            return ans;
        } else if(s*s > x){
            return s-1;
        }

        return s;
    }
}
