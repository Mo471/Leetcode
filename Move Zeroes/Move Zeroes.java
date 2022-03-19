class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        
        int l = 0;
        int r = 0;
        
        while (r < nums.length && l < nums.length) {
            if ((nums[l] == 0 && nums[r] == 0) || r <= l) {
                r++;
                continue;
            }
            
            if (nums[r] != 0 && nums[l] != 0) {
                l++;
                continue;
            }
            
            if (nums[l] == 0 && nums[r] != 0) {
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