class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean increasing = false;
        boolean decreasing = false;
        
        for(int i=0; i<nums.length-1; i++) {
            if(increasing) {
                if(nums[i+1]<nums[i]){
                    return false;
                }
            } else if(decreasing) {
                if(nums[i+1] > nums[i]) {
                    return false;
                }
            } else {
                if(nums[i+1]>nums[i]) {
                    increasing = true;
                } else if(nums[i+1]<nums[i]){
                    decreasing = true;
                }
            }
        }
        
        return true;
    }
}