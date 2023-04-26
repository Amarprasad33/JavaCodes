package Questions;

import java.util.ArrayList;

public class leftView {
    public static void main(String[] args) {

    }

    static  void printLeftView(TreeNode root){
        ArrayList<TreeNode> list = new ArrayList<>();

        leftViewHelper(root, list, 0);
    }

    private static void leftViewHelper(TreeNode root, ArrayList<TreeNode> list, int level) {
        if(root == null) return;

        if(list.get(level) == null){
            list.add(root);
        }
        leftViewHelper(root.left, list, level+1);
        leftViewHelper(root.right, list, level+1);
    }


}
