package Concepsts;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class  binTreeNode<T> {
    public T data;
    public binTreeNode<T> left;
    public binTreeNode<T> right;

    public binTreeNode(T data){
        this.data = data;
    }

}

public class binTreeUse {
    public static void main(String[] args) {
//        binTreeNode<Integer> root = new binTreeNode<>(1);
//        binTreeNode<Integer> node1 = new binTreeNode<>(2);
//        binTreeNode<Integer> node2 = new binTreeNode<>(4);
//        binTreeNode<Integer> node3 = new binTreeNode<>(5);
//
//        root.left = node1;
//        node1.left = node2;
//        node1.right = node3;

        Scanner sc = new Scanner(System.in);
//        binTreeNode<Integer> root = takeInput(sc);
        binTreeNode<Integer> root = takeInputLevel();
        print(root);

    }

    private static binTreeNode<Integer> takeInputLevel() {
        Scanner sc = new Scanner(System.in);
        Queue<binTreeNode> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data: ");
        int rootData = sc.nextInt();
        if (rootData == -1)
            return null;

        binTreeNode<Integer> root = new binTreeNode<>(rootData);
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()){
            binTreeNode<Integer> front = pendingNodes.poll();

            System.out.println("Enter left child of " + front.data);
            int leftChildData = sc.nextInt();
            if(leftChildData != -1){
                binTreeNode<Integer> child = new binTreeNode<>(leftChildData);
                front.left = child;
                pendingNodes.add(child);
            }

            System.out.println("Enter right child data of " + front.data);
            int rightChildData = sc.nextInt();
            if (rightChildData != -1){
                binTreeNode<Integer> child = new binTreeNode<>(rightChildData);
                front.right = child;
                pendingNodes.add(child);
            }
        }

        return root;
    }

    public static void print(binTreeNode<Integer> root){
        if(root == null)
            return;

        String output = root.data + " ";
        if(root.left != null){
            output += "L:" + root.left.data + ",";
        }
        if(root.right != null){
            output += "R:" + root.right.data + ",";
        }
        System.out.println(output);
        print(root.left);
        print(root.right);
    }

    public static binTreeNode<Integer> takeInput(Scanner sc){
        System.out.println("Enter node data");
        int rootData = sc.nextInt();
        if(rootData == -1) return null;
        binTreeNode<Integer> root = new binTreeNode<>(rootData);

        // To insert a leaf node you have to give input -1 twice
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

}
