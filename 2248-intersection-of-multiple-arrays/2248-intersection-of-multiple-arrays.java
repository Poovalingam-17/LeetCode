class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        int []fre = new int [10001];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                fre[nums[i][j]]++;
            }
        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]==nums.length){
                list.add(i);
            }
        }
        return list;
    }
}