class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else if(!st.isEmpty()){
                char pop = st.pop();
                if(s.charAt(i) == ')' && pop != '(' ||
                s.charAt(i) == '}' && pop != '{' ||
                s.charAt(i) == ']' && pop != '['
                ){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
