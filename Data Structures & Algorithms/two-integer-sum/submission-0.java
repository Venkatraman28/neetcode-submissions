class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            int x = target - nums[i];

            if (count.containsKey(x))
                return new int[] {count.get(x), i};
            
            count.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
