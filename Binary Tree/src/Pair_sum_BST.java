import java.util.ArrayList;

public class Pair_sum_BST {
    static class Node{
        int data;
        balanced_tree.Node left;
        balanced_tree.Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    class Solution {
        boolean findTarget(Node root, int target) {
            // Write your code here
            ArrayList<Integer> arr = new ArrayList<>();
            add(root, arr);
            int i = 0;
            int j = arr.size()-1;
            while (i<j){
                if(arr.get(i) + arr.get(j) == target){
                    return true;
                }
                else if(arr.get(i)+arr.get(j) > target){
                    j--;
                }
                else i++;
            }
            return false;
        }
        void add(Node root, ArrayList<Integer> arr){
            if (root == null) {
                return;
            }
            add(root.left, arr);
            arr.add(root.data);
            add(root.right, arr);
        }
    }
}
