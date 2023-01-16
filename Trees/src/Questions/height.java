package Questions;



public class height {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(22);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

//        System.out.println(sizeTree(root));
//        System.out.println(maxNode(root));
        for (int i = 1; i <= heightTree(root) ; i++) {
            printCurrentLevel(root, i);
        }

    }

    // height, size, Maximum value
    static int heightTree(TreeNode root){
        if (root == null){
            return 0;
        }

        return (Math.max(heightTree(root.left),  heightTree(root.right)) +1);
    }
    static int sizeTree(TreeNode root){
        if (root == null){
            return 0;
        }

        return sizeTree(root.left) + sizeTree(root.right) +1;
    }

    static int maxNode(TreeNode root){
        if (root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.data, Math.max(maxNode(root.left), maxNode(root.right)));
    }

    // Level Order traversal

    // This is an unoptimised solution to the lever order traversal
    // It takes O(n^2) time
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

}


class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode(int data){
        this.data = data;
    }

}
