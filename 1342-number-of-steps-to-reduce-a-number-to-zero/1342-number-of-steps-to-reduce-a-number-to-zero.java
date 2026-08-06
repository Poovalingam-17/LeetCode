class Solution {
    public static int zero(int n,int step){
        if(n==0){
            return step;
        }
        if(n%2==0){
            return zero(n/2,step+1);
        }
        else{
            return zero(n-1,step+1);
        }
    }
    public int numberOfSteps(int num) {
        return zero(num,0);
    }
}