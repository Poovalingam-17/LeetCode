class Solution {
    public static boolean same(int[]arr1,int[]arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int []fre1 = new int[26];
        int []fre2 = new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        int win = s1.length();
        for(char ch : s1.toCharArray()){
            fre1[ch-'a']++;
        }
        for(int i=0;i<win;i++){
            fre2[s2.charAt(i)-'a']++;
        }
        if(same(fre1,fre2)){
            return true;
        }
        for(int i=win;i<s2.length();i++){
            fre2[s2.charAt(i)-'a']++;
            fre2[s2.charAt(i-win)-'a']--;
            if(same(fre1,fre2)){
                return true;
            }
        }
        return false;
    }
}