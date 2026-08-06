class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> freq = new HashMap<>();
        for (String str : strs) {
            char[] x = str.toCharArray();
            Arrays.sort(x);
            String word = new String(x);
            if (!freq.containsKey(word))
                freq.put(word, new ArrayList<>());

            freq.get(word).add(str);
        }

        for (String f : freq.keySet()) {
            result.add(freq.get(f));
        }

        return result;
    }
}
