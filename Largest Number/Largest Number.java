class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);                      
        }
        
        for (int i = 0; i < str.length; i++) {
            String toInsert = str[i];
            int j = i;
            
            while (j > 0 && compare(toInsert, str[j - 1])) {
                str[j] = str[j - 1];
                j--;
            }
            str[j] = toInsert;
        }
        
        StringBuilder finalStr = new StringBuilder();
        
        boolean allZeros = true;
        
        for (int i = 0; i < str.length; i++) {
            finalStr.append(str[i]);
            if (!str[i].equals("0")) {
                allZeros = false;
            }
        }
        if (allZeros == true) return "0";
        
        return finalStr.toString();
        
    }
    
    public static boolean compare(String str1, String str2) {
        String compiled1 = str1 + str2;
        String compiled2 = str2 + str1;
        
        if (Double.parseDouble(compiled1) > Double.parseDouble(compiled2)) {
            return true;
        }
        else return false;
    }
    
}