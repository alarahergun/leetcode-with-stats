class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int wealth = 0;
        int maximum = 0;
        for(int j=0; j<accounts[0].length; j++) {
            maximum += accounts[0][j];
        }
        
        for(int i=1; i<accounts.length; i++) {
            wealth = 0;
            
            for(int j=0; j<accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            
            if(wealth > maximum) {
                maximum = wealth;
            }
        }
        
        return maximum;
    }
} 