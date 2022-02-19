class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder str = new StringBuilder();
        int carry = 0;
        
        for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            
            int sum = carry;
            if (i >= 0) sum += Character.getNumericValue(a.charAt(i));
            if (j >= 0) sum += Character.getNumericValue(b.charAt(j));
            
            str.append(sum % 2);
            carry = sum / 2;
        }
        
        if(carry != 0) str.append(1);
        return str.reverse().toString();
            
    }
}


/*

        StringBuilder str;
        
        int first = 0;
        int second = 0;
        
        for(int i = a.length() - 1; i >= 0; i--) {
            
            if(a.charAt(i) == 1) first += Math.pow(2.0, (double)i);
            
        }
        
        for(int i = b.length() - 1; i >= 0; i--) {
            
            if(b.charAt(i) == 1) first += Math.pow(2.0, (double)i);
            
        }
        
        int sum = first + second;
        
        for(int i = 0, twoPower = 0; twoPower < sum; i++)
            
            twoPower = Math.pow(2.0, (double)i);
            
            if(twoPower >= sum) {
                
                str = new StringBuilder();
                str.append(1);
                str.setLength(i);
                
                sum = sum - Math.pow(2.0, (double)i - 1);
                
            }
            
        }
        
        for(int i = 1; i < str.length() - 1; i++) {
                        
            if(str.charAt(i) )
            
        }

*/