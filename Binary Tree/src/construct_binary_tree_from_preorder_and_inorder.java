import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class construct_binary_tree_from_preorder_and_inorder {

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

    static int preindex = 0;

    static Node buildTree(int[] preorder, int[] inorder, int is, int ie){
        if(is>ie){
            return null;
        }
        Node root = new Node(preorder[preindex++]);

        int inIndex = 0;
        for(int i=is; i<=ie; i++){
            if(inorder[i] == root.data){
                inIndex = i;
                break;
            }
        }

        root.left = buildTree(preorder, inorder, is, inIndex-1);
        root.right = buildTree(preorder, inorder, inIndex+1, ie);

        return root;
    }

    static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Node curr = q.poll();
                System.out.print(curr.data + " ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n = sc.nextInt();
        int[] preorder = new int[n];
        int[] inorder = new int[n];
        System.out.println("Enter the preorder array : ");
        for(int i=0; i<n; i++){
            preorder[i] = sc.nextInt();
        }
        System.out.println("Enter the inorder array : ");
        for(int i=0; i<n; i++){
            inorder[i] = sc.nextInt();
        }
        Node root = buildTree(preorder, inorder, 0, n-1);
        levelOrder(root);
    }
}
