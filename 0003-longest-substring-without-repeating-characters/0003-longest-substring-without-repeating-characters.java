class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();
        
        for(int right=0; right<s.length(); right++) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right)); 
            } else {
                while(set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                
                set.add(s.charAt(right));
            }
            
            ans = Math.max(ans, right-left+1);
        }
        
        return ans;
    }
}