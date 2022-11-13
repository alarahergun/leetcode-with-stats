class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length;
        int left = 0;
        int sum = 0;
        boolean updated = false;
        
        for(int right=0; right<nums.length; right++) {
            sum += nums[right];
                        
            while(sum - nums[left] >= target) {
                sum -= nums[left];
                left++;
            }
            
            if(sum >= target) {
                min = Math.min(min, right-left+1);  
                updated = true;
            }
        }
        
        return updated ? min : 0;
    }
}