class Solution {
       
    public int minTimeToType(String word) {
        int sum = 0;
        int curr = 97;
        for (int i = 0; i < word.length(); i++) {
            sum++;
            int next = word.charAt(i);
            sum += Math.min(Math.abs(next - curr), 
                            26 - Math.abs(next - curr));
            curr = word.charAt(i);
        }
        return sum;
    }
}

