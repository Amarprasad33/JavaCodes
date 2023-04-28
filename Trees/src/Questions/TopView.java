package Questions;

import java.util.*;

public class TopView {

    // For Practice:: https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
    //Function to return a list of nodes visible from the top view
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(TreeNode root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(0, root));
        while (!q.isEmpty()){
            Pair cur = q.poll();
            if(!map.containsKey(cur.hd)){
                map.put(cur.hd, cur.node.data);
            }

            if(cur.node.left != null){
                q.add(new Pair(cur.hd-1, cur.node.left));
            }
            if(cur.node.right != null){
                q.add(new Pair(cur.hd+1, cur.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return  ans;
    }

    static  class  Pair {
        int hd;
        TreeNode node;

        public Pair(int hd, TreeNode node ){
            this.node = node;
            this.hd = hd;
        }
    }

    static ArrayList<Integer> bottomView(TreeNode root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(0, root));
        while (!q.isEmpty()){
            Pair cur = q.poll();
            // Below this line the condition was removed as it was present in topView
            // This is the only difference between the two codes
            map.put(cur.hd, cur.node.data);


            if(cur.node.left != null){
                q.add(new Pair(cur.hd-1, cur.node.left));
            }
            if(cur.node.right != null){
                q.add(new Pair(cur.hd+1, cur.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return  ans;
    }



}
