class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        
        String[] map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        recursive(combinations, digits, "", 0, map);
        return combinations;
        
    }
    
    public static void recursive(List<String> combinations, String digits, String current, int index, String[] map) {
        
        if (index == digits.length()) {
            combinations.add(current);
            return;
        }
        
        String letters = map[Character.getNumericValue(digits.charAt(index))];
        
        for (int i = 0; i < letters.length(); i++) {
            
            recursive(combinations, digits, current + letters.charAt(i), index + 1, map);
            
        }
        
    }
        
}