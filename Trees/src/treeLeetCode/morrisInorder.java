package treeLeetCode;
import java.util.*;
public class morrisInorder {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/binary-tree-inorder-traversal/
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            ans.add(cur.val);
            cur = cur.right;
        }
        return ans;
    }

}
