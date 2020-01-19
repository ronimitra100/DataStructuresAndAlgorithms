package puzzles;

/**
 * Created by ronim_000 on 7/31/2019.
 */
public class OneAway {

    public static void main(String[] args){
        OneAway oneAwayDetector = new OneAway();

        System.out.println(oneAwayDetector.oneAway("pale", "pal"));
        System.out.println(oneAwayDetector.oneAway("ball", "bald"));
        System.out.println(oneAwayDetector.oneAway("bald", "bad"));
        System.out.println(oneAwayDetector.oneAway("bale", "mile"));
        System.out.println(oneAwayDetector.oneAway("bale", "turning"));
    }

    public boolean oneAway(String str1, String str2){
        if (Math.abs(str1.length() - str2.length()) > 1){
            return false;
        }
        else if (str1.length() == str2.length()){
            return isOneReplaceAway(str1, str2);
        }
        else if (str1.length() == str2.length() +1){
            return isOneInsertAway(str1, str2);
        }
        else if (str2.length() == str1.length() +1){
            return isOneInsertAway(str2, str1);
        }


        return true;
    }

    public boolean isOneInsertAway(String longerString, String shorterString){
        int i=0;
        int j=0;

        while(i<longerString.length() && j<shorterString.length()){
            if (longerString.charAt(i)!=shorterString.charAt(j)){
                if (i!=j){
                    return false;
                }
                i++;
            }
            else{
                i++;
                j++;
            }
        }
        return true;
    }

    public boolean isOneReplaceAway(String s1, String s2){
        int i=0;
        int j=0;

        boolean foundDifference = false;
        while(i<s1.length() && j<s2.length()){
            if (s1.charAt(i)!=s2.charAt(j)){
                if(foundDifference){
                    return false;
                }
                foundDifference=true;

            }
            i++;
            j++;
        }
        return true;
    }
}
