class Solution {
    // O(n*logn) solution
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] duplicate = nums.clone();
        
        Arrays.sort(duplicate);
        
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(duplicate[i])) {
                map.put(duplicate[i], i);
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            duplicate[i] = map.get(nums[i]);
        }
        
        return duplicate;
    }
}

/*
O(n^2 solution)

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                
                if (nums[i] > nums[j]) {
                    result[i] += 1;
                }
            }
        }
        return result;
    }
}
*/