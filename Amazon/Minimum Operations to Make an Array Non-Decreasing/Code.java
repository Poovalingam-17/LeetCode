import java.util.*;
class Main {
    public static int find(int []arr){
        int count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                int dif = (int)Math.ceil((double)(arr[i-1]-arr[i])/3);
                arr[i]=arr[i-1]*dif;
                count+=dif;
            }
        }
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]>arr[i+1]){
        //         while(arr[i]>arr[i+1]){
        //             arr[i+1]+=3;
        //             count++;
        //         }
        //     }
        // }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,6,2};
        System.out.println(find(arr));
    }
}
