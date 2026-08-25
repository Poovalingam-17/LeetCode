class Solution {
    public static boolean binarysearch(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int mul = k;
        while(true){
            if(!binarysearch(nums,k)){
                return k;
            }
            k+=mul;
        }
    }
}