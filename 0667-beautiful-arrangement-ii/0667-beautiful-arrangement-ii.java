class Solution {
    public int[] constructArray(int n, int k) {
        int []arr = new int[n];
        int low = 1;
        int high = k+1;
        int num = k+2;
        int i=0;
        while(low<=high){
            arr[i++] = low++;
            if(low<=high){
                arr[i++] = high--;
            }
        }
        for(int j=i;j<arr.length;j++){
            arr[j] = num++;
        }
        return arr;
    }
}