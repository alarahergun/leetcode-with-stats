class Solution {
    public int maxSubArray(int[] nums) {
        // solution with kadane's algorithm
        int max = nums[0];
        int largestSum = nums[0];
        
        for(int i=1; i<nums.length; i++) {
            max = Math.max(max+nums[i], nums[i]);
            largestSum = Math.max(largestSum, max);
        }
        
        return largestSum;
    }
}