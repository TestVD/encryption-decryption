package encryptdecrypt;

class ShiftingAlg extends Algorithm {
    @Override
    public char[] encryptAlgorithm(char[] messageArray, int key) {
        for (int i = 0; i < messageArray.length; i++) {
            if (getAbcSmall().contains(String.valueOf(messageArray[i]))) {
                int originalPosition = messageArray[i] - 'a';
                int newPosition = (originalPosition + key) % 26;
                messageArray[i] = (char) ('a' + newPosition);
            }
        }
        return messageArray;
    }

    @Override
    public char[] decryptAlgorithm(char[] messageArray, int key) {
        for (int i = 0; i < messageArray.length; i++) {
            if (getAbcSmall().contains(String.valueOf(messageArray[i]))) {
                int originalPosition = messageArray[i] - 'a';
                int newPosition = (26 + originalPosition - key) % 26;
                messageArray[i] = (char) ('a' + newPosition);
            }
        }
        return messageArray;
    }
}

