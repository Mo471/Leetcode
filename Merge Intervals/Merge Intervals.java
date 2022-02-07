class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        
        // As the quantity of resulting intervals is unknown due to their merging nature, it is neede to use dynamic array
        List<int[]> result = new ArrayList<int[]>();
        
        // Sorting current array by interval start values, time is O(n*logn)
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        // Current interval used to find starting point and figure out how much will it extend
        // After extending to max, current interval will merge all intervals into one and add to result
        int[] currentInterval = intervals[0];
        
        // Taking current interval, extending it to max. Adding to result, and reassigning current interval
        // to the next interval
        for (int i = 0; i < intervals.length; i++) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else if (currentEnd < nextStart) {
                result.add(currentInterval);
                currentInterval = intervals[i];
            }

            if (i == intervals.length - 1) {
                result.add(currentInterval);
            }
        }
        
        // Dynamic array converted to static array
        return result.toArray(new int[result.size()][2]);
        
    }
}