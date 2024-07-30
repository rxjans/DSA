import java.util.ArrayList;
import java.util.Collections;

public class serialize_deserialize_tree {

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

        public static class deserialize_tree{
            static int idx = -1;
            static Node deserialize(ArrayList<Integer> arr){
                idx++;
                if(arr.get(idx) == -1){
                    return null;
                }
                Node newNode = new Node(arr.get(idx));
                newNode.left = deserialize(arr);
                newNode.right = deserialize(arr);

                return newNode;
            }
        }

        static void serialize(Node root, ArrayList<Integer> arr){
            if(root == null){
                arr.add(-1);
                return;
            }
            arr.add(root.data);
            serialize(root.left, arr);
            serialize(root.right, arr);
        }

        public static void main(String[] args) {
            ArrayList<Integer> nodes = new ArrayList<>();
            Collections.addAll(nodes, 1, 2 , 4, -1,-1, 5, -1, -1, 3, -1, 6, -1, -1);
            deserialize_tree buildTree = new deserialize_tree();
            Node root = buildTree.deserialize(nodes);
            ArrayList<Integer> arr = new ArrayList<>();
            serialize(root, arr);
            System.out.println(arr);
        }

}
