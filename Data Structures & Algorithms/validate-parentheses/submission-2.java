class Solution {
    public boolean isValid(String s) {
        Stack<Character> st =new Stack<>();
        char[] c = s.toCharArray();
        for(int i =0; i<c.length; i++){
            if(c[i] == '(' || c[i] == '{' || c[i] == '['){
          st.push(c[i]);
            }else{
                if(st.isEmpty()) return false;

            if(st.peek() == '(' && c[i] == ')' || st.peek() == '{' && c[i] == '}' || st.peek() == '(' && c[i] == ')' || st.peek() == '[' && c[i] == ']'){
                st.pop();
            }else{
                return false;
            }

            }
        }
         if(!st.isEmpty()){
                return false;
            }
            return true;
    }
}
