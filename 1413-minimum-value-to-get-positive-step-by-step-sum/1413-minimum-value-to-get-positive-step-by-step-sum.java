class Solution {
    public int minStartValue(int[] nums) {
        // in this question we aim to find the minimum prefix sum
        // at the end we do 1 - (minVal) to find the necessary value
        int minVal = 0;
        int prefixSum = 0;
        
        for(int n: nums) {
            prefixSum += n;
            minVal = Math.min(minVal, prefixSum);
        }
        
        return 1 - minVal;
    }
}