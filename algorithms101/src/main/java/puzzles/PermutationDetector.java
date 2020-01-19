package puzzles;

import java.util.Arrays;

/**
 * Created by ronim_000 on 7/30/2019.
 */
public class PermutationDetector {
    public static void main(String[] args){
        PermutationDetector detector = new PermutationDetector();
        System.out.println("The statement 'abca' and 'cbaa' are permutations is " + detector.isPermutation("abca", "cbaa"));
        System.out.println("The statement 'abca' and 'cba' are permutations is " + detector.isPermutation("abca", "cba"));
        System.out.println("The statement 'abca' and 'cbaA' are permutations is " + detector.isPermutation("abca", "cbaA"));
        System.out.println("The statement 'abcd% !cbaT' and 'Tcbcbdaa%! ' are permutations is " + detector.isPermutation("abcd% !cbaT", "Tcbcbdaa%! "));
    }

    public boolean isPermutation(String str1, String str2){
        if (str1==null && str2==null){
            return true;
        }

        if (str1.length()!=str2.length()){
            return false;
        }

        /*char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        String sortedStr1 = new String(str1Array);
        String sortedStr2 = new String(str2Array);

        return sortedStr1.equals(sortedStr2);*/
        return sort(str1).equals(sort(str2));
    }

    public String sort(String str){
        char[] strAsArray = str.toCharArray();
        Arrays.sort(strAsArray);
        return new String(strAsArray);
    }
}
