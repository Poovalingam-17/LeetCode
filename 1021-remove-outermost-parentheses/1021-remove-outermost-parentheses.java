class Solution {
    public String removeOuterParentheses(String s) {
        int ope = 0;
        int clo = 0;
        StringBuilder sb = new StringBuilder();
        String res = "";
        for(char ch : s.toCharArray()){
            sb.append(ch);
            if(ch=='('){
                ope++;
            }
            else{
                clo++;
            }
            if(ope==clo && ope!=0 && clo!=0){
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length()-1);
                ope = 0;
                clo = 0;
                res+=sb.toString();
                sb.setLength(0);
            }
        }
        return res;
    }
}