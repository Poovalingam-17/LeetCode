class Solution {
    public int scoreOfString(String s) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add((int)s.charAt(i));
        }
        int res = 0;
        for(int i=0;i<list.size()-1;i++){
            res+=Math.abs(list.get(i)-list.get(i+1));
        }
        return res;
    }
}