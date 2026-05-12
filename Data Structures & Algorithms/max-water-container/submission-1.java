class Solution {
    public int maxArea(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int maxArea = 0;
        int area=0;
        while(l<r){
            area=Math.min(arr[l], arr[r])*(r-l);
            if(area>maxArea){
              maxArea=area;
            }
             if(arr[l]<arr[r]){
                l++;
             }else{
                r--;
             }
        }

        return maxArea;
    }
}
