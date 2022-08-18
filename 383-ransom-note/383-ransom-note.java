class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> left = new HashMap<>();
        Map<String, Integer> right = new HashMap<>();
        
        String[] ransom = ransomNote.split("");
        String[] mag = magazine.split("");
        
        for(int i=0; i<ransom.length; i++) {
            if(left.containsKey(ransom[i])){
                left.put(ransom[i], left.get(ransom[i])+1);
            } else {
                left.put(ransom[i], 1);
            }
        }
        
        for(int i=0; i<mag.length; i++) {
            if(right.containsKey(mag[i])){
                right.put(mag[i], right.get(mag[i])+1);
            } else {
                right.put(mag[i], 1);
            }
        }
        
        for(String key : left.keySet()){    
           if(!right.containsKey(key) || right.get(key) < left.get(key)) {
               return false;
           }
        }  
        
        return true;
    }
} 