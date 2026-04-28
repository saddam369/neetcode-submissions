class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res= new int[k];
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && count<k){
                res[count]=nums[i];
                count++;
            }
            map.put(nums[i],i);
        }

        return res;
    }
}
