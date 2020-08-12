package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        String operation = "enc";
        String message = "";
        String inFile = "";
        String outFile = "";
        int key = 0;
        String alg = "shift";

        EncoderDecoder encoderDecoder = new EncoderDecoder();

            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("-mode")) {
                    operation = args[i + 1];
                }
                if (args[i].equals("-in")) {
                    inFile = args[i + 1];
                }
                if (args[i].equals("-out")) {
                    outFile = args[i + 1];
                }
                if (args[i].equals("-key")) {
                    key = Integer.parseInt(args[i + 1]);
                }
                if (args[i].equals("-data")) {
                    message = args[i + 1];
                }
                if (args[i].equals("-alg")) {
                    alg = args[i + 1];
                }
            }

            if (alg.equals("shift")) {
                encoderDecoder.setMethod(new ShiftingAlg());
            } else {
                encoderDecoder.setMethod(new UnicodeAlg());
            }

            if (operation.equals("enc")) {
                encoderDecoder.encrypt(message, inFile, outFile, key);
            } else if (operation.equals("dec")) {
                encoderDecoder.decrypt(message, inFile, outFile, key);
            }
        }
}




