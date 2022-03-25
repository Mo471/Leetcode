class Solution {
    public boolean isPerfectSquare(int x) {
        if(x == 1) return true;
        
        int l = 2;
        int r = x/2;
        int mid;
        
        while(l <= r) {
            
            mid = (l + r) / 2;
            double squaredMid = (double)mid*mid; // double in case of int*int overflowing
            
            if(squaredMid == x) return true;
            else if(squaredMid > x) r = mid - 1;
            else if(squaredMid < x) l = mid + 1;
            
        }
        
        return false;
    }
}