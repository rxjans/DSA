import java.util.Stack;

public class inorder_iterative {

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

        static void inorder(Node root){
            Stack<Node> s = new Stack<>();
            Node curr = root;
            while(curr != null || !s.isEmpty()){
                while(curr != null){
                    s.push(curr);
                    curr = curr.left;
                }
                curr = s.pop();
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
        }

        public static void main(String[] args) {
            int[] nodes = {1, 2 , 4, -1,-1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println(root.data);
            System.out.print("Inorder traversal is: ");
            inorder(root);
        }


}
