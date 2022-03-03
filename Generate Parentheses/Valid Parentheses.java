class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        recursive(list, "", 0, 0, n);
        return list;
    }
    
    public static void recursive(List<String> list, String text, int open, int close, int n) {
        
        if (text.length() == n*2) {
            list.add(text);
        }
        
        if (open < n) {
            
            recursive(list, text + "(", open + 1, close, n);
            
        }   
        
        if (close < open) {
            
            recursive(list, text + ")", open, close + 1, n);
            
        }
    }
}