package puzzles;

/**
 * Created by ronim_000 on 7/29/2019.
 */
public class UniqueCharacters {

    public static void main(String[] args){
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        System.out.println(" Does 'agsfs ty$E$%' have unique characters? : " + uniqueCharacters.isComposedOfUniqueCharacters("agsfs ty$E$%"));
        System.out.println(" Does 'agsfS ty$E?%' have unique characters? : " + uniqueCharacters.isComposedOfUniqueCharacters("agsfS ty$E?%"));
        System.out.println(" Does 'a' have unique characters? : " + uniqueCharacters.isComposedOfUniqueCharacters("a"));
        System.out.println(" Does ' ' have unique characters? : " + uniqueCharacters.isComposedOfUniqueCharacters(""));
        System.out.println(" Does null have unique characters? : " + uniqueCharacters.isComposedOfUniqueCharacters(null));
    }


    public boolean isComposedOfUniqueCharacters(String str){
        if (str==null||str.length()==0){
            return true;
        }

        if (str.length() > 128){
            return false;
        }

        boolean[] charSet = new boolean[128];
        for (int i=0; i< str.length(); i++){
            if (charSet[str.charAt(i)] == true){
                return false;
            }
            else{
                charSet[str.charAt(i)] = true;
            }
        }
        return true;
    }
}
