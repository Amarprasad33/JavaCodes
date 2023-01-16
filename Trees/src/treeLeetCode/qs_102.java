package treeLeetCode;



import java.util.*;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class qs_102 {

    public static void main(String[] args) {

    }


   // https://leetcode.com/problems/binary-tree-level-order-traversal/description/
     // To be completed on sunday 15/1/23
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<Integer> ele = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q =  new LinkedList<>();
        q.add(root); q.add(null);
        while (!q.isEmpty()){
            TreeNode cur = q.poll();
            if(cur != null){
                ele.add(cur.val);
                temp.add(cur.val);
            }
            if(cur == null){
                if (q.isEmpty()) return ans;
                q.add(null);
                ans.add(ele);
                ele.removeAll(temp);
                continue;
            }
            System.out.print(cur.val +" ");

            if (cur.left != null){
                q.add(cur.left);
            }
            if (cur.right != null){
                q.add(cur.right);
            }
        }

        return ans;
    }



}
