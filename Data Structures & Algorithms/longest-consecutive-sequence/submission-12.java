class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int init = 0;
        int count = 0;
        int max=0;
        for (int val : set) {
            int streak=0, curr = val;
            while(set.contains(curr)){
                streak++;
                curr++;
            }
            max = Math.max(max, streak);
        }

        return max;
    }
}
