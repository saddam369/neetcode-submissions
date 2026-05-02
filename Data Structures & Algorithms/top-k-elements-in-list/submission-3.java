class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res= new int[k];
        int count=0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry :map.entrySet()){

            if(entry.getValue()>1 && count<=k){
                res[count]=entry.getKey();
                count++;
            }
        }

        return res;
    }
}
