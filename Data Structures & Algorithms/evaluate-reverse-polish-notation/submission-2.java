class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String operators="+-*/";

        for(String token : tokens){
            if(operators.contains(token)){
                int d1= st.pop();
                int d2= st.pop();
                int res=0;
                if(token.equals("+")){
                    res=d1+d2;

                }
                 else if (token.equals("-")){
                    res=d2-d1;
                    
                }
                else if(token.equals("*")){
                    res=d1*d2;
                    
                }
                else if(token.equals("/")){
                    res=d2/d1;
                    
                }
            st.push(res);
            }
            else{
                st.push(Integer.parseInt(token));
            }

        }
    return st.pop();
    }
}
