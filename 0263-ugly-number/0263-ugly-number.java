class Solution {
    public boolean isUgly(int n) {
        
        // for this question if 1 is obtained until all divisions everything is fine
        // if any number bigger than 1 is obtained it is a prime other than 2 3 or 5

        while(n>1) {
             if(n%5 == 0) {
                n /= 5;
             } else if(n%3 == 0) {
                 n /= 3;
             } else if(n%2 == 0) {
                 n /= 2;
             } else return false;
        }
        
        return n > 0;
    }
}