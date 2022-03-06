class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y; // 0001 ^ 0100 == 0101 == int 5
        String result = toBinary(xor);
        int diff = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '1') {
                diff++;
            }
        }
        return diff;
    }
    
    public static String toBinary(int x) {
        StringBuilder str = new StringBuilder();
        
        int carry = 0;
        while (x > 0) {
            str.append(x % 2);
            x = x / 2;
        }
        return str.reverse().toString();
    }
}