class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Map<Integer, Integer> half = new HashMap<>();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2 == 0) half.put(i, arr[i]/2);    
        }
        
        for(int key : half.keySet()) {
            for(int i=0; i<arr.length; i++) {
                if(half.get(key) == arr[i] && key != i) {
                    
                    return true;
                }
            }
        }
        
        return false; 
    }
}