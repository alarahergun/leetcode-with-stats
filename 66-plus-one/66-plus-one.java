class Solution {
    public int[] plusOne(int[] digits) {
        
        boolean plus = false;
        
        if(digits[digits.length-1] + 1 < 10) {
            digits[digits.length-1] += 1;
            return digits;
        } else {
            digits[digits.length-1] -= 9;
            plus = true;
            
            for(int i=digits.length-2; i>=0; i--) {
                if(plus == false) {
                    return digits;
                }
                
                if(digits[i]+1 < 10) {
                    digits[i] += 1;
                    plus = false;
                } else {
                    digits[i] -= 9;
                }
            }
            
            if(plus == true) {
                int[] updatedDigits = new int[digits.length + 1];
                
                updatedDigits[0] = 1;
                for(int i=1; i<digits.length; i++) {
                    updatedDigits[i] = digits[i];
                }
                
                return updatedDigits;
            }
            
            return digits;
        }
    }
}