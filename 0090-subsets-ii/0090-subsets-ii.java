class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<(1<<nums.length);i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    list.add(nums[j]);
                }
            }
            if(!res.contains(list)){
                res.add(list);
            }
        }
        return res;
    }
}