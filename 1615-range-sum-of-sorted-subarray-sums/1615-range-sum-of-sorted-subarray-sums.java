class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                ar.add(sum);
                //System.out.println(sum);
            }
        }
        Collections.sort(ar);  
        int s=0;
        int mod= (int) 1e9 + 7;
        for(int i=left-1;i<=right-1;i++){
            s=(s+ar.get(i))%mod;
        }
        return s;
    }
}