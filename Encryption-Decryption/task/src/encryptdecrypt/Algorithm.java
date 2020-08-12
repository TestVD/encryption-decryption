package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

abstract class Algorithm {
    private String abcSmall = "abcdefghijklmnopqrstuvwxyz";

    public String getAbcSmall() {
        return abcSmall;
    }

    abstract char[] encryptAlgorithm(char[] messageArray, int key);

    abstract char[] decryptAlgorithm(char[] messageArray, int key);

    public void encrypt (String message, String inFile, String outFile, int key) throws IOException {
        char[] messageArray = message.toCharArray();
        char[] newMessageArray;

        if (!message.isEmpty()) {
            newMessageArray = encryptAlgorithm(messageArray, key);
        } else {
            messageArray = new String(Files.readAllBytes(Path.of(inFile))).toCharArray();
            newMessageArray = encryptAlgorithm(messageArray, key);
        }

        if (outFile.isEmpty()) {
            System.out.println(String.valueOf(newMessageArray));
        } else {
            writeFile(outFile, String.valueOf(newMessageArray));
        }
    }

    public void decrypt (String message, String inFile, String outFile, int key) throws IOException {
        char[] messageArray = message.toCharArray();
        char[] newMessageArray;

        if (!message.isEmpty()) {
            newMessageArray = decryptAlgorithm(messageArray, key);
        } else {
            messageArray = new String(Files.readAllBytes(Path.of(inFile))).toCharArray();
            newMessageArray = decryptAlgorithm(messageArray, key);
        }

        if (outFile.isEmpty()) {
            System.out.println(String.valueOf(newMessageArray));
        } else {
            writeFile(outFile, String.valueOf(newMessageArray));
        }
    }

    public void writeFile(String file, String message) {
        File fileOut = new File(file);
        try (FileWriter writer = new FileWriter(fileOut)) {
            writer.write(String.valueOf(message));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
