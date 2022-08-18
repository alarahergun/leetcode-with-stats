class Solution {
   public int romanToInt(String s) {

        int numeral = 0;
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        
        Map<Character, Character> affected = new HashMap<>();
        affected.put('V', 'I');
        affected.put('X', 'I');
        affected.put('L', 'X');
        affected.put('C', 'X');
        affected.put('D', 'C');
        affected.put('M', 'C');

        for(int i=s.length()-1; i>=0; i--) {
            
            if(i==0) {
                numeral += romanNumerals.get(s.charAt(i));
                continue;
            }
            
            if(affected.containsKey(s.charAt(i))) {
                if(affected.get(s.charAt(i)) == s.charAt(i-1)) {
                    numeral = numeral + romanNumerals.get(s.charAt(i)) - romanNumerals.get(s.charAt(i-1));
                    i -= 1;
                    continue;
                }
            }
            
            numeral += romanNumerals.get(s.charAt(i));
        }
        
        return numeral;
    }
}