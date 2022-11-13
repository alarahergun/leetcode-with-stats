class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        
        for(int right=0; right<nums.length; right++) {
            sum += nums[right];
                        
            while(sum - nums[left] >= target) {
                sum -= nums[left];
                left++;
            }
            
            if(sum >= target) {
                min = Math.min(min, right-left+1);  
            }
        }
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}