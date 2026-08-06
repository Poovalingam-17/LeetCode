class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int start = -1;
        int min = Integer.MAX_VALUE;
        int []fre = new int [256];
        for(int i=0;i<t.length();i++){
            fre[t.charAt(i)]++;
        }
        int count = 0;
        while(right<s.length()){
            if(fre[s.charAt(right)]>0){
                count++;
            }
            fre[s.charAt(right)]--;
            while(count==t.length()){
                if(right-left+1<min){
                    min = right-left+1;
                    start = left;
                }
                fre[s.charAt(left)]++;
                if(fre[s.charAt(left)]>0){
                    count--;
                }
                left++;
            }
            right++;
        }
        if(start==-1){
            return "";
        }
        return s.substring(start,start+min);
    }
}