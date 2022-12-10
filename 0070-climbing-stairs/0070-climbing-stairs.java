class Solution {
    
    // the question asks ways. there are only two possible ways that we arrived on n:
    // climbing 2 stairs up from n-2 or climbing 1 stairs up from n-1.
    // finding different ways of coming there and adding up is enough
    // 
    public int climbStairs(int n) {
        if(n <= 2) {
            return n; // for 1, only one possible way and for 2 (1+1 or 2)
        }
        
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
}