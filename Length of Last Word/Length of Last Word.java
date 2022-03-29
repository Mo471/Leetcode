class Solution {
    
    public int lengthOfLastWord(String s) {
        
        s = s.trim(); // removes leading and trailing spaces
        return (s.length() - 1 - s.lastIndexOf(' '));
        
    }
    
}







/*class Solution {
    public int lengthOfLastWord(String s) {
        
        if(s.length() == 1) return 1;
        
        int lastWordLength = 0;
        boolean lastSpacesCleaned;
        
        if(s.charAt(s.length() - 1) == ' ') lastSpacesCleaned = false;
        else lastSpacesCleaned = true;
        
        
        for(int i = s.length() - 1; i >= 0; i--) {
            
            if(s.charAt(i) == ' ' && lastSpacesCleaned == false) continue;
            else if(s.charAt(i) == ' ' && lastSpacesCleaned == true) return lastWordLength;
            else if(s.charAt(i) != ' ' && lastSpacesCleaned == false) {
                
                lastSpacesCleaned = true;
                lastWordLength++;
                
            }
            else lastWordLength++;
        }
        return lastWordLength;
        
    }
}*/