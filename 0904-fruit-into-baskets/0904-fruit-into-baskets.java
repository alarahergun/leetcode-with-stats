class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int ans = 0;
        Map<Integer, Integer> baskets = new HashMap<>();
        
        for(int right=0; right<fruits.length; right++) {
            if(baskets.containsKey(fruits[right])) {
                baskets.replace(fruits[right], baskets.get(fruits[right]) + 1);
            } else {
                baskets.put(fruits[right], 1);
            }
            
            while(baskets.size() > 2) {
                baskets.replace(fruits[left], baskets.get(fruits[left]) - 1);
                if(baskets.get(fruits[left]) <= 0) {
                    baskets.remove(fruits[left]);
                }
                left++;
            }
            
            ans = Math.max(ans, right-left+1);
        }
        
        return ans;
    }
}