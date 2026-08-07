class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for (String str: strs) {
            s.append(str.length()).append("-").append(str);
        }
        
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> r = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '-')
                j++;
            
            int len = Integer.parseInt(str.substring(i, j));
            String t = str.substring(j+1, j+1+len);
            r.add(t);
            i = j + 1 + len;
        }

        return r;
    }
}
