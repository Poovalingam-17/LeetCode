import java.util.*;
class Main {
    public static int score(int []arr){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=i;j<arr.length;j++){
                map.put(arr[j],map.getOrDefault(arr[j],0)+1);
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int num : map.values()){
                    max = Math.max(max,num);
                    min = Math.min(min,num);
                }
                ans = Math.max(ans,max-min);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = {3,4,1,3,2};
        System.out.println(score(arr));
    }
}
