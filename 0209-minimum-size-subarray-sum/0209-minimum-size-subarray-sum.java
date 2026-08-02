class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count=nums.length;
        boolean found=false;
         int sum=0;
         int l=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           while(sum>=target){
            found=true;
            count=Math.min(count,i-l+1);
            sum-=nums[l];
             l++;
           }
            
            
        }
       return found?count:0;
       
    }
}