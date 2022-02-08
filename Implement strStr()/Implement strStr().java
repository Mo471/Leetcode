class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            
            if(haystack.substring(i, i + needle.length()).equals(needle)) return i;
            
        }
        
        return -1;
        
    }
}       

/*
        for(int i = 0; i < haystack.length(); i++) {
            
            if(haystack.charAt(i) == needle.charAt(0) && needle.length() <= haystack.length() - i) {
                
                for(int n = 0, h = i; n < needle.length(); n++, h++) {
                    
                    if(haystack.charAt(h) != needle.charAt(n)) break;
                    
                    if(n == needle.length() - 1) return i;
                    
                }
                
            }
            
        }
        
        return -1;
        */