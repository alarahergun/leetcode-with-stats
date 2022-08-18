public class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
        } else if(n == 0) {
            return;
        } else {
            int[] merged = new int[m+n];
            int i=0, j=0, k=0;

            while(i<m && j<n){
                if(nums1[i]<=nums2[j]){
                    merged[k] = nums1[i];
                    i++;
                } else {
                    merged[k] = nums2[j];
                    j++;
                }
                k++;
            }

            if(i<m) {
                while(i<m) {
                    merged[k] = nums1[i];
                    i++;
                    k++;
                }
            } else if(j<n) {
                while(j<n) {
                    merged[k] = nums2[j];
                    j++;
                    k++;
                }
            }
            System.arraycopy(merged, 0, nums1, 0, merged.length);
        }
    }
}



