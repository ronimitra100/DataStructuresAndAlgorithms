package extra;

/**
 * Created by ronim_000 on 11/1/2019.
 */
public class Tree {

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

    public Tree(int value){
       this.root=new Node(value);
    }

    public Tree(){
        this.root=null;
    }

    public static void main(String[] args){
        Tree tree = new Tree();
        tree.root=new Node(4);
        tree.root.left=new Node(2);
        tree.root.right=new Node(6);
        tree.root.left.left=new Node(1);
        tree.root.left.right=new Node(3);
        tree.root.right.left=new Node(5);
        tree.root.right.right=new Node(7);
        tree.insert(tree.root,8 );
        tree.insert(tree.root,0 );
        tree.insert(tree.root,8 );
        tree.insert(tree.root,17 );
        tree.insert(tree.root,-20 );
        tree.printInOrderTraversal(tree.root);
        System.out.println();
        tree.printPreOrderTraversal(tree.root);
        System.out.println();
        tree.printPostOrderTraversal(tree.root);
        System.out.println();
        System.out.println(tree.contains(tree.root,6));
        System.out.println(tree.contains(tree.root,16));
    }

    public Node insert(Node node, int value){
        if (node==null){
            return new Node(value);}
        if (value < node.data){
                node.left= insert(node.left, value);
        }

        if ( value > node.data){
                node.right= insert(node.right, value);
            }

            return node;

    }

    public boolean contains(Node node, int value){

        if (value <node.data){
            if (node.left==null){
                return false;
            }
            else{
                return contains(node.left, value);
            }
        }
        if (value>node.data){
            if (node.right==null){
                return false;
            }
            else{
                return contains(node.right, value);
            }
        }

        return true;
    }

    public void printInOrderTraversal(Node node){
        if (node==null){
            System.out.println("");
        }
        if (node.left!=null) {
            printInOrderTraversal(node.left);
        }
        System.out.print(node.data + " ");
        if (node.right!=null) {
            printInOrderTraversal(node.right);
        }
    }

    public void printPreOrderTraversal(Node node){
        if (node==null){
            System.out.println("");
        }
        System.out.print(node.data + " ");
        if (node.left!=null) {
            printPreOrderTraversal(node.left);
        }

        if (node.right!=null) {
            printPreOrderTraversal(node.right);
        }
    }

    public void printPostOrderTraversal(Node node){
        if (node==null){
            System.out.println("");
        }
        if (node.left!=null) {
            printPostOrderTraversal(node.left);
        }

        if (node.right!=null) {
            printPostOrderTraversal(node.right);
        }
        System.out.print(node.data + " ");
    }
}
