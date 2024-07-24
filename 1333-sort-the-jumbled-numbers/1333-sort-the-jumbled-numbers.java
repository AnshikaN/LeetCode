class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int no: nums){
            int val = mappingValue(no, mapping);
            map.put(no, val);
        }
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(map.get(a), map.get(b)));

        for(int i = 0; i < nums.length; i++)
            nums[i] = arr[i];

        return nums;    
    }
    private int mappingValue(int no, int[] mapping){
        if(no == 0)
            return mapping[0];
            
        StringBuilder res = new StringBuilder();

        while(no > 0){
            int d = no%10;
            res.insert(0, mapping[d]);
            no /= 10;
        }

        return Integer.parseInt(res.toString());
    }
}