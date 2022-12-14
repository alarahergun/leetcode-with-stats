class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int ones = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) {
                ones++;
                if(max < ones) {
                    max = ones;
                }
            } else {
                ones = 0;
            }
        }
        
        return max;
    }
} 