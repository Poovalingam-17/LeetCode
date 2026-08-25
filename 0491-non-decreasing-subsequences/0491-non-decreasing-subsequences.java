class Solution {
    public static void backtrack(int []arr, int ind, List<Integer>list, List<List<Integer>> res, Set<List<Integer>> set){
        if(ind>=arr.length){
            if(list.size()>=2){
                List<Integer> temp = new ArrayList<>(list);
                if(set.add(temp)){
                    res.add(temp);
                }
            }
            return;
        }
        if(list.size()==0 || list.get(list.size()-1)<=arr[ind]){
            list.add(arr[ind]);
            backtrack(arr,ind+1,list,res,set);
            list.remove(list.size()-1);
        }
        backtrack(arr,ind+1,list,res,set);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        backtrack(nums,0,list,res,set);
        return res;
    }
}