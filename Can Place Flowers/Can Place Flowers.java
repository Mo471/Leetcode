class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
            
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            flowerbed[0] = 1;
            n--;
            return n <= 0;
        }
        else if(flowerbed.length == 1) {
            return n <= 0;
        }
        
        
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                continue;
            }
            
            if (i == 0) {
                if (flowerbed[i + 1] == 0) {
                    n--;
                    flowerbed[i] = 1;    
                }
                continue;
            }
            else if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
                continue;
            }
            else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                n--;
                flowerbed[i] = 1;
            }
            
        }
        return n <= 0;
    }
}
