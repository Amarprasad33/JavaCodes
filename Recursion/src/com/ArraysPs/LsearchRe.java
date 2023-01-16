package com.ArraysPs;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LsearchRe {
    public static void main(String[] args) {

      int[] arr = {2, 3, 1, 4, 5};
      int[] ar = {2, 3, 1, 1, 4, 5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexLast(arr, 4, arr.length-1));
        findAllIndex(ar, 1, 0);
        System.out.println(list);


//        ArrayList<Integer> ans = findMulIndex(ar, 1, 0, new ArrayList<>());
//        System.out.println(ans);

        // Another way of initialising the arraylist
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findMulIndex(ar, 1, 0, list);
        System.out.println(ans);
        System.out.println(list);


    }

    static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    // TO find INdex OF the Target
    static  int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target ){
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }

    static  int findIndexLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target ){
            return index;
        }
        else {
            return findIndexLast(arr, target, index - 1);
        }
    }

   static  ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    static ArrayList findMulIndex(int[] arr, int target, int index, ArrayList<Integer> lisst){
         if (index == arr.length){
             return lisst;
         }
         if (arr[index] == target){
             lisst.add(index);
         }
       return findMulIndex(arr, target, index+1, lisst);
    }


//   Not an optimised Approach but for learning a good concept
    static ArrayList findMulIndex2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }

        // this will contain for that function call only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findMulIndex2( arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;


    }

}
