class Solution {
    public int minOperations(String[] logs) {
         Stack<String> stack = new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(!logs[i].equals("../")&& !logs[i].equals("./") )
            stack.push(logs[i]);
            else if (logs[i].equals("../")&&!stack.isEmpty())
            stack.pop();
        }
        return stack.size();

    }
}