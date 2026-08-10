class Solution {
    public static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean completePrime(int num) {
        String s = String.valueOf(num);
        for(int i=1;i<s.length();i++){
            if(!prime(Integer.parseInt(s.substring(0,i)))){
                return false;
            }
        }
        for(int i=0;i<s.length();i++){
            if(!prime(Integer.parseInt(s.substring(i)))){
                return false;
            }
        }
        return true;
    }
}