class Solution {
    public int mySqrt(int x) {
        int l=1, h=x/2, mid;        
        if(x==1 || x==0){
            return x;
        }
        
        while(l<=h) {
            mid = (l+h)/2;
            if(mid <= (x/mid) && (mid+1)> x/(mid+1)) {
                return mid;
            } else {
                if(mid > (x/mid)) {
                    h = mid - 1;
                } else l = mid + 1;
            }
        }
        
        return 0;
    }
}