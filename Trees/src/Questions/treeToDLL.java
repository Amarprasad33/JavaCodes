package Questions;

public class treeToDLL {

    TreeNode prevPtr = null, head = null;
    public void convertToDLL(TreeNode root){
        if(root == null){
            return ;
        }
        convertToDLL(root.left);
        if(prevPtr == null) head = root;
        else {
            root.left = prevPtr;
            prevPtr.right = root;
        }
        prevPtr = root;
        convertToDLL(root.right);
    }


//    static class Node{
//        Node prev, next;
//        int data;
//        public Node(int data){
//            this.data = data;
//
//        }
//
//    }

}
