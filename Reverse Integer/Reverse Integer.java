class Solution {
    public int reverse(int x) {
        
            int reversedInt = 0;
            int originalValue = x;
            try {
                
                while(Math.abs(x) > 0) {
                    
                    reversedInt = Math.addExact(Math.multiplyExact(reversedInt, 10), Math.abs(x)%10);
                    x /= 10;

                }
                
                if (originalValue < 0) {
                
                    reversedInt *= -1;
                
                }
                        
                return reversedInt;

            } catch (ArithmeticException e) {
                
                return 0;
                
            }
                    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        StringBuilder str = new StringBuilder(Integer.toString(x));
        str.reverse();
        // conditional statement to move '-' for negative numbers
        if (x < 0) {
            str.insert(0,"-");
            str.deleteCharAt(str.length() - 1);
        }
        
        try {
            
            int reversedNumber = Integer.parseInt(str.toString());
            return reversedNumber;    
            
        } catch (NumberFormatException e) {
            
            return 0;
            
        }
        
        
        QUEUE
        Queue<Integer> q = new LinkedList<Integer>();
		int reversedInt = 0;
		int iterator = -1;
        int duplicate = x;
		
		while(Math.abs(x) > 0) {
			
			q.add(Math.abs(x%10));
			x = x/10;
            iterator++;
		}
		try {
			
			while (!q.isEmpty()) {
				
				reversedInt += q.peek() * Math.pow(10, iterator);
				q.poll();
				iterator--;
				
			}
			
            if (reversedInt == 2147483647){
                return 0;
            }
            
			if(duplicate < 0) {
				
				reversedInt *= -1;
				
			}
			
			return reversedInt;
			
		} catch (NumberFormatException e) {
			
			return 0;
        
        }
        */
        
    }
        
        
        
}
