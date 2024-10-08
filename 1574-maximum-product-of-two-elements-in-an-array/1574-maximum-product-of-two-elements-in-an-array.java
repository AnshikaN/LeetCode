class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a, b) -> b - a);
        for(int n:nums){
            pq.add(n);
        }
        int a=pq.poll();
        int b=pq.poll();
        return (a-1)*(b-1);
    }
}