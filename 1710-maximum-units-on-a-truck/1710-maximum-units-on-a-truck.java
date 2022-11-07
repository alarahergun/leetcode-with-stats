class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int boxes = 0;
        // sorting descendingly according to their second value
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        for(int[] box : boxTypes) {
            if (truckSize >= box[0]) {
                boxes += box[0] * box[1];
                truckSize -= box[0];
            }else {
                boxes += truckSize * box[1];
                return boxes;
            }
        }
        return boxes;
    }
}