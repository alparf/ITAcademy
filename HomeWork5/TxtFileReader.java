package HomeWork5;

import java.io.*;
import java.util.*;

import static HomeWork5.Constants.LineConstant.*;
import static HomeWork5.Constants.FileConstant.FILE_NOT_FOUND;

public class TxtFileReader {

    private static String punctuationMarkErase(String line) {
        for (char mark: PUNCTUATION_MARKS) {
            line = line.replace(mark, CHAR_SPACE);
        }
        return line;
    }

    public static Set<String> getWords(File file) throws FileNotFoundException {
        Set<String> setWords = new LinkedHashSet<>();
        if(file.exists() && file.isFile()) {
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader reader = new BufferedReader(fileReader)){
                String line;
                while ((line = reader.readLine()) != null) {
                    line = punctuationMarkErase(line);
                    String[] words = line.split(SPACE);
                    for(String word: words) {
                        if(!EMPTY_STRING.equals(word) && !DASH.equals(word)) {
                            setWords.add(word);
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new FileNotFoundException(FILE_NOT_FOUND);
        }
        return setWords;
    }

    public static Map<String, Integer> getWordCounters(File file) throws FileNotFoundException {
        Map<String, Integer> mapWords = new HashMap<>();
        if(file.exists() && file.isFile()) {
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader reader = new BufferedReader(fileReader)){
                String line;
                while ((line = reader.readLine()) != null) {
                    line = punctuationMarkErase(line);
                    String[] words = line.split(SPACE);
                    for(String word: words) {
                        if(!EMPTY_STRING.equals(word) && !DASH.equals(word)) {
                            if (mapWords.containsKey(word)) {
                                mapWords.put(word, mapWords.get(word) + 1);
                            } else {
                                mapWords.put(word, 1);
                            }
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new FileNotFoundException(FILE_NOT_FOUND);
        }
        return mapWords;
    }

    public static Map<Integer, StringBuilder> getTop(Map<String, Integer> map) {
        Map<Integer, StringBuilder> topMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int amount;
        for (String word: map.keySet()) {
            amount = map.get(word);
            if(topMap.containsKey(amount)) {
                topMap.put(amount, topMap.get(amount).append(", ").append(word));
            } else {
                topMap.put(amount, new StringBuilder(word));
            }
        }
        return topMap;
    }

    public static String fileToString(File file) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        if(file.exists() && file.isFile()) {
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader reader = new BufferedReader(fileReader)){
                String line;
                while ((line = reader.readLine()) != null) {
                    text.append(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new FileNotFoundException(FILE_NOT_FOUND);
        }
        return text.toString();
    }
}
