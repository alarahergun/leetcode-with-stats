class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> response = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>(List.of(1));
        response.add(firstRow);
        
        if(numRows == 1){
            return response;
        }
        List<Integer> secondRow = new ArrayList<>(List.of(1,1));
        response.add(secondRow);
            
        if(numRows == 2) {
             return response;
        }

        for(int i=2; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
            List<Integer> previousRow = response.get(i-1); 
            for(int j=1; j<i; j++) {
               row.add(previousRow.get(j-1)+previousRow.get(j));
            }
            
            row.add(1);
            
            response.add(row);
        }
     
            return response;
    }
}