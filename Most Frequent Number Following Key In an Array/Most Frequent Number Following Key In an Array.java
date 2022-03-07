class Solution {
    public int mostFrequent(int[] nums, int key) {
        int result = 0;
        int maxOccurence = 0; // to track max occurence of any key
        Map<Integer, Integer> map = new HashMap<>(); // map stores occurences of ints
        
        for (int i = 0; i < nums.length - 1; i++) {
            // First occurence of nums[i + 1]
            if (nums[i] == key && !(map.containsKey(nums[i + 1]))) {
                map.put(nums[i + 1], 1);
                // Condition for maxOccurence == 0
                if (1 > maxOccurence) {
                    result = nums[i + 1];
                    maxOccurence = 1;
                }
                
            // If it is not first occurence of nums[i + 1], increasing occurence in map
            } else if (nums[i] == key && map.containsKey(nums[i + 1])) {
                map.put(nums[i + 1], map.get(nums[i + 1]) + 1);
                // Checking if current nums[i + 1] occurs more than other numbers
                if (map.get(nums[i + 1]) > maxOccurence) {
                    result = nums[i + 1];
                    maxOccurence = map.get(nums[i + 1]);
                }
                
            }
        }
        return result;
    }
}