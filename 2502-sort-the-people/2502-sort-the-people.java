class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       int temp = 0;  
       int n=heights.length;
        String tempName;
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(heights[j-1] < heights[j]){  
                                 temp = heights[j-1];  
                                 tempName=names[j-1];
                                 heights[j-1] = heights[j]; 
                                 names[j-1]=names[j]; 
                                 heights[j] = temp;  
                                 names[j]=tempName;
                         }  
                          
                 }  
         }  
         return names; 
    }
}