class Solution {
    public int pivotIndex(int[] nums) {
        int leftPrefixSum = 0;
        int rightPrefixSum = 0;
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        
        for(int i=0, j=nums.length-1; i<nums.length && j>=0; i++, j--) {
            sumRight[j] = rightPrefixSum;
            sumLeft[i] = leftPrefixSum;
            leftPrefixSum += nums[i];
            rightPrefixSum += nums[j];
        }
        
        for(int i=0; i<nums.length; i++) {
            if(sumLeft[i] == sumRight[i]) {
                return i;
            }
        }
        
        return -1;
    }
}