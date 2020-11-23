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

    public static String[] fileToStringArray(File file, int parts) throws IllegalArgumentException {
        if(parts <= 0) {
            throw new IllegalArgumentException();
        }
        String[] text = new String[parts];
        StringBuilder partOfText = new StringBuilder();
        int partIndex = 0;
        if(file.exists() && file.isFile()) {
            int step = getLineCounter(file) / parts;
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line;
                while (partIndex < parts - 1) {
                    for(int i = 0; i < step; i++) {
                        partOfText.append(bufferedReader.readLine());
                    }
                    text[partIndex] = partOfText.toString();
                    partOfText.setLength(0);
                    partIndex++;
                }
                while ((line = bufferedReader.readLine()) != null) {
                    partOfText.append(line);
                }
                text[partIndex] = partOfText.toString();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return text;
    }
}
