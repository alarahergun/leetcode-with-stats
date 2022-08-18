class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        
        boolean three = false;
        boolean five = false;
        
        for(int i=1; i<=n; i++){
            if(i%3 == 0){
                three = true;
            }
            if(i%5 == 0){
                five = true;
            }
            
            if(three && five){
                answer.add("FizzBuzz");
            } else if(three){
                answer.add("Fizz");
            } else if(five){
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
            
            three = false;
            five = false;
        }
        
        return answer;
    }
}