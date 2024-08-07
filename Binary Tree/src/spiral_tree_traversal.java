import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class spiral_tree_traversal {

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


        static void printlevel(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<Node>();
            Stack<Integer> s = new Stack<Integer>();
            q.add(root);
            boolean reverse = false;
            while(!q.isEmpty()){
                int count = q.size();
                for(int i=0; i<count; i++){
                    Node curr = q.poll();
                    if(reverse){
                        s.push(curr.data);
                    }
                    else System.out.print(curr.data + " ");
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
                if(reverse){
                    while(!s.isEmpty()){
                        System.out.print(s.pop() + " ");
                    }
                }
                reverse = !reverse;
                System.out.println();
            }
        }

        static void printspiral(Node root){
            if(root == null){
                return;
            }
            Stack<Node> s1 = new Stack<Node>();
            Stack<Node> s2 = new Stack<Node>();
            s1.push(root);
            while(!s1.isEmpty()){
                while(!s1.isEmpty()){
                    Node curr = s1.pop();
                    System.out.print(curr.data + " ");
                    if(curr.left != null){
                        s2.push(curr.left);
                    }
                    if(curr.right != null){
                        s2.push(curr.right);
                    }
                }
                while(!s2.isEmpty()){
                    Node curr = s2.pop();
                    System.out.print(curr.data + " ");
                    if(curr.right != null){
                        s1.push(curr.right);
                    }
                    if(curr.left != null){
                        s1.push(curr.left);
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] nodes = {1, 2 , 4, -1,-1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
//        System.out.println("level order traversal of binary tree is ");
            printspiral(root);
        }

}
