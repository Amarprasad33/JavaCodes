package com.curocode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {11, 51, 86, 979, 626 , 5, 1 ,88 };
        int target = 1;
       int ans= linearsearch(nums, target);
        System.out.println(ans);

    }

    //search the item in the array : return the index if found
    //otherwise if the item not found return -1
    static int linearsearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        //run a for loop
//        for (int index = 0; index < arr.length; index++) {
//            //check for element at every index if it is = target
//            int element = arr[index];
//            if (element == target)
//                return index;
//        }
        //enhanced for loop
        for(int element : arr) {
            if (element == target)
                return element;
        }


        // this line will execute if none of the return statements above executed
        /// hence the target not found
        return -1;
    }
}
