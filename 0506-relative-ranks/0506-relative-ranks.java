class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i=0;i<score.length;i++){
            map1.put(score[i],i);
        }
        int []arr = score.clone();
        Arrays.sort(arr);
        int rank = score.length;
        for(int i : arr){
            map.put(i,rank);
            rank-=1;
        }
        int n = score.length;
        String []str = new String[score.length];
        for(int i=0;i<score.length;i++){
            if(map.get(score[i])==1){
                str[map1.get(score[i])]="Gold Medal";
            }
            else if(map.get(score[i])==2){
                str[map1.get(score[i])]="Silver Medal";
            }
            else if(map.get(score[i])==3){
                str[map1.get(score[i])]="Bronze Medal";
            }
            else{
                str[map1.get(score[i])]=String.valueOf(map.get(score[i]));
            }
        }
        return str;
    }
}