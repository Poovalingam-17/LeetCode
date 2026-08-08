class Solution {
    public int countPoints(String rings) {
        int []blue = new int [10];
        int []red = new int [10];
        int []green = new int [10];
        for(int i=1;i<rings.length();i=i+2){
            char ch = rings.charAt(i-1);
            char c = rings.charAt(i);
            if(ch=='B'){
                blue[c-'0']++;
            }
            else if(ch=='G'){
                green[c-'0']++;
            }
            else{
                red[c-'0']++;
            }
        }
        int count = 0;
        for(int i=0;i<10;i++){
            if(green[i]>0 && red[i]>0 && blue[i]>0){
                count++;
            }
        }
        return count;
    }
}