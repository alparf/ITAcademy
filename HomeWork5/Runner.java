package HomeWork5;

import static HomeWork5.Constants.FileConstant.*;

import HomeWork5.Search.EasySearch;
import HomeWork5.Search.RegExSearch;
import java.io.*;
import java.util.*;

public class Runner {

    public static void main(String[] args) {
        String absolutePath = new File("").getAbsolutePath();
        File file = new File(absolutePath + File.separator +
                CATALOG + File.separator + SOURCE + File.separator + FILE);
        Set<String> set = TxtFileReader.getWords(file);
        System.out.println("word counter: " + set.size());
        System.out.println(set);
        Map<String, Integer> map = TxtFileReader.getWordCounters(file);
        Map<Integer, StringBuilder> sortedMap = TxtFileReader.getTop(map);
        int counter = 0;
        System.out.print("\nTop 10 words: ");
        for(Integer amount: sortedMap.keySet()) {
            System.out.print(sortedMap.get(amount) + " = " + amount + " раз; ");
            counter++;
            if(counter >= 10) {
                break;
            }
        }
        String text = TxtFileReader.fileToString(file);
        System.out.println("\n\nEasySearch: ");
        EasySearch easySearch = new EasySearch();
        System.out.println("война = " + easySearch.search(text, "война"));
        System.out.println("\nRegExSearch: ");
        RegExSearch regExSearch = new RegExSearch();
        System.out.println("война = " + regExSearch.search(text, "война"));
        System.out.println("\nIgnore case search:");
        final String[] LOOKING_FOR = new String[] {"война", "и", "мир"};
        final int WAR = 0, AND = 1, PEACE = 2;
        System.out.println("\nEasySearch:");
        String lowerCaseText = text.toLowerCase();
        System.out.println("война = " + easySearch.search(lowerCaseText, LOOKING_FOR[WAR]));
        System.out.println("и = " + easySearch.search(lowerCaseText, LOOKING_FOR[AND]));
        System.out.println("мир = " + easySearch.search(lowerCaseText, LOOKING_FOR[PEACE]));
        System.out.println("\nRegExSearch:");
        System.out.println("война = " + regExSearch.search(lowerCaseText, LOOKING_FOR[WAR]));
        System.out.println("и = " + regExSearch.search(lowerCaseText, LOOKING_FOR[AND]));
        System.out.println("мир = " + regExSearch.search(lowerCaseText, LOOKING_FOR[PEACE]));
    }
}