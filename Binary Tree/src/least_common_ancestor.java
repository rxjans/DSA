import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class least_common_ancestor {


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
        static boolean findPath(Node root, ArrayList<Node> path, int n){
            if(root == null){
                return false;
            }
            path.add(root);
            if(root.data == n){
                return true;
            }
            if(findPath(root.left, path, n) || findPath(root.right, path, n)){
                return true;
            }
            path.remove(path.size()-1);
            return false;
        }

        static Node lca(Node root, int n1, int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();
            if(!findPath(root, path1, n1) || !findPath(root, path2, n2)){
                return null;
            }
            for(int i=0; i<path1.size()-1 && i<path2.size()-1; i++){
                if(path1.get(i+1) != path2.get(i+1)){
                    return path1.get(i);
                }
            }
            return null;
        }

        public static void main(String[] args) {
            int[] nodes = {1, 2 , 4, -1,-1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
        //        System.out.println("level order traversal of binary tree is ");
            Node lca = lca(root, 4, 5);
            System.out.println(lca.data);
        }


}
