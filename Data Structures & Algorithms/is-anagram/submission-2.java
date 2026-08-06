class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        // Map<Character, Integer> sMap = new HashMap<>();
        // Map<Character, Integer> tMap = new HashMap<>();

        // for (int i = 0; i < s.length(); ++i) {
        //     sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        //     tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        // }

        // return sMap.equals(tMap);

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            // Increment when it is comes in first 's'
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0) + 1);
            // Decrement when it is comes in first 't'
            countMap.put(t.charAt(i), countMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (char c : countMap.keySet()) {
            if (countMap.get(c) != 0)
                return false;
        }

        return true;
    }
}
