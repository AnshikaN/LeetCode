class Solution {
    public String reverseParentheses(String s) {
        Stack<Character>st=new Stack<>();
        Queue<Character>queue=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                while(st.peek()!='('){
                    queue.add(st.pop());
                }
                st.pop();
                while(!queue.isEmpty()){
                    st.add(queue.remove());
                }
            }
            else{
                st.add(s.charAt(i));
            }
            
        }
        //String str1="";
        while(!st.isEmpty()){
            //str1=str1+st.pop();
            queue.add(st.pop());
        }
        
       String str="";
        while(!queue.isEmpty()){
            str=str+queue.remove();
        }
        StringBuilder str1
            = new StringBuilder(str);
        return str1.reverse().toString();
        
    }
}