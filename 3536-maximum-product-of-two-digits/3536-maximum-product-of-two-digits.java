class Solution {
    public int maxProduct(int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        while(n!=0){
            int r = n%10;
            if(first<=r){
                second = first;
                first = r;
            }
            if(second<r && first!=r){
                second = r;
            }
            n/=10;
        }
        return first*second;
    }
}