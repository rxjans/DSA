public class k_distance_nodes {
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


    static void printkdist(Node root, int k){
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.print(root.data + " ");
        }
        printkdist(root.left, k-1);
        printkdist(root.right, k-1);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2 , 4, -1,-1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.print("k(2) distance nodes: ");
        printkdist(root, 2);
    }

}
