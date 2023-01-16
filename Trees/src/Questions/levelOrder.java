package Questions;

import java.util.LinkedList;
import java.util.*;

public class levelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
//        root.right.right = new Node(22);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(6);

//        System.out.println(sizeTree(root));
//        System.out.println(maxNode(root));
//        for (int i = 1; i <= heightTree(root); i++) {
//            printCurrentLevel(root, i);
//        }

//        opLevelOrder(root);
        opLevelOrderByLevelPrint(root);

//        List<Integer> w = new ArrayList<Integer>();
//        List<Integer> temp = new ArrayList<Integer>();
//        List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>(); //Use Arraylist inside
//
//        for(int i=1;i<10; i++){
//            w.add(i);
//            a.add(new ArrayList(w));
//            temp.add(i);
//            w.removeAll(temp);
//        }
//        System.out.println(temp);
//        System.out.println(w);
//        System.out.println(a);

    }
    static int heightTree(TreeNode root){
        if (root == null){
            return 0;
        }

        return (Math.max(heightTree(root.left),  heightTree(root.right)) +1);
    }

     // This is an unoptimised solution to the lever order traversal
        // It takes O(n^2) time
    // Using Recursion
    static void printCurrentLevel(TreeNode root, int level){
        if(root == null){
            return;
        }
        if (level == 1){
            System.out.print(root.data + " ");
        }else if (level > 1){
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }

    // Much more optimised solution
    // Using Queue
    static void opLevelOrder(TreeNode root){
        Queue<TreeNode> q =  new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode cur = q.poll();
            System.out.print(cur.data +" ");

            if (cur.left != null){
                q.add(cur.left);
            }
            if (cur.right != null){
                q.add(cur.right);
            }
        }
    }
    // This function prints each level in a single line
    static void opLevelOrderByLevelPrint(TreeNode root){
        Queue<TreeNode> q =  new LinkedList<>();
        q.add(root); q.add(null);
        while (!q.isEmpty()){
            TreeNode cur = q.poll();
                    if(cur == null){
                        if (q.isEmpty()) return;
                        q.add(null);
                        System.out.println();
                        continue;
                    }
            System.out.print(cur.data +" ");

            if (cur.left != null){
                q.add(cur.left);
            }
            if (cur.right != null){
                q.add(cur.right);
            }
        }
    }


    // One more approach is left that is using hashmap and it will work same as the
    // above function
}


