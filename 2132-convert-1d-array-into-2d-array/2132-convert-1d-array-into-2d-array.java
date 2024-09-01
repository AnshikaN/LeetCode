class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int arr[][]=new int[m][n];
        int emp[][]=new int[0][0];

        // if((m==1&&n==1&&original.length==2)||original.length<m*n){
        //     return emp ;
        // }
        if(m*n!=original.length){
            return emp;
        }
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[k];
                k++;
            }
        }
        return arr;
    }
}