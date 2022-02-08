class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int minLength = 200;
        StringBuilder commonPrefix = new StringBuilder();
        // find shortest word
        for(int i = 0; i < strs.length; i++) {
            
            if(strs[i].length() == 0) {
                
                return "";
                
            }
            else if(strs[i].length() < minLength) {
                
                minLength = strs[i].length();
                
            }
            
        }
        
        
        
        // loop through each character and compare to shortest word, add to string builder
        for(int i = 0; i < minLength; i++) {
            
            for(int j = 1; j < strs.length; j++) {
                
                if(strs[j].charAt(i) == strs[0].charAt(i)) {
                    
                    continue;
                    
                } else return commonPrefix.toString();
                
            }           
            
            commonPrefix.append(strs[0].charAt(i));
                   
                           
        }
                   
        return commonPrefix.toString();
        
    }
}