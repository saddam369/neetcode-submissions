class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(Integer n: nums){
            set.add(n);
        }

        int max =0;
        
        for(Integer n: nums){
           if(set.contains(n-1)) continue;
           int val = n+1;
            int temp = 1;
           while(true){
                if(set.contains(val)) {
                    val++;
                    temp++;
                }else{
                    max = Math.max(max, temp);
                    break;
                }
           }
        }

        return max;
    }
}