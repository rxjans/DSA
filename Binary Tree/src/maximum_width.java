import java.util.LinkedList;
import java.util.Queue;

public class maximum_width {

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

    static int maxWidth(Node root){
        if(root == null){
            return -1;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int result = 0;
        while(!q.isEmpty()){
            int size = q.size();
            result = Math.max(result, size);
            for(int i=0; i<size; i++){
                Node curr = q.poll();
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nodes = {10, 6 , 4, -1,-1, 2, -1, -1, 4, 2, -1, -1, 2, 5, 8, -1, -1, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println("level order traversal of binary tree is ");
        System.out.println(maxWidth(root));
    }

}
