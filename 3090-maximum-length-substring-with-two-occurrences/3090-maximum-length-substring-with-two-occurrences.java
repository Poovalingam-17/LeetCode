class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int []fre = new int[26];
        int max = Integer.MIN_VALUE;
        for(int right =0;right<s.length();right++){
            fre[s.charAt(right)-'a']++;
            while(fre[s.charAt(right)-'a']>2){
                fre[s.charAt(left)-'a']--;
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}