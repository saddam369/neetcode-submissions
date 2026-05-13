class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int i=0;
        int j=1;
        while(j<prices.length){
            if(prices[i]<prices[j]){
              max=Math.max(prices[j]-prices[i], max);
            } else{
                i=j;
            }
            j++;
        }
        

        return max;
    }
}
