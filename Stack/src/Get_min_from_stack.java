import java.util.Stack;

public class Get_min_from_stack {
    class Solution {
        public Solution() {}
        Stack<Integer> stack = new Stack<>();
        int min;
        // Add an element to the top of Stack
        public void push(int x) {
            // code here
            if(stack.isEmpty()){
                min = x;
            }
            else if(x<=min){
                stack.push(min);
                min = x;
            }
            stack.push(x);
        }

        // Remove the top element from the Stack
        public void pop() {
            // code here
            if(stack.isEmpty()){
                return;
            }
            int temp = stack.pop();
            if(temp == min && !stack.isEmpty()){
                min = stack.pop();
            }
        }

        // Returns top element of the Stack
        public int peek() {
            // code here
            if(stack.isEmpty()){
                return -1;
            }
            return stack.peek();
        }

        // Finds minimum element of Stack
        public int getMin() {
            // code here
            if(stack.isEmpty()){
                return -1;
            }
            return min;
        }
    }
}
