class Solution {
    
    // leftSum + rightSum + pivot = total
    // (total - pivot)/2 = leftSum = rightSum 
    public int pivotIndex(int[] nums) {
        int totalSum = 0, tempSum = 0;
        
        for(int n: nums) {
            totalSum += n;
        }
        
        for(int i=0; i<nums.length; i++) {
            if(tempSum + nums[i] == totalSum - tempSum) {
                return i;
            }
            
            tempSum += nums[i];
        }
        
        return -1;
    }
}