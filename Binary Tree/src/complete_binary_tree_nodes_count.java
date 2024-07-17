import java.util.LinkedList;
import java.util.Queue;

public class complete_binary_tree_nodes_count {
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


        static int countNodes(Node root){
            if(root == null){
                return 0;
            }
            return 1 + countNodes(root.left) + countNodes(root.right);
        }

        public static void main(String[] args) {
            int[] nodes = {1, 2 , 4, -1,-1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.print("Count of nodes of binary tree is: ");
            System.out.println(countNodes(root));
        }
}
