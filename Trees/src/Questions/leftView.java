package Questions;

import java.util.ArrayList;

public class leftView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(7);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(2);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        root.right.right.right.left = new TreeNode(3);

        printRightView(root);


    }

    static void printLeftView(TreeNode root){
        ArrayList<TreeNode> list = new ArrayList<>();
//        list.add(root);
        leftViewHelper(root, list, 0);
        for(TreeNode cur: list){
            System.out.println(cur.data);
        }
    }

     static void leftViewHelper(TreeNode root, ArrayList<TreeNode> ls, int level) {
        if(root == null) return;

        if(ls.size() == level){
            ls.add(root);
        }

        leftViewHelper(root.left, ls, level+1);
        leftViewHelper(root.right, ls, level+1);
    }

    static void printRightView(TreeNode root){
        ArrayList<TreeNode> list = new ArrayList<>();
//        list.add(root);
        rightViewHelper(root, list, 0);
        for(TreeNode cur: list){
            System.out.println(cur.data);
        }
    }

    static void rightViewHelper(TreeNode root, ArrayList<TreeNode> ls, int level) {
        if(root == null) return;

        if(ls.size() == level){
            ls.add(root);
        }
        rightViewHelper(root.right, ls, level+1);
        rightViewHelper(root.left, ls, level+1);
    }


}
