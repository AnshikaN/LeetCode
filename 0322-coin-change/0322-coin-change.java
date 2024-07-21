class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int ans=helper(coins,amount,dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
    public int helper(int[] coins, int amount, int dp[]){
        if(amount==0){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(amount-coins[i]>=0){
            int subAns=0;
            if(dp[amount-coins[i]]!=-1){
                subAns=dp[amount-coins[i]];
            }
            else{
                subAns=helper(coins,amount-coins[i],dp);
            }
            if(subAns!=Integer.MAX_VALUE&& subAns+1<ans){
                ans=subAns+1;
            }
        }
        }
        dp[amount]=ans;
        return ans;
    }
}