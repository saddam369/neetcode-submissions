class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res= new int[k];
        int count=0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> list = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                //.limit(k)
                .map(Map.Entry::getKey)
                .toList();

        for(int i=0; i<k; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
