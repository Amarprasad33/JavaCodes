package treeLeetCode;



import com.sun.source.tree.Tree;

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
        TreeNode Proot = new TreeNode(0);
        TreeNode Qroot = new TreeNode(0);
        Proot.left = new TreeNode(-5);
        Qroot.left = new TreeNode(-8);

        System.out.println(isSameTree(Proot, Qroot));
    }

    static boolean value = true;
    public static  boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            if(value == false) return  false;
            value = true;
            return value;
        }
        if(p == null || q == null ) {
            value = false;
            return value;
        }

        if(p.val != q.val){
            value = false;
            return value;
        }
        isSameTree(p.left, q.left);
        if(p.val != q.val){
            value = false;
            return value;
        }
        isSameTree(p.right, q.right);

        return value;
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
