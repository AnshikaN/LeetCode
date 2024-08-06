class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        int arr[]=new int[map.size()];
        int i=0;
        for(char key:map.keySet()){
            arr[i]=map.get(key);
            i++;
        }
        Arrays.sort(arr);
        int count=8;
        int ans=0;
        for(int j=arr.length-1;j>=0;j--){
           int n= count/8;
           ans=ans+(n*arr[j]);
           System.out.println(ans);
           count++;
        }
        return ans;
    }

}