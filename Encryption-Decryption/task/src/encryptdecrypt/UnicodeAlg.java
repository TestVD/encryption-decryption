package encryptdecrypt;

class UnicodeAlg extends Algorithm {
    @Override
    public char[] encryptAlgorithm(char[] messageArray, int key) {
        for (int i = 0; i < messageArray.length; i++) {
            messageArray[i] = (char) (messageArray[i] + key);
        }
        return messageArray;
    }

    @Override
    public char[] decryptAlgorithm(char[] messageArray, int key) {
        for (int i = 0; i < messageArray.length; i++) {
            messageArray[i] = (char) (messageArray[i] - key);
        }
        return messageArray;
    }
}
