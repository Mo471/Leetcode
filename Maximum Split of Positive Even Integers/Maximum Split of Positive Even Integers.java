class Solution {
    public static List<Long> maximumEvenSplit(long finalSum) {
        List<Long> result = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return result;
        }
        long even = 2;

        result.add(finalSum);

        while (finalSum > 0) {
            if (finalSum - even <= even || finalSum - even == 0) {
                return result;
            } else {
                long temp = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                result.add(even);
                result.add(temp - even);
                finalSum -= even;
                even += 2;
            }
        }
        return result;
    }
}