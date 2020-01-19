package puzzles;

/**
 * Created by ronim_000 on 8/4/2019.
 */
public class palindromeDetector {
    public boolean isPalindrome(String text){
        char[] content = text.toCharArray();
        int length=content.length;

        for (int i=0; i< length/2; i++){
            if(content[i]!=content[length-1-i]){
                return false;
            }
        }

        return true;
    }
}
