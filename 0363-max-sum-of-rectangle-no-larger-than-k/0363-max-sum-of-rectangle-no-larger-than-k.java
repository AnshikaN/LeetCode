class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int R=matrix.length;
        int C=matrix[0].length;
        int sum[]=new int[R];
        int maxSum=Integer.MIN_VALUE;
        for(int cStart=0;cStart<C;cStart++){
            Arrays.fill(sum,0);
            for(int cEnd=cStart;cEnd<C;cEnd++){
                for(int row=0;row<R;row++){
                    sum[row]+=matrix[row][cEnd];
                }
                int currMaxSum=kadans(sum,k);
                maxSum=Math.max(maxSum,currMaxSum);
            }
        }
        return maxSum;
    }
    int kadans(int a[],int k){
        int size=a.length;
        int max_so_far=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
           int max_ending_here=0;
           for(int j=i;j<a.length;j++){
            max_ending_here+=a[j];
            if(max_ending_here<=k){
                max_so_far=Math.max(max_so_far,max_ending_here);
            }
        }
        }
    
        return max_so_far;
    }
}