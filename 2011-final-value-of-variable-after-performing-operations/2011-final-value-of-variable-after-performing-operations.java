class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(int i=0;i<operations.length;i++){
            switch(operations[i]){
                case "++X":
                    ans+=1;
                    break;
                case "X++":
                    ans+=1;
                    break;
                case "--X":
                    ans-=1;
                    break;
                case "X--":
                    ans-=1;
                    break;
            }
        }
        return ans;
    }
}