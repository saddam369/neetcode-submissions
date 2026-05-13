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
            if (count == 0 && !set.contains(val - 1)) {
                init = val;
                count++;
            } else if (set.contains(init + 1)) {
                init++;
                count++;
            } else {
                count = 0;
            }
           if(count>max){
            max=count;
           }

        }

        return max;
    }
}
