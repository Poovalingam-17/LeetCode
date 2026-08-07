class Solution {
    public static String swap(String s,int start,int end){
        char []arr = s.toCharArray();
        char ch = arr[start];
        arr[start] = arr[end];
        arr[end] = ch;
        return new String(arr);
    }
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        if(swap(s1,0,2).equals(s2)){
            return true;
        }
        if(swap(s1,1,3).equals(s2)){
            return true;
        }
        if(swap(swap(s1,0,2),1,3).equals(s2)){
            return true;
        }
        return false;
    }
}