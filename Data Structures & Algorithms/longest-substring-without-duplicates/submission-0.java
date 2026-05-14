class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (int l = 0, r = 0; r < s.length(); r++) {
            char curr = s.charAt(r);
            if (map.containsKey(curr)) {
                l = Math.max(l, map.get(curr) + 1);
            }
            map.put(curr, r);
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
