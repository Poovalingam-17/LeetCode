class Solution {
    public static int same(List<Integer> list ,List<Integer> nums){
        for(int i=0;i<nums.size();i++){
            if(list.equals(nums)){
                return i;
            }
            nums.add(0,nums.remove(nums.size()-1));
        }
        return -1;
    }
    public int minimumRightShifts(List<Integer> nums) {
        List<Integer> list = new ArrayList<>(nums);
        Collections.sort(list);
       // return same(list,new ArrayList<>(nums));
        return same(list,nums);
    }
}