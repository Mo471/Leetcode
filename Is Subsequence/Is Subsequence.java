class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        
        if (s.length() == 0) return true;
        
        int ps = 0;
        int pt = 0;
        
        while (pt < t.length()) {
            if (t.charAt(pt) == s.charAt(ps)) {
                ps++;
            }
            if (ps == s.length()) {
                return true;
            }
            pt++;
        }
        return false;
        
    }
    
    
}