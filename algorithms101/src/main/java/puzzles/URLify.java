package puzzles;

/**
 * Created by ronim_000 on 7/30/2019.
 */
public class URLify {
    public static void main(String[] args){
        URLify urlEncoder = new URLify();

        System.out.println(("My%20Home%20Page").equals(urlEncoder.encodeUrl("My Home Page  ")));
        System.out.println(("My%20Home%20Page").equals(urlEncoder.encodeUrl2("My Home Page  ")));
    }

    public String encodeUrl(String str){
        return str.trim().replace(" ", "%20");
    }

    public String encodeUrl2(String str){
        int countOfWhitespaces =0;

        for (int i=0; i<str.trim().length(); i++){
            if (str.trim().charAt(i)==' '){
                countOfWhitespaces++;
            }
        }
        int lengthOfEncodedURL = str.trim().length() + 2*countOfWhitespaces;
        char[] encodedUrlAsArray = new char[lengthOfEncodedURL];

        int pointer=0;

        for (int j=0; j<str.trim().length(); j++){
            if (str.trim().charAt(j)==' '){
                encodedUrlAsArray[pointer]='%';
                encodedUrlAsArray[pointer+1]='2';
                encodedUrlAsArray[pointer+2]='0';
                pointer +=3;
            }
            else{
                encodedUrlAsArray[pointer]=str.trim().charAt(j);
                pointer +=1;
            }
        }

        return new String(encodedUrlAsArray);
    }
}


