package HomeWork7.Dao;

import HomeWork7.Beans.Rate;
import HomeWork7.interfaces.IRateDAO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class RateFile implements IRateDAO {
    @Override
    public void save(List<Rate> rates) {
        final String FILE_NAME = "Currency.txt";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter file path to save data or press \"Enter to save in root");
            System.out.print("File path: ");
            String filePath = scanner.nextLine();
            File file;
            SimpleDateFormat dateFormat = new SimpleDateFormat("[dd.MM.yyyy]");
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
                    for(Rate rate: rates) {
                        fileWriter
                                .append(dateFormat.format(rate.getDate()))
                                .append(" " + rate.getCurrency().toString())
                                .append(" " + rate.getValue())
                                .append(System.lineSeparator());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid file path!");
        }
    }
}
