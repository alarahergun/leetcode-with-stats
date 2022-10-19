class Solution {
    public int minStartValue(int[] nums) {
        int minStartValue = 1;
        int sum = 1;
        
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println("sum: "+ sum);
            if(sum <= 0) {
                minStartValue += 1 - (sum);
                sum = 1;
            }
        }
        
        return minStartValue;
    }
}