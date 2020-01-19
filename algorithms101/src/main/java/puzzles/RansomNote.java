package puzzles;

import java.util.HashMap;

/**
 * Created by ronim_000 on 8/5/2019.
 */
public class RansomNote {
    public boolean canWrite(String note, String letters){
        String noteNoSpaces = note.replaceAll("\\s+", "");

        HashMap<String,Integer> noteMap = map(noteNoSpaces);
        HashMap<String,Integer> letterMap = map(letters);

        return canWriteRansom(noteMap, letterMap);
    }

    private HashMap<String,Integer> map(String text){
        HashMap<String,Integer> map = new HashMap<>();
        char[] characters = text.toCharArray();

        for (int i=0; i<characters.length; i++){
            String character =  String.valueOf(characters[i]);

            if (map.containsKey(character)){
                Integer currentCount = map.get(character);
                map.put(character,currentCount+1);
            }
            else{
                map.put(character, 1);
            }
        }
        return map;
    }

    public boolean canWriteRansom(HashMap<String,Integer> noteMap, HashMap<String,Integer> letterMap){
        for (String key: noteMap.keySet()){
            if(!letterMap.keySet().contains(key)){
                return false;
            }

            if(letterMap.get(key) <noteMap.get(key)){
                return false;
            }
        }
        return true;
    }
}
