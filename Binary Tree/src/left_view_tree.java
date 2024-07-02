import java.util.LinkedList;
import java.util.Queue;

public class left_view_tree {


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




        static void printleft(Node root){
            if(root == null){
                return;
            }
           Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int count = q.size();
                for(int i=0; i<count; i++){
                    Node curr = q.poll();
                    if(i==0){
                        System.out.print(curr.data + " ");
                    }
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] nodes = {1, 2 , 4, -1,-1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
//        System.out.println("level order traversal of binary tree is ");
            printleft(root);
        }





}
