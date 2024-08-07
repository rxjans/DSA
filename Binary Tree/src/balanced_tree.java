public class balanced_tree {


    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    static int height(Node root){
        if(root == null){
            return 0;
        }
        return 1+(Math.max(height(root.left), height(root.right)));
    }

    static boolean isBalanced(Node root){
        if(root == null){
            return true;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    public static void main(String[] args) {
        int[] nodes = {10, 6 , 4, -1,-1, 2, -1, -1, 4, 2, -1, -1, 2, 5, 8, -1, -1, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println("level order traversal of binary tree is ");
        System.out.println(isBalanced(root));
    }


}
