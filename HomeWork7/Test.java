package HomeWork7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        printRate(Loaders.newABLoader());
    }

    public static void printRate(SiteLoader loader){
        List<String> rates = new LinkedList<>();
        rates.add(SiteLoader.Currency.EUR + " : " + loader.load(SiteLoader.Currency.EUR));
        rates.add(SiteLoader.Currency.RUB + " : " + loader.load(SiteLoader.Currency.RUB));
        rates.add(SiteLoader.Currency.USD + " : " + loader.load(SiteLoader.Currency.USD));
        for(String rate: rates) {
            System.out.println(rate);
        }
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter file path to save data or press \"Enter to save in root");
            System.out.print("File path: ");
            String filePath = scanner.nextLine();
            saveRate(filePath, rates);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid file path!");
        }
    }

    private static void saveRate(String filePath, List<String> lines) throws IOException {
        final String FILE_NAME = "Currency.txt";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("[dd.MM.yyyy]");
        String currentDate = simpleDateFormat.format(new Date());
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
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                for(String line: lines) {
                    fileWriter
                            .append(currentDate + " ").append(line)
                            .append(System.lineSeparator());
                }
            }
        }
    }
}
