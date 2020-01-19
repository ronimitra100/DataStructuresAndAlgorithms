package extra;

/**
 * Created by ronim_000 on 11/2/2019.
 */
public class CheckValidBST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }

        public Node(){

        }
    }

    Node root;
    Node left;
    Node right;

    public CheckValidBST(int rootValue){
        this.root = new Node(rootValue);
    }

    public CheckValidBST(){
        this.root = null;
    }



    public static void main(String[] args){
        CheckValidBST myTree = new CheckValidBST();
        myTree.root = new Node(4);
        myTree.root.left = new Node(2);
        myTree.root.right= new Node(6);
        myTree.root.left.left = new Node(1);
        myTree.root.left.right=new Node(3);
        myTree.root.right.left=new Node(5);
        myTree.root.right.right=new Node(10);
        System.out.println(myTree.isValidBST(myTree.root));
    }

    public boolean isValidBST(Node node, int min, int max){
        if (node==null){
            return true;
        }

        if (node.data < min || node.data>max){
            return false;
        }

        return (isValidBST(node.left, min, node.data-1) && isValidBST(node.right, node.data+1, max));
    }

    public boolean isValidBST(Node node){
        return isValidBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
