class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(count(i)+count(j)==turnedOn){
                    list.add(i+":"+(j<10?"0" : "")+j);
                }
            }
        }
        return list;
    }
    public static int count(int n){
        int count = 0;
        while(n!=0){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        return count;
    }
}