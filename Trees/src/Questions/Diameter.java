package Questions;

public class Diameter {
    public static void main(String[] args) {

    }

    static int ans = 0;
    // It is just simple one line modification of the "height of tree" code
    public static int diameter(TreeNode root){
        if(root == null) return 0;

        int leftHeight  = diameter(root.left);
        int rightHeight = diameter(root.right);
        ans = Math.max(ans, 1 + leftHeight + rightHeight);   // This line actually calculates the diameter
        return 1 + Math.max(leftHeight, rightHeight);
    }
    // The function just returns the height of tree but it updates the ans value which is the diameter

    // LOWEST COMMON ANCESTOR  (present in GFG)
    static TreeNode LCA(TreeNode root, int n1, int n2){
        if(root == null) return null;
        if (root.data == n1 || root.data == n2) return root;

        TreeNode left = LCA(root.left, n1, n2);
        TreeNode right = LCA(root.right, n1, n2);

        if(left == null) return right;
        if(right == null) return left;

        return root;
    }



}
