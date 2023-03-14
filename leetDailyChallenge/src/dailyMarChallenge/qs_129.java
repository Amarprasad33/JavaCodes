package dailyMarChallenge;
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
public class qs_129 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(sumNumbers(root));
    }

    public static int sumNumbers(TreeNode root) {
        int tsum= 0;
        int sum = root.val;
        List<Integer> ans = helper(sum, root,0);
        for(int i = 0; i < ans.size(); i++){
            tsum += ans.get(i);
        }
        return tsum;
    }
    private static List<Integer> helper(int sum, TreeNode root, int level){
        if(root == null){
            List<Integer> ele = new ArrayList<>();
            ele.add(sum);
            sum = sum/(int)Math.pow(10, level-1);
            return ele;
        }
        if(level != 0){
            sum = sum*10 +  root.val;
        }

        List<Integer> left = helper(sum , root.left, level+1);
        List<Integer> right = helper(sum, root.right, level+1);

        left.addAll(right);

        return left;
    }

}
