class Solution {
    public int mySqrt(int x) {
        
        if(x < 2 ) return x;
        
        int l = 2;
        int r = x / 2;
        int mid;
        
        
        while(l <= r) {
            
            mid = (r + l) / 2;
            
            // doubles are used because int*int can be > Integer.MAX_VALUE, and integer will overflow to MIN_VALUE
            if((double)mid*mid > x) {
                
                r = mid - 1;
                
            }
            else if((double)mid*mid < x){
                
                l = mid + 1;
                
            }
            
            else if((double)mid*mid == x) return mid; 
            
        }
        
        return r;
    }    
}