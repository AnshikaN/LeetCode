class Solution {
    public int[] sortArray(int[] nums) {
        int low=0;
        int high=nums.length-1;
        return sort(nums,low,high);
    }
    public int[] sort(int[]nums,int low,int high){
        if(low>=high){
            return nums;
        }
        int s =low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=nums[m];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        sort(nums,low,e);
        sort(nums,s,high);
        return nums;
    }
}