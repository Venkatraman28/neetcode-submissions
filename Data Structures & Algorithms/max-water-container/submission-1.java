class Solution {
    public int maxArea(int[] heights) {
        // Time complexity - O(n)
        // Space complexity - O(1)
        int left = 0;
        int right = heights.length - 1;
        int result = 0;

        while (left < right) {
            int x = Math.min(heights[left], heights[right]);
            result = Math.max(result, x * (right - left));
            if (heights[left] < heights[right])
                left++;
            else
                right--;
        }

        return result;
    }
}
