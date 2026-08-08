class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                str.append(Character.toLowerCase(s.charAt(i)));
        }

        System.out.print(str.length());
        
        int i = 0;
        int j = str.length() - 1;

        while (i <= j) {
            System.out.println(j);
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
