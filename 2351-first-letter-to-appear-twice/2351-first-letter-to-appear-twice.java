class Solution {
    public char repeatedCharacter(String s) {
        int []fre = new int[26];
        for(char c : s.toCharArray()){
            fre[c-'a']++;
            if(fre[c-'a']>=2){
                return c;
            }
        }
        return ' ';
    }
}