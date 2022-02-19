class Solution {
    public int search(int[] nums, int target) {
        
        return recursiveBinarySearch(nums, target, 0, nums.length - 1);
        
    }
    
    public static int recursiveBinarySearch(int[] nums, int target, int l, int r) {
        
        int mid = (l + r) / 2;
        
        if (r < l || nums.length == 0) {
             return -1;
        }
        
        if (target == nums[mid]) {
            return mid;
        }        
        else if (target < nums[mid]) {
            return recursiveBinarySearch(nums, target, l, mid - 1);   
        }
        else if (target > nums[mid]) {
            return recursiveBinarySearch(nums, target, mid + 1, r);
        }
        
        return -1;
        
    }
}