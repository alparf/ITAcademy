package HomeWork5;

import HomeWork5.Search.EasySearch;

import static HomeWork5.Constants.FileConstant.*;
import static HomeWork5.Constants.LineConstant.*;

import java.io.*;
import java.util.*;

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
        }
        return setWords;
    }

    private static Map<String, Integer> getWordCounters(File file) {
        Map<String, Integer> mapWords = new HashMap<>();
        if(file.exists() && file.isFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
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
        }
        return mapWords;
    }

    private static Map<Integer, StringBuilder> getTop(Map<String, Integer> map) {
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

    private static String fileToString(File file) {
        StringBuilder text = new StringBuilder();
        if(file.exists() && file.isFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while ((line = reader.readLine()) != null) {
                    text.append(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return text.toString();
    }

    public static void main(String[] args) {
        String absolutePath = new File("").getAbsolutePath();
        File file = new File(absolutePath + File.separator +
                CATALOG + File.separator + SOURCE + File.separator + FILE);
        Set<String> set = getWords(file);
        System.out.println("setWords size: " + set.size());
        System.out.println(set);
        Map<String, Integer> map = getWordCounters(file);
        Map<Integer, StringBuilder> sortedMap = getTop(map);
        int counter = 0;
        System.out.print("\nTop 10 words: ");
        for(Integer amount: sortedMap.keySet()) {
            System.out.print(sortedMap.get(amount) + " = " + amount + " раз; ");
            counter++;
            if(counter >= 10) {
                break;
            }
        }
        System.out.println("\n\nEasySearch:");
        String lookingFo = "он";
        System.out.println(lookingFo + " = " + new EasySearch().search(fileToString(file), lookingFo));
    }
}