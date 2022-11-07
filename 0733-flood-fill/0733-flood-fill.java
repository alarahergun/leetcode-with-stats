class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if (image[sr][sc] == color) return image;
        changeColor(image, sr, sc, color, image[sr][sc]);
        
        return image;
    }
    
    public void changeColor(int[][] image, int sr, int sc, int color, int orgColor) {
        
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) {
            return;
        }
        
        if(image[sr][sc] == orgColor) {
            image[sr][sc] = color;
            changeColor(image, sr, sc-1, color, orgColor);
            changeColor(image, sr-1, sc, color, orgColor);
            changeColor(image, sr+1, sc, color, orgColor);
            changeColor(image, sr, sc+1, color, orgColor);
        }
    }
}