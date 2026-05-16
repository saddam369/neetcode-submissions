class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int p = getPivot(nums, l, r);
        int e = bs(nums, l, p, target);
        if(e==-1){
            e=bs(nums, p+1, r, target);
        }

        return e;
    }

    private static int getPivot(int[] arr, int l, int r){
        while(l<=r){
            int m = (r+l)/2;
            if(l==r){
             return 0;
            }
            else if(arr[m] > arr[m+1]){
                return m;
            }else if(arr[m]<arr[m-1]){
                return m-1;
            }else if(arr[m]>arr[l]){
                l = m+1;
            }else{
                r=m-1;
            }
        }
    return -1;
    }

    private int bs(int[] arr, int l, int r, int target){
        while(l<=r){
            int m = (r+l)/2;
            if(arr[m]>target){
                r=m-1;
            }else if(arr[m]<target){
                l=m+1;
            }else{
                return m;
            }
        }

        return -1;
    }
}
