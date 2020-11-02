package HomeWork5;

import static HomeWork5.Constants.FileConstant.*;
import static HomeWork5.Constants.LineConstant.*;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class Runner {

    private static String punctuationMarkErase(String line) {
        for (char mark: PUNCTUATION_MARKS) {
            line = line.replace(mark, EMPTY_CHAR);
        }
        return line;
    }

    private static Set<String> getWords(File file) {
        Set<String> setWords = new LinkedHashSet<>();
        if(file.exists() && file.isFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while ((line = reader.readLine()) != null) {
                    line = punctuationMarkErase(line);
                    String[] words = line.split(SPACE);
                    for(String word: words) {
                        if(!EMPTY_STRING.equals(word)) {
                            setWords.add(word);
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return setWords;
    }

    public static void main(String[] args) {
        String absolutePath = new File("").getAbsolutePath();
        File file = new File(absolutePath + File.separator +
                CATALOG + File.separator + SOURCE + File.separator + FILE);
        Set<String> setWords = getWords(file);
        System.out.println("setWords size: " + setWords.size());
        for(String word: setWords) {
            System.out.println(word);
        }
    }
}
