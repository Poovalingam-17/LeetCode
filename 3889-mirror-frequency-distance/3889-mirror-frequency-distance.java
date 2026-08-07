class Solution {
    public int mirrorFrequency(String s) {
        int []fre = new int[256];
        int ans = 0;
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)]++;
        }
        boolean []visit = new boolean[256];
        for(char ch : s.toCharArray()){
            char mir;
            if(visit[ch]){
                continue;
            }
            if(Character.isLowerCase(ch)){
                mir = (char)('a'+'z'-ch);
            }
            else{
                mir = (char)('0'+'9'-ch);
            }
            ans+=Math.abs(fre[ch]-fre[mir]);
            visit[ch]=true;
            visit[mir]=true;
        }
        return ans;
    }
}