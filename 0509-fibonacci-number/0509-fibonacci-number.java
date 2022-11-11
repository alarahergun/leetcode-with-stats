class Solution {
    
    public int[] fibo = new int[31];
    
    public int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        
        fibo[0] = 0;
        fibo[1] = 1;
        
        for(int i=2; i<=n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];            
        }
                
        return fibo[n];
    }
}