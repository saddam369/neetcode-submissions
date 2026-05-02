class Solution {

    public String encode(List<String> strs) {
       StringBuilder res = new StringBuilder();
        for(String s:strs){
            res.append(s);
            res.append(" ");
        }

        return res.toString().trim();
    }

    public List<String> decode(String str) {
         String[] arr = str.split(" ");
         List<String> list = new ArrayList<>();
         for(String s:arr){
           list.add(s);
         }

         return list;
    }
}
