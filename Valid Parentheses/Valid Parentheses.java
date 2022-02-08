class Solution {
    public boolean isValid(String s) {
        
        if(s.length() == 1) {return false;}
        
        int i = 0;
        Stack<Character> stk = new Stack<Character>();
        
        while(i < s.length() && stk.size() <= s.length() - i) {
            
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
            
            stk.push(s.charAt(i));
            i++;
            
            }
            else if(stk.size() == 0) {return false;}
            else if(s.charAt(i) == '}' && stk.peek() != '{') {return false;}
            else if(s.charAt(i) == ')' && stk.peek() != '(') {return false;}
            else if(s.charAt(i) == ']' && stk.peek() != '[') {return false;}
            else {stk.pop(); i++;}
        }
        
        if (stk.size() == 0) {return true;}
        else return false;
       
    }      
}        
        
        
