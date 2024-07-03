public class child_sum_property {

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

    static boolean childSum(Node root){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        int sum = 0;
        if(root.left != null){
            sum += root.left.data;
        }
        if(root.right != null){
            sum += root.right.data;
        }
        return (root.data == sum && childSum(root.left) && childSum(root.right));
    }

    public static void main(String[] args) {
        int[] nodes = {10, 6 , 4, -1,-1, 2, -1, -1, 4, 2, -1, -1, 2, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println("level order traversal of binary tree is ");
        System.out.println(childSum(root));
    }


}
