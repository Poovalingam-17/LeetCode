class Solution {
    public boolean scoreBalance(String s) {
        int preSum = 0;
        for(int i=0;i<s.length();i++){
            preSum+=s.charAt(i)-96;
        }
        int sufSum = 0;
        for(int i=s.length()-1;i>=0;i--){
            preSum-=s.charAt(i)-96;
            sufSum+=s.charAt(i)-96;
            if(preSum==sufSum){
                return true;
            }
        }
        return false;
    }
}