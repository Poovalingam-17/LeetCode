class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[]=new int [26];
        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }
        boolean found=false;
        for(int i=0;i<=s2.length()-s1.length();i++){
            int freq1[]=new int[26];
            for(int j=i;j<s1.length()+i;j++){
                freq1[s2.charAt(j)-'a']++;
                if(Arrays.equals(freq,freq1)){
                       found=true;

                }
            }
        }
        return found;
    }
}