class Solution {
    
    public int maxSubArray(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        int max = Integer.MIN_VALUE;
        int currentMaxValue = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            if(currentMaxValue + nums[i] <= nums[i]) currentMaxValue = nums[i];
            else currentMaxValue += nums[i];
            
            if(currentMaxValue > max) max = currentMaxValue;
            
        }
        return max;
        
    }
    
}





















/*class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        int highest_sum = nums[0];
        for(int i = 0; i < nums.length; i++) {
            
            int j = i;
            int current_sum = 0;
            while(j < nums.length) {
                
                current_sum += nums[j];
                if(current_sum > highest_sum) highest_sum = current_sum;
                j++;
            }          
            
        }
        
        return highest_sum;
        
    }
}*/