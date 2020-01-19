package puzzles;

/**
 * Created by ronim_000 on 8/5/2019.
 */
public class CeasarCipher {
    public static final String ALPHABET="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args){
        CeasarCipher ceasarCipher = new CeasarCipher();
        System.out.println(ceasarCipher.encrypt("RTVVBCR", 5));
        System.out.println(ceasarCipher.decrypt(ceasarCipher.encrypt("RTVVBCR", 5), 5));
        System.out.println(ceasarCipher.encrypt("RTVVBCR", 10));
        System.out.println(ceasarCipher.encrypt(ceasarCipher.encrypt("RTVVBCR", 10), 16));
    }


    public String encrypt(String plainText, int n){
        StringBuilder cipherText = new StringBuilder();

        for (int i=0; i<plainText.length(); i++){
            char charToEncrypt=plainText.charAt(i);
            char encryptedChar=' ';

            if(charToEncrypt!=' '){
                int indexOfCharToEncrypt = ALPHABET.indexOf(charToEncrypt);
                int indexOfEncryptedChar = (indexOfCharToEncrypt + 26 +n)%26;
                encryptedChar = ALPHABET.charAt(indexOfEncryptedChar);
            }

            cipherText.append(encryptedChar);

        }
        return cipherText.toString();
    }

    public String decrypt(String encryptedText, int n){
        return encrypt(encryptedText, -n);
    }
}
