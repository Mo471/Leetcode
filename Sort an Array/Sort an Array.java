class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    public void quickSort(int[] nums, int lo, int hi) {
    if (lo >= hi)
        return ;
        int pivot = partition(nums, lo, hi);
        quickSort(nums, lo, pivot - 1);
        quickSort(nums, pivot + 1, hi);
    }
    
    public int partition(int[] nums, int lo, int hi) {
        int q = lo + (int)(Math.random() * (hi - lo + 1));
        exch(nums, lo, q);
        
        int index = lo + 1;
        for (int i = lo + 1; i <= hi; i++){
            if (nums[i] < nums[lo]){
                exch(nums, i, index++);
            }
        }
        exch (nums, lo, --index);
        return index;
    }
    // Bitwise operation used to switch i and j
    public void exch(int[] nums, int i, int j) {
        if (i == j)
            return;
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }                    
}
