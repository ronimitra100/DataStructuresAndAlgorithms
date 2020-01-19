package extra;

/**
 * Created by ronim_000 on 10/27/2019.
 */
public class MakeAnagrams {

    public static void main(String[] args){
        MakeAnagrams makeAnagrams = new MakeAnagrams();
        System.out.println(makeAnagrams.numberOfCharChangesNeededToMakeAnagrams("aBcEaYZ","TceAy"));
        System.out.println(makeAnagrams.numberOfCharChangesNeededToMakeAnagrams("","TceAy"));
    }

    public static int numberOfCharChangesNeededToMakeAnagrams(String first, String second){
        if (first==null||first==""){
            return second.length();
        }

        if (second==null||second==""){
            return second.length();
        }
        int[] charCount1=getCharCounts(first.toLowerCase());
        int[] charCount2=getCharCounts(second.toLowerCase());
        return getDelta(charCount1, charCount2);
    }

    private static int getDelta(int[] charCount1, int[] charCount2) {
        if (charCount1.length!=charCount2.length || charCount1.length!=26 || charCount2.length!=26){
            return -1;
        }
        int count=0;
        for (int i=0; i<26; i++){
            count += Math.abs(charCount1[i]-charCount2[i]);
        }
        return count;
    }

    private static int[] getCharCounts(String str) {
        int[] charCounts = new int[26];
        for (int i=0; i<str.length(); i++){
            charCounts[(int)str.charAt(i)-(int)('a')]++;
        }
        return charCounts;
    }
}
