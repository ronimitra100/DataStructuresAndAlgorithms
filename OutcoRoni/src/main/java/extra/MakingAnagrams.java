package extra;

/**
 * Created by ronim_000 on 11/1/2019.
 *
 * Input : two strings
 * Output : integer
 *
 * Examples :
 * abTgfba, tTgHjb -> 7
 * aBcc, cBt->3
 *
 * Time : O(N+M), Space : O(1)
 *
 * Assumptions : both strings will only contains alpha characters
 */


public class MakingAnagrams {

    public static void main(String[] args){
        MakingAnagrams makingAnagrams = new MakingAnagrams();
        System.out.println(makingAnagrams.numberOfLettersThatNeedToBeRemovedToMakeAnagrams("abTgfba", "tTgHjb"));
        System.out.println(makingAnagrams.numberOfLettersThatNeedToBeRemovedToMakeAnagrams("aBcc", "cBt"));

        System.out.println(makingAnagrams.numberOfLettersThatNeedToBeRemovedToMakeAnagrams("aBcc", ""));
        System.out.println(makingAnagrams.numberOfLettersThatNeedToBeRemovedToMakeAnagrams("aBcc", null));
    }

    public int numberOfLettersThatNeedToBeRemovedToMakeAnagrams(String str1, String str2){
        int res = 0;
        //edge cases : null & empty
        if (str1==null&&str2==null){
            return 0;
        }
        if (str1 == null || str1.length()==0) {
            return str2.length();
        }
        if (str2==null || str2.length()==0){
            return str1.length();
        }

        //general case : string lengths at least 1 : sum of the frequency differences of each letter in the two strings
        int[] charFreqOfStr1= getCharFreq(str1);
        int[] charFreqOfStr2 = getCharFreq(str2);

        for (int i=0; i<26; i++ ){
            res +=Math.abs(charFreqOfStr1[i]- charFreqOfStr2[i]);
        }

        return res;
    }


    public int[] getCharFreq(String str){
      int[] res= new int[26];
      String s = str.toLowerCase();
      for (char c : s.toCharArray()){
          res[c-'a']++;
      }
      return res;
    }
}
