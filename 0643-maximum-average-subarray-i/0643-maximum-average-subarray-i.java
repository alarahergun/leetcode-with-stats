class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = nums[0];
        
        for(int i=1; i<k; i++) {
            sum += nums[i];
        }
        
        double maxAvg = (double) sum / k;
        
        for(int i=1; i<=nums.length-k; i++) {
            sum = sum - nums[i-1] + nums[i+(k-1)];
            double avg = (double) sum / k;
            
            if(avg > maxAvg) {
                maxAvg = avg;
            }
        }
        
        return maxAvg;
    }
}