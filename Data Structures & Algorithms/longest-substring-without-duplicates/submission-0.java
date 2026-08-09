class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1)
            return s.length();

        Set<Character> map = new HashSet<>();
        int i = 0;
        int count = 0;
        int result = 0;
        while (i < s.length()) {
            int j = i;

            while (j < s.length()) {
                if (map.contains(s.charAt(j))) {
                    count = 0;
                    map = new HashSet<>();
                    break;
                } else {
                    map.add(s.charAt(j));
                    count++;
                }
                j++;
                result = Math.max(result, count);
            }

            i++;
        }

        return result;
    }
}
