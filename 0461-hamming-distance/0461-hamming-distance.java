class Solution {
    public int hammingDistance(int x, int y) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(x!=0 || y!=0){
            sb1.append(x%2);
            x/=2;
            sb2.append(y%2);
            y/=2;
        }
        String s1 = sb1.reverse().toString();
        String s2 = sb2.reverse().toString();
        int count = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        return count;
    }
}