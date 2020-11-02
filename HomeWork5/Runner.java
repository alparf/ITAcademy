package HomeWork5;

import static HomeWork5.Constants.FileConstant.*;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        String absolutePath = new File("").getAbsolutePath();
        File file = new File(absolutePath + File.separator +
                PATH[CATALOG] + File.separator +
                PATH[SOURCE] + File.separator +
                PATH[FILE]);
        Set<String> words = new TreeSet<>();
        if(file.exists() && file.isFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
