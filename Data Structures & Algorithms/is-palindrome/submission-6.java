class Solution {
    public boolean isPalindrome(String s) {
        // Time complexity: O(n) - O(n) + O(n) for building new str and palindrome check
        // Space complexity: O(n) - For using string builder
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                str.append(Character.toLowerCase(s.charAt(i)));
        }
        
        int i = 0;
        int j = str.length() - 1;

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
