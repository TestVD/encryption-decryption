package encryptdecrypt;

import java.io.IOException;

class EncoderDecoder {
    private Algorithm method;

    public void setMethod(Algorithm method) {
        this.method = method;
    }

    public void encrypt(String message, String inFile, String outFile, int key){
        try {
            this.method.encrypt(message, inFile, outFile, key);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void decrypt(String message, String inFile, String outFile, int key) {
        try {
            this.method.decrypt(message, inFile, outFile, key);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
