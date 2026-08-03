class Solution {
    public int minBitFlips(int start, int goal) {
        String s1 = "";
        String s2 = "";
        while(start!=0||goal!=0){
            s1+=start%2;
            start/=2;
            s2+=goal%2;
            goal/=2;
        }
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        return count;
    }
}