class Solution {
        
    public int minCostToMoveChips(int[] arrayIn) {
        
        if(arrayIn.length == 1) return 0;
        
        int evenNumbers = 0;
        int oddNumbers = 0;
        
        for(int i = 0; i < arrayIn.length; i++) {
            
            if(arrayIn[i] % 2 == 0) evenNumbers += 1;
            else oddNumbers += 1;
            
        }
        
        if (evenNumbers < oddNumbers) return evenNumbers;
        else return oddNumbers;
        
        
        
    }    
}