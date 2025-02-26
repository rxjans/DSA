public class Maximum_absolute_sum_of_any_subarray {
    class Solution {
        public int maxAbsoluteSum(int[] nums) {
            int ans = Integer.MIN_VALUE;
            int maxSum = 0;
            int minSum = 0;

            for (int num : nums) {
                maxSum = Math.max(num, maxSum + num);
                minSum = Math.min(num, minSum + num);
                ans = Math.max(ans, Math.max(maxSum, -minSum));
            }

            return ans;
        }
    }
}
