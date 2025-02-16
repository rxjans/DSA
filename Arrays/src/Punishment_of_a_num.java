import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> validNums = new ArrayList<>();

    private boolean isValid(String nums, int remSum){
        if(remSum<0){
            return false;
        }
        if(nums.isEmpty() && remSum == 0){
            return true;
        }
        boolean ans = false;
        for(int i=0;i<nums.length();i++){
            String curr = nums.substring(0,i+1);
            int val = Integer.parseInt(curr);
            ans |= isValid(nums.substring(i+1), remSum-val);
        }
        return ans;
    }

    private void precomputeValidNums(){
        validNums.add(1);
        for(int i=2;i<=1000;i++){
            if(isValid(Integer.toString(i*i), i)){
                validNums.add(i);
            }
        }
    }

    public int punishmentNumber(int n) {
        precomputeValidNums();
        int ans = 0;
        for(int i=0;i<validNums.size();i++){
            int currNum = validNums.get(i);
            if(currNum<=n){
                ans += (currNum*currNum);
            }
        }
        return ans;

    }
}