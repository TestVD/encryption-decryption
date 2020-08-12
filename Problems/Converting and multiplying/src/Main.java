import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            try {
                if (Integer.parseInt(s) == 0) {
                    break;}
                System.out.println(Integer.parseInt(s) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + s);
            }
        }

       /*String path = "/Users/vlada/Downloads/dataset_91007.txt";
       int max = 0;
        try {
            String numbers = new String(Files.readAllBytes(Path.of(path)));
            String[] newS = numbers.split(" ");
            for (int i = 0; i < newS.length; i++) {
                if (Integer.parseInt(newS[i]) > max) {
                    max = Integer.parseInt(newS[i]);
                }
            }
            System.out.println(max);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       /*File file = new File("/Users/vlada/Downloads/dataset_91069.txt");
       int year = 0;
        long prev = 0;
        long diff = 0;
       try (Scanner scanner = new Scanner(file)) {
           while (scanner.hasNext()) {
               String string = scanner.nextLine();
               String[] values = string.split("\\s+");
               try {
                   long population = Long.parseLong(values[1].replace(",",""));
                   if (prev != 0) {
                       if (population - prev > diff) {
                           diff = population - prev;
                           year = Integer.parseInt(values[0]);

                       }
                   }
                   prev = population;
               } catch (NumberFormatException e) {
                   continue;
               }
           }
           System.out.println(year);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }*/
    }
}