class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int n:nums){
            pq.add(n);
        }
        int k=0;
        int num=0;
        while(!pq.isEmpty()){
            if(pq.peek()==num){
                pq.poll();
            }
            else{
                num=pq.poll();
                k++;
            }
        }
        return k;
    }
}