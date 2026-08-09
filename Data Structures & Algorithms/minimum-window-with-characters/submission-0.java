class Solution {
    public String minWindow(String s, String t) {
        if (s.isEmpty())
            return "";

        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        // Count the freq in t string
        for (char c : t.toCharArray())
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);

        int have = 0;
        int need = tMap.size();
        
        // To store the index of start and end of window
        int[] r = {-1, -1};
        int result = Integer.MAX_VALUE;

        int left = 0;

        for (int right = 0; right < s.length(); ++right) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (tMap.containsKey(c) && tMap.get(c).equals(window.get(c))) {
                // If needed value present in tMap and its count == s.frequency
                have++;
            }

            while (have == need) {
                // if found result is less than previous value, update
                if ((right - left + 1) < result) {
                    result = right - left + 1;
                    r[0] = left;
                    r[1] = right;
                }

                char leftCharacter = s.charAt(left);

                // Update the freq map
                window.put(leftCharacter, window.get(leftCharacter) - 1);
                if (tMap.containsKey(leftCharacter) && window.get(leftCharacter) < tMap.get(leftCharacter)) {
                    have--;
                }

                left++;
            }
        }

        return result == Integer.MAX_VALUE ? "" : s.substring(r[0], r[1] + 1);
    }
}
