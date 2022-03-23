class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        
        if (m == 0 && n != 0) {            
            for (int k = 0; k < m + n; k++) {                
                nums1[k] = nums2[k];               
            }            
            return;
        }
        
        if (n == 0) {
            return;            
        }
              
        for(int k = 0; k < m + n; k++) {            
            if (j == n) {                
                temp[k] = nums1[i];
                i++;
                continue;                
            }            
            if (i >= m && nums1[k] == 0) {
                temp[k] = nums2[j];
                j++;
                continue;                
            }            
            if (nums1[i] > nums2[j]) {
                temp[k] = nums2[j];
                j++;
                continue;                  
            }            
            temp[k] = nums1[i];
            i++;            
        }
        
        for (int k = 0; k < m + n; k++) {
            nums1[k] = temp[k];            
        }
    }
}