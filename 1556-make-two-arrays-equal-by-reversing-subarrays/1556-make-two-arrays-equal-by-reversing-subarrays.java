class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<target.length;i++){
             if(map.get(target[i])==null){
                return false;
            }

            if(map.get(target[i])==0){
                return false;
            }
            else{
                map.put(target[i],map.get(target[i])-1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)!=0){
                return false;
            }
        }
        return true;
    }
}