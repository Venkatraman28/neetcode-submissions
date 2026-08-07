class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Time complexity: O(n logn)
        // Space complexity: O(n)
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Convert the map to list now
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

        // Sort the arr in desc order based on the freq
        arr.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];

        for (int i = 0; i < k; ++i) {
            result[i] = arr.get(i)[1];
        }

        return result;
    }
}
