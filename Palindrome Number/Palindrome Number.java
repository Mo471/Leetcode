class Solution {
    public boolean isPalindrome(int x) {
        
        if(x == 0) {
            return true;
        } else if (x % 10 == 0 || x < 0) {return false;}
        
        int result = 0;
        int originalValue = x;
        
        while (x!=0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if (result != (newResult - tail) / 10) {
                return false;
            }
            result = newResult;
            x = x/10;       
        }
        
        
        return result == originalValue;
        
        /*
        //String variation
        String str = Integer.toString(x);
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
        */
     }
}