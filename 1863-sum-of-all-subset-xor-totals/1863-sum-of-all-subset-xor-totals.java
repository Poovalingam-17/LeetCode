class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<(1<<nums.length);i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        int res = 0;
        for(List<Integer> num : ans){
            int sum = 0;
            for(int i : num){
                sum^=i;
            }
            res+=sum;
        }
        return res;
    }
}