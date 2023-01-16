package com.Set1;

public class tr {
    public static void main(String[] args) {
        int n= 12;
        System.out.println(pivotInteger(n));
    }
    public static int pivotInteger(int n) {
        if(n <= 1){
            return n;
        }
        int s = 1;
        int e = n;
        int m = s + (e - s)/2;
        int flag = 0;
        while(m != e && m != e){
            if(upto(s, m, e) == 0){
                return m;
            }else if(upto(s, m, e) == -1){
                if(flag == 1)
                    break;
                m = m-1;
                flag = -1;
            }else if(upto(s, m, e) == 1){
                if(flag == -1)
                    break;
                m = m+1;
                flag = 1;
            }
        }
        return -1;
    }

    public static int upto(int s, int m, int e){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i<= m; i++){
            sum1 += i;
        }
        for(int i = m; i<= e; i++){
            sum2 += i;
        }

        if(sum1 > sum2){
            return -1;
        }
        if(sum1 < sum2){
            return 1;
        }
        if(sum1 == sum2){
            return 0;
        }

        return -7;
    }
}
