class Solution {
    public int rob(int[] nums) {
        int next = 0;
        int nextNext = 0;

        for (int i = 0; i < nums.length; ++i) {
            int current = Math.max(nums[i]+nextNext, next);
            nextNext = next;
            next = current;
        }

        return next;
    }
}
