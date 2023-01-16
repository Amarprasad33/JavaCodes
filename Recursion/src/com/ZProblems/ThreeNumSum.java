package com.ZProblems;

import java.util.ArrayList;

public class ThreeNumSum {
    public static void main(String[] args) {             // Still Incomplete
     //permutationsCount("", "16340", 7);
         int ch = 'z';
        System.out.println(ch);
    }



    static ArrayList<String> subsetRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetRet(p + ch, up.substring(1));
        ArrayList<String> right = subsetRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }


//    static void permutationsCount(String  p, String up, int target){
//        if (up.isEmpty()){
//            if (p.length() == 3){
//                if(strSum(p) == target){
//                    System.out.println(p);
//                }
//                return ;
//            }
//        }
//        int count = 0;
//        char ch = up.charAt(0);
//        // Local to this call
//
//        for (int i = 0; i <= p.length() ; i++) {
//            String f = p.substring(0,i);
//            String s = p.substring(i, p.length());
//          permutationsCount(f + ch + s, up.substring(1), target);
//        }
//       // return count;
//    }

    private static int strSum(String p) {
        int val =Integer.valueOf(p);
        int sum = 0;
        while (val != 0){
            sum += val %10;
            val /= 10;
        }
        return sum;
    }
//       static int missing(int[] arr){
//        int[] count = new int[arr.length + 2];
//       for (int i = 0; i < count.length; i++) {
//           //count[]
//       }
//   }

}
