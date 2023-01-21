package Concepsts;
import java.util.*;

public class viewOfTree {

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(7);
        root.right = new Node(6);
        root.right.right = new Node(2);
        root.right.right.left = new Node(5);
        root.right.right.right = new Node(1);
        root.right.right.right.left = new Node(3);

        printLeftView(root);
        printRightView(root);
    }

    // Left view of tree using Arraylist
    static void printLeftView(Node root){
        ArrayList<Node> list = new ArrayList<>();

        printLeftViewUtil(root, list, 0);

            for (Node cur : list) {
                System.out.print(cur.data + ", ");
            }
    }

    static void printLeftViewUtil(Node root, ArrayList ls, int level){
        if (root == null) return;

        if (ls.size() == level){
            ls.add(root);
        }
        printLeftViewUtil(root.left, ls, level+1);
        printLeftViewUtil(root.right, ls, level+1);
    }
    static void printRightViewUtil(Node root, ArrayList ls, int level){
        if (root == null) return;

        if (ls.size() == level){
            ls.add(root);
        }
        printRightViewUtil(root.right, ls, level+1);
        printRightViewUtil(root.left, ls, level+1);
    }

    // Right View of tree using HashMap
    static void printRightView(Node root){
        HashMap<Integer, Integer> list = new HashMap();

        printRightViewUtil2(root, list, 0);

        for (int cur : list.values()) {
            System.out.print(cur + ", ");
        }
    }
    static void printRightViewUtil2(Node root, HashMap ls, int level){
        if (root == null) return;

        ls.put(level, root.data);
        printRightViewUtil2(root.left, ls, level+1);
        printRightViewUtil2(root.right, ls, level+1);
    }
}
