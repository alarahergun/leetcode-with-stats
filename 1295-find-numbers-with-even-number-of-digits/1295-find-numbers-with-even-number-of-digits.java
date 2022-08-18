class Solution {
    public int findNumbers(int[] nums) {
        int evens = 0;
        
        for(int number: nums){
            int digits = 1;
            
            while(number >= 10) {
                number /= 10;
                digits++;
            }
            
            if(digits%2 == 0) evens++;
        }
        
        return evens;
    }
}   