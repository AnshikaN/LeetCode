class Solution {
    class Pair{
        int num;
        int freq;
        Pair(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.freq==b.freq?b.num-a.num:a.freq-b.freq);
        for(int i:map.keySet()){
            pq.add(new Pair(i,map.get(i)));
        }
        int arr[]=new int[nums.length];
        int j=0;
        while(!pq.isEmpty()){
            int n=pq.peek().num;
            int f=pq.peek().freq;
            pq.poll();
            for(int i=0;i<f;i++){
                arr[j]=n;
                j++;
            }
        }
        return arr;
    }
}