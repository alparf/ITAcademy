package HomeWork7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        printRates(Loaders.newNBRBLoader());
    }

    public static void printRates(SiteLoader loader){
        String currencyEur = SiteLoader.Currency.EUR + " : " + loader.load(SiteLoader.Currency.EUR);
        String currencyRub = SiteLoader.Currency.RUB + " : " + loader.load(SiteLoader.Currency.RUB);
        String currencyUsd = SiteLoader.Currency.USD + " : " + loader.load(SiteLoader.Currency.USD);
        System.out.println(currencyEur);
        System.out.println(currencyRub);
        System.out.println(currencyUsd);
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
                            .append(currencyEur)
                            .append(System.lineSeparator())
                            .append(currencyRub)
                            .append(System.lineSeparator())
                            .append(currencyUsd)
                            .append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid file path!");
        }
    }
}
