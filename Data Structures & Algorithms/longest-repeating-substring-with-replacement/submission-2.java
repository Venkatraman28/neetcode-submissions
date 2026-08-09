class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> map = new HashSet<>();

        for (char c : s.toCharArray())
            map.add(c);
        
        int result = 0;
        for (char c : map) {
            int count = 0, left = 0;

            for (int right = 0; right < s.length(); ++right) {
                if (s.charAt(right) == c)
                    count++;

                // Window size - frequency > k, else shrink the window
                while ((right - left + 1) - count > k) {
                    if (s.charAt(left) == c) {
                        count--;
                    }
                    left++;
                }
                
                result = Math.max(result, right - left + 1);
            }
        }

        return result;
    }
}
