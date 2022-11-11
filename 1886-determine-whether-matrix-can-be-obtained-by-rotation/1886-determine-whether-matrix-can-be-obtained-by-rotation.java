class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // the same question with rotate image but rotating 3 times more
        
        for(int i=0; i<4; i++) {
            if(Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotateImage(mat);
        }
        
        return false;
    }
    
    public void rotateImage(int[][] matrix) {
        int n = matrix.length;
        
        // transposing + reversing = 90 degrees rotation
        
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            } 
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n/2; j++) {
                int temp = matrix[i][n-j-1];
                matrix[i][n-j-1] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}