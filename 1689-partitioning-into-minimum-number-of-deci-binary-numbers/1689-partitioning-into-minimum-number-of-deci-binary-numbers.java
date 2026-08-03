class Solution {
    public int minPartitions(String n) {
        int min = Integer.MIN_VALUE;
        for(char ch : n.toCharArray()){
            min = Math.max(min,Integer.parseInt(ch+""));
        }
        return min;
    }
}