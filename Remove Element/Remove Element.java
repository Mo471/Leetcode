class Solution {
    public int removeElement(int[] nums, int val) {
        
        if(nums.length == 0) return 0;
        
        int k = 0;
        
        for(int r = 0; r < nums.length; r++) {
            if(nums[r] != val) {                
                nums[k] = nums[r];
                k++;
            }
                    
        }
        
        return k;
        
    }
}


/*                
                for(int r = l + 1; r < nums.length; r++) {
                    
                    if(nums[r] != val){
                        int temp = nums[l];
                        nums[l] = nums[r];
                        nums[r] = temp;
                        k++;
*/