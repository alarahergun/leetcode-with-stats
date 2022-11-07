class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int boxCount = 0;
        int maxUnits = 0;
        // sorting descendingly according to their second value
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        for(int i=0; i<boxTypes.length; i++) {
            if(boxCount == truckSize) {
                return maxUnits;
            }
            
            if(boxCount + boxTypes[i][0] < truckSize) {
                boxCount += boxTypes[i][0];
                maxUnits += boxTypes[i][0] * boxTypes[i][1];
            } else {
                int tempBoxCount = truckSize - boxCount;
                boxCount += tempBoxCount;
                maxUnits += tempBoxCount * boxTypes[i][1];
            }
        }
        
        return maxUnits;
    }
}