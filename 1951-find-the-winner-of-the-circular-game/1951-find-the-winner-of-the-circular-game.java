class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer>queue=new LinkedList<>();
        int count=1;
        for(int i=1;i<=n;i++){
            if(k==1){
                return n;
            }
             if(count==k&&k!=1){
                count=1;
            }
            else if(count!=k+1){
                queue.add(i);
                count++;
            }
            
        }
        while (queue.size()!=1){
            
                if(count==k&&k!=1){
                count=1;
                queue.remove();
            }
            else if(count!=k+1){
                queue.add(queue.remove());
                count++;
            }
            
        }
        return queue.remove();
    }
}