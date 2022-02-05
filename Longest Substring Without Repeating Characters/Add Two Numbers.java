class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s.length() == 0) {
            return 0;
        }
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int size = 1;
        int maxSize = 1;
        int l = 0;
        int r = 1;        
        map.put(s.charAt(l), 1);
        
        while(r < s.length()) {
            
            if (!map.containsKey(s.charAt(r))) {
                map.put(s.charAt(r), 1);
                r++;
                size++;
                if (size == 128) {
                        return size;
                }
                if (size > maxSize) {
                    maxSize = size;
                }
            } else if (map.containsKey(s.charAt(r))) {
                
                if (s.charAt(l) == (s.charAt(r))) {
                    l++;
                    r++;
                    continue;
                }
                
                map.remove(s.charAt(l));
                l++;
                size--;
            }
        }
        return maxSize;
           
    }
}

/* O(n^2)
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), 1);
                    size++;
                    if (size == 128) {
                        return size;
                    }
                    if (size > maxSize) {
                        maxSize = size;
                    }
                } else if (map.get(s.charAt(j)) == 1) {                
                    size = 0;
                    map.clear();
                    j = s.length();
                }
            }                   
        }
        return maxSize;
        */ 