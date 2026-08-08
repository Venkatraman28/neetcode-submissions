class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        // Sort the array O(n log n)
        Arrays.sort(nums);

        int count = 1;
        int result = 1;

        for (int i = 1; i < nums.length; ++i) {
            // Avoid duplicates
            if (nums[i] == nums[i-1])
                continue;

            if (nums[i] - nums[i-1] == 1)
                count++;
            else
                count = 1;
            
            result = Math.max(result, count);
        }

        return result;
    }
}
