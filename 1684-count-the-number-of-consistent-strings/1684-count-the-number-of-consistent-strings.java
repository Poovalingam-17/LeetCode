class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        for(String s : words){
            int count = 0;
            for(int i=0;i<s.length();i++){
                if(!allowed.contains(s.charAt(i)+"")){
                    break;
                }
                count++;
            }
            if(count==s.length()){
                res++;
            }
        }
        return res;
    }
}