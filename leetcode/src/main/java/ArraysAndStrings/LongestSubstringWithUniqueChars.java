package ArraysAndStrings;

import java.util.HashMap;

/**
 * Created by ronim_000 on 8/17/2019.
 */
public class LongestSubstringWithUniqueChars {

    public static void main(String[] args){
        LongestSubstringWithUniqueChars longestSubstringWithUniqueChars = new LongestSubstringWithUniqueChars();
        System.out.println("Longest substring with unique characters : " + longestSubstringWithUniqueChars.getLongestSubstringWithUniqueChars("edgdfecsdfff"));
        System.out.println("Longest substring with unique characters in abcabcbb: " + longestSubstringWithUniqueChars.getLongestSubstringWithUniqueChars("abcabcbb"));
        System.out.println("Longest substring with unique characters in bbbbb: " + longestSubstringWithUniqueChars.getLongestSubstringWithUniqueChars("bbbbb"));
        System.out.println("Longest substring with unique characters in pwwkew: " + longestSubstringWithUniqueChars.getLongestSubstringWithUniqueChars("pwwkew"));
        System.out.println("Longest substring with unique characters in null: " + longestSubstringWithUniqueChars.getLongestSubstringWithUniqueChars(null));
        System.out.println("Longest substring with unique characters in empty string: " + longestSubstringWithUniqueChars.getLongestSubstringWithUniqueChars(""));
    }

    public String getLongestSubstringWithUniqueChars(String s) {
        if (s==null || s==""){
            return "";
        }

        int n = s.length();
        int i=0;
        int j=0;

        String result = "";


        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (i <n && j<n){
            String subStr = s.substring(i, j+1);

            if (j==n-1){
                map.put(subStr, (n-i));
                break;
            }
            if (subStr.contains(String.valueOf(s.charAt(j+1)))){
                map.put(subStr, (j-i+1));
                i=i+subStr.indexOf(s.charAt(j+1))+1;
            }
            j++;
        }

        int maxLength = 0;
        /*for (String subStr : map.keySet()){
            System.out.println(subStr +": " + map.get(subStr) );

            System.out.println("===========================");
        }*/
        for (String subStr : map.keySet()){

            //System.out.println(subStr +": " + map.get(subStr) );

            if (map.get(subStr) > maxLength){
                maxLength = map.get(subStr);
                result = subStr;
            }
        }

        return result;
    }

}
