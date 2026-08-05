import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "abbcac";
        int k = 1;
        int ans = 0;
        // HashSet<Character> set1 = new HashSet<>();
        // HashSet<Character> set2 = new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     set1.add(s.charAt(i));
        //     String str = s.substring(i+1);
        //     int j = 0;
        //     while(j<str.length()){
        //         set2.add(str.charAt(j));
        //         j++;
        //     }
        //     int count = 0;
        //     for(Character ch : set1){
        //         if(set2.contains(ch)){
        //             count++;
        //         }
        //     }
        //     if(count>k){
        //         ans++;
        //     }
        //     set2.clear();
        // }
        // System.out.println(ans);
        int []fre1 = new int[26];
        int []fre2 = new int[26];
        for(int i=0;i<s.length();i++){
            fre2[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            fre1[s.charAt(i)-'a']++;
            fre2[s.charAt(i)-'a']--;
            int count = 0;
            for(int j=0;j<26;j++){
                if(fre1[j]>0 && fre2[j]>0){
                    count++;
                }
            }
            if(count>k){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
