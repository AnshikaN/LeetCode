class Solution {
    public int findMinDifference(List<String> timePoints) {
        PriorityQueue<Integer>arr=new PriorityQueue<>();
        ArrayList<Integer>ar=new ArrayList<>();
       // boolean f=false;
        for(int i=0;i<timePoints.size();i++){
           arr.add(Integer.valueOf(timePoints.get(i).substring(0,2))*60+Integer.valueOf(timePoints.get(i).substring(3)));
            // if(Integer.valueOf(timePoints.get(i).substring(0,2))==0){
            //      arr.add(24*60+Integer.valueOf(timePoints.get(i).substring(3)));
            // }
          //  
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int f=arr.poll();
        //ar.add(f);
        int x=f;
        int s=f;
        System.out.println(f);
        while(!arr.isEmpty()){
             s=arr.poll();
            ar.add(s);
            System.out.println(s);
            pq.add(s-f);
            f=s;
        }
        pq.add((24*60)-(s-x));
        // for(int i=0;i<ar.size();i++){
        //     pq.add(ar.get(ar.size()-1)+)
        // }
        // if(f==true){
        //     pq.add(1440-arr[arr.length-1]);
        // }
    return pq.poll();
    }
}