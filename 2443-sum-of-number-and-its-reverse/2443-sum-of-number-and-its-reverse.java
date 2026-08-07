class Solution {
    public static int reverse(int n){
        int num = 0;
        while(n!=0){
            num*=10;
            num+=n%10;
            n/=10;
        }
        return num;
    }
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
        }
        for(int i=0;i<num;i++){
            if((i+reverse(i))==num){
                return true;
            }
        }
        return false;
    }
}