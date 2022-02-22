class Solution {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            Map<Character, Integer> map = mapify(chars); // creating map of chars for each word
            for (int j = 0; j < words[i].length(); j++) {
                if (!map.containsKey(words[i].charAt(j)) || map.get(words[i].charAt(j)) == 0) {
                    break;
                } else {
                    map.put(words[i].charAt(j), map.get(words[i].charAt(j)) - 1);
                    if (j == words[i].length() - 1) {
                        result += words[i].length();
                    }
                }
            }
        }
        return result;
    }
    
    public static Map<Character, Integer> mapify(String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            char temp = chars.charAt(i);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else map.put(temp, 1);
        }
        return map;
    }
}