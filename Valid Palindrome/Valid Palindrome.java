class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            } else if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }
            
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}