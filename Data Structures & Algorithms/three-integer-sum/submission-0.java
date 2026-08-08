class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Time complexity: O(n^2)
        // Space complexity: O(k), where k is the unique triplets.

        // Sort the array
        Arrays.sort(nums);

        List<List<Integer>> resArr = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            // After sorting if the first number itself greater than 0 no need to find anything
            if (nums[0] > 0)
                break;
            
            // We already found the pattern for number i, no need to run the whole
            // logic again for the same number, so we can skip
            if (i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i+1;
            int right = nums.length - 1;

            while (left < right) {
                int result = nums[i] + nums[left] + nums[right];

                // Meaning it is negative we need more number. So increase left pointer
                // Because our array is now ranging from smaller to larger
                if (result < 0)
                    left++;
                else if (result > 0) {
                    // Meaning it is positive we need less number. So decrease right pointer
                    right--;
                } else {
                    // result became - 0
                    resArr.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // Since we already used one number from duplicate, dont want to 
                    // end up taking the same pattern. If so, duplicate result will
                    // occur
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                }
            }
        }

        return resArr;
    }
}
