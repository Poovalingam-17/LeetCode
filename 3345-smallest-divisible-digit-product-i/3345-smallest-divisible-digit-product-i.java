class Solution {
    public int smallestNumber(int n, int t) {
        int num = n;
        int product = 1;
        while(n!=0){
            product*=n%10;
            n/=10;
        }
        if(product%t==0){
            return num;
        }
        for(int i=num+1;i<=100;i++){
            product=1;
            n = i;
            while(n!=0){
            product*=n%10;
            n/=10;
        }
        if(product%t==0){
            return i;
         }
        }
        return -1;
    }
}