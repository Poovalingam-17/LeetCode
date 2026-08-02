class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int freq[]=new int [26];
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            int freq1[]=new int[26];
            for(int j=i;j<i+p.length();j++){
                freq1[s.charAt(j)-'a']++;
                if(Arrays.equals(freq,freq1)){
                    list.add(i);
                }
            }
        }
        return list;
    }
}