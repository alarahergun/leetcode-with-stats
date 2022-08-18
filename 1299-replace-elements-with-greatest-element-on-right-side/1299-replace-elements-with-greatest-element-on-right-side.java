class Solution {
    public int[] replaceElements(int[] arr) {
        
        int maximum = -1;
        
        for(int i=arr.length-1; i>=0; i--) {
            int temp = arr[i];
            arr[i] = maximum;
            
            if(temp>maximum){
                maximum = temp;   
            }
        }
        
        return arr;
    }
}  