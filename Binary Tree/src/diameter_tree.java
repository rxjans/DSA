public class diameter_tree {


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
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int d1 = 1+(height(root.left)+height(root.right));
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);
        return Math.max(d1, Math.max(d2, d3));
    }

    static int res = 0;

    static int diameter2(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res, 1+lh+rh);
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2 , 4, -1,-1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        diameter2(root);
        System.out.print("diameter of tree: " + res);
    }




}
