package HomeWork7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        printRates(new NBRBLoader());
    }

    public static void printRates(SiteLoader loader){
        final String FILE_NAME = "Currency.txt";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter file path to save data or press \"Enter to save in root");
            System.out.print("File path: ");
            String filePath = scanner.nextLine();
            File file;
            if(filePath.isEmpty()) {
                file = new File(FILE_NAME);
            } else {
                file = new File(filePath, FILE_NAME);
            }
            if(!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new IllegalArgumentException(filePath);
                }
            }
            if(file.exists() && file.isFile()) {
                try (FileWriter fileWriter = new FileWriter(file)) {
                    fileWriter
                            .append(SiteLoader.Currency.EUR + " : ")
                            .append(String.valueOf(loader.load(SiteLoader.Currency.EUR)))
                            .append(System.lineSeparator())
                            .append(SiteLoader.Currency.RUB + " : ")
                            .append(String.valueOf(loader.load(SiteLoader.Currency.RUB)))
                            .append(System.lineSeparator())
                            .append(SiteLoader.Currency.USD + " : ")
                            .append(String.valueOf(loader.load(SiteLoader.Currency.USD)))
                            .append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid file path!");
        }
        System.out.println(SiteLoader.Currency.EUR + " : " + loader.load(SiteLoader.Currency.EUR));
        System.out.println(SiteLoader.Currency.RUB + " : " + loader.load(SiteLoader.Currency.RUB));
        System.out.println(SiteLoader.Currency.USD + " : " + loader.load(SiteLoader.Currency.USD));
    }
}
