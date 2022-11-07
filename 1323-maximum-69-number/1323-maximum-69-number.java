class Solution {
    public int maximum69Number (int num) {
        int[] nums = new int[4];
        int count = 0;
        boolean changed = false;
        while(num != 0) {
            nums[count++] = num%10;
            num /= 10;
        }
        
        for(int i=count-1; i>=0 && changed==false; i--) {
            if(nums[i] != 9) {
                changed = true;
                nums[i] = 9;
            }
        }
        
        int newNumber = 0;
        
        for(int i=count-1; i>=0; i--) {
            newNumber += nums[i] * Math.pow(10, i);
        }
        
        return newNumber;
    }
}