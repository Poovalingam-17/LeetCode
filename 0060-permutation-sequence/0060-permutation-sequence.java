class Solution {
    static int count = 0;
    static String ans = "";
    public static void Permutation(char []arr,StringBuilder sb,boolean []seen,int k){
        if(!ans.isEmpty()){
            return;
        }
        if(sb.length()==arr.length){
            count++;
            if(count==k){
                ans = sb.toString();
            }
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!seen[i]){
                seen[i]=true;
                sb.append(arr[i]);
                Permutation(arr,sb,seen,k);
                seen[i]=false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    public String getPermutation(int n, int k) {
        count = 0;
        ans = "";
        char []arr = new char[n];
        boolean []seen = new boolean[n];
        for(int i=0;i<n;i++){
            arr[i] = (char)('1'+i);
        }
        Permutation(arr,new StringBuilder (),seen,k);
        return ans;
    }
}