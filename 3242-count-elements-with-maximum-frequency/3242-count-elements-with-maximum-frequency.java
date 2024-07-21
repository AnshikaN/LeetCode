class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max=0;
        int count=1;
        for(int key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                 count=1;
            }
            else if(map.get(key)==max){
                count++;
            }
        }
        return max*count;
    }
}