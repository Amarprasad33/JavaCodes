package Concepsts;

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
        binTreeNode<Integer> root = new binTreeNode<>(1);
        binTreeNode<Integer> node1 = new binTreeNode<>(2);
        binTreeNode<Integer> node2 = new binTreeNode<>(4);
        binTreeNode<Integer> node3 = new binTreeNode<>(5);

        root.left = node1;
        node1.left = node2;
        node1.right = node3;
    }
}
