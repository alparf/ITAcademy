package HomeWork6;

import java.io.*;

public class TxtFileReader {
    private static int getLineCounter(File file) {
        int lineCounter = 0;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while(bufferedReader.readLine() != null) {
                lineCounter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineCounter;
    }

    private static void initStringBuilderArray(StringBuilder[] stringBuilder) {
        for(int i = 0; i < stringBuilder.length; i++) {
            stringBuilder[i] = new StringBuilder();
        }
    }

    public static StringBuilder[] fileToStringArray(File file, int parts) {
        StringBuilder[] text = new StringBuilder[parts];
        initStringBuilderArray(text);
        int partIndex = 0;
        if(file.exists() && file.isFile()) {
            int step = getLineCounter(file) / parts;
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line;
                while (partIndex < parts - 1) {
                    partIndex++;
                }
                while ((line = bufferedReader.readLine()) != null) {
                    text[partIndex].append(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return text;
    }
}
