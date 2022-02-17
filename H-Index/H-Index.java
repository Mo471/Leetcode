class Solution {
    public int hIndex(int[] citations) {
        int peak = 0;        
        
        for (int i = 0; i < citations.length; i++) {
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (citations[j] >= peak + 1) {
                    count++;
                }
                if (count == peak + 1) {
                    peak = count;
                    //j = i + 1;
                    break;
                }
            }
        }
        return peak;
    }
}