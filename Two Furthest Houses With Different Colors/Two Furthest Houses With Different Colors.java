class Solution {
    public int maxDistance(int[] colors) {
        if (colors[0] != colors[colors.length - 1]) {
            return colors.length - 1;
        }
        
        for (int i = 1, j = colors.length - 2; i < colors.length || j >= 0; i++, j--) {
            if(colors[0] != colors[j]) {
                return j;
            } else if (colors[colors.length - 1] != colors[i]) {
                return colors.length - 1 - i;
            }
        }
        return colors[colors.length/2];
    }
}