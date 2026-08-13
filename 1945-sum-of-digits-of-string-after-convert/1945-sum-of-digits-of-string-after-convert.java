class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            sb.append((int)(c-'a'+1));
        }
        int res = 0;
        for(int i=0;i<k;i++){
            int sum = 0;
            for(int j=0;j<sb.length();j++){
                sum+=Integer.parseInt(sb.charAt(j)+"");
            }
            res = sum;
            sb.setLength(0);
            sb.append(sum);
        }
        return res;
    }
}