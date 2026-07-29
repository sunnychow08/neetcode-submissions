class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        HashMap<Character,Character> closetoopen = new HashMap<>();
        closetoopen.put(')','(');
        closetoopen.put(']','[');
        closetoopen.put('}','{');
        for(char c : s.toCharArray()){
            if(closetoopen.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == closetoopen.get(c)){
                    stack.pop();
                } else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
        
    }
}
