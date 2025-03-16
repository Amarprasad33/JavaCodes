package AvProblems;

import java.util.*;

public class kClosestPointsToOrigin {
    public static void  main(String[] args) {
//        int[][] arr = {{3,3},{5,-1},{-2,4}};
        int[][] arr = {{1,3},{-2, 2},{2, -2}};
        int[][] ans = kClosest(arr, 2);
        for(int[] ar: ans){
            System.out.println(Arrays.toString(ar));
        }
    }

    public static int[][] kClosest(int[][] arr, int k){
        if(arr.length == 0) return new int[0][0];

        int[][] ans = new int[k][2]; int c = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0;i < arr.length; i++){
            map.put( (arr[i][0]*arr[i][0]) + (arr[i][1]*arr[i][1]), Arrays.asList(arr[i][0], arr[i][1]));
        }
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i < arr.length; i++){
            que.add((arr[i][0]*arr[i][0]) + (arr[i][1]*arr[i][1]));
            if(que.size() > k){
                que.poll();
            }
        }

        while(!que.isEmpty()){
            int mul = que.poll();
            List<Integer> tem = map.get(mul);
            ans[c][0] = tem.get(0);
            ans[c][1] = tem.get(1);
            c++;
        }

        return ans;
    }
}
