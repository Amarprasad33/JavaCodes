package Concepsts;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}



public class treeUse {
    public static void main(String[] args) {

//        TreeNode<Integer> root = new TreeNode<>(10);
//        TreeNode<Integer> node1 = new TreeNode<>(20);
//        TreeNode<Integer> node2 = new TreeNode<>(30);
//        TreeNode<Integer> node3 = new TreeNode<>(40);
//        TreeNode<Integer> node4 = new TreeNode<>(50);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);

//        TreeNode<Integer> root = takeInput();
//        print(root);

        TreeNode<Integer> root = takeInputLevelWise();
        print(root);

    }

    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        Queue<TreeNode> pendingNode = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNode.add(root);
        while (!pendingNode.isEmpty()){
            TreeNode<Integer> frontNode = pendingNode.poll();
            System.out.println("Enter the number of children of " + frontNode.data);
            int numChildren = s.nextInt();
            for (int i = 0; i < numChildren; i++) {
                System.out.println("Enter " + (i+1) + " th child of " + frontNode.data);
                int child = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                pendingNode.add(childNode);
            }
        }
        return root;
    }

    public static TreeNode<Integer> takeInput(){
        int n ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the next node data");
        n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter the number of children");
        int childNodes = s.nextInt();
        for (int i = 0; i < childNodes; i++) {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return  root;
    }

    // Prints the tree recursively
    public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++ ){
            s += root.children.get(i).data + ", ";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++ ){
            print(root.children.get(i));
        }
    }
    public static void printLevelWise(TreeNode<Integer> root){
        Queue<TreeNode> level = new LinkedList<>();
        level.add(root);
        while (!level.isEmpty()){
            TreeNode<Integer> frontNode = level.remove();
            String s = frontNode.data + ":";
            for (int i = 0; i < frontNode.children.size(); i++ ){
                s += frontNode.children.get(i).data + ", ";
                level.add(frontNode.children.get(i));
            }
            System.out.println(s);
        }
    }

}
