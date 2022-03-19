class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        
        int l = 0;
        int r = 0;
        
        while (r < nums.length && l < nums.length) {
            if ((nums[l] == 0 && nums[r] == 0) || r <= l) { // moving r only to get r to non-zero
                r++;
                continue;
            }
            
            if (nums[r] != 0 && nums[l] != 0) { // moving l only to get l to zero
                l++;
                continue;
            }
            
            if (nums[l] == 0 && nums[r] != 0) { // switching places with zero from l to non-zero from r
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
                continue;
            }
            l++;
            r++;
            
        }
        
    }
}