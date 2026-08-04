class Solution {
    public static void Permutation(int[]nums,List<List<Integer>> res,List<Integer> list,boolean[]arr){
        if(list.size()==nums.length && !res.contains(new ArrayList<>(list))){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!arr[i]){
                arr[i]=true;
                list.add(nums[i]);
                Permutation(nums,res,list,arr);
                arr[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean []arr = new boolean [nums.length];
        Permutation(nums,res,list,arr);
        return res;
    }
}