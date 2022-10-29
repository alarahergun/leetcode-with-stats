class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int[] intersection = new int[Math.max(nums1.length, nums2.length)];
        int k = 0;
        boolean added = false;
        
        for(int i=0; i<nums1.length; i++) {
            set.add(nums1[i]);
        }
        
        for(int i=0; i<nums2.length; i++) {
            if(set.contains(nums2[i])) {
                added = true;
                set.remove(nums2[i]);
                intersection[k] = nums2[i];
                k++;
            }
        }
        
        if(!added) {
            return new int[0];
        }
        
        if(added && k<=intersection.length-1) {
           int[] smallerArray = new int[k];
            
            for(int i=0; i<smallerArray.length; i++) {
                smallerArray[i] = intersection[i];
            }
            
            return smallerArray;
        }
        
        return intersection;
    }
}