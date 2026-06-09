class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> bmap = new HashMap<>();

        for(String s: strs){
            HashMap<Character, Integer> fmap = new HashMap<>();
            for(int i = 0;i<s.length(); i++){
                char c = s.charAt(i);
                 fmap.put(c, fmap.getOrDefault(c, 0)+1);
            }

            if(!bmap.containsKey(fmap)){
                List<String> list = new ArrayList<>();
                list.add(s);
                bmap.put(fmap, list);
            }else{
                List<String> list = bmap.get(fmap);
                list.add(s);
            }
  
        }
        List<List<String>> res = new ArrayList<>();

            for(List<String> l:bmap.values()){
                res.add(l);
            }
         return res;
    }
}
