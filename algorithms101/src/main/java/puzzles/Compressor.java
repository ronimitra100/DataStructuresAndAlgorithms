package puzzles;

/**
 * Created by ronim_000 on 8/1/2019.
 */
public class Compressor {

    public static void main(String[] args){
        Compressor comp = new Compressor();
        System.out.println(comp.compress("a"));
        System.out.println(comp.compress("ab"));
        System.out.println(comp.compress("abbcddde"));
        System.out.println(comp.compress("abbcdddeeeeeer"));
    }

    public String compress(String str){
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for (int i=0; i< str.length(); i++){
            count++;
            if (i+1>=str.length() || str.charAt(i)!=str.charAt(i+1)){
                if (count==1){
                    compressed.append(str.charAt(i));
                }
                else{
                    compressed.append(str.charAt(i)).append(count);
                }
                count=0;
            }

        }

        return compressed.length()<str.length()? compressed.toString() :str;

    }
}
