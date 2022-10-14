/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1, h=n, mid;
        
        while(l<=h) {
            mid = l+(h-l)/2;
            boolean isBad = isBadVersion(mid);
            
            if(isBad && !isBadVersion(mid-1)) {
                return mid;
            } else if(isBad) {
                h = mid-1;
            } else {
                l = mid+1;
            }
        }
        
        return -1;
    }
}