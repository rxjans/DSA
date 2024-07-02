import java.util.LinkedList;
import java.util.Queue;

public class maximum_element {

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

    static int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int max= 0;
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.data > max){
                max = curr.data;
            }
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        return max;
    }

    static int maxVal(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maxVal(root.left), maxVal(root.right)));
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2 , 4, -1,-1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println("level order traversal of binary tree is ");
        System.out.println("max element: " + maxVal(root));
    }




}
